package configuration;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;

import enums.OccupazionePostazioni;
import enums.Tipo;
import model.Edificio;
import model.Postazione;
import model.Prenotazione;
import model.Utente;


@Configuration
@PropertySource("classpath:application.properties")
public class ConfigurartionPrenotazioni {

	
	     @Autowired Edificio_Dao Edificio_InterfaceDao;
	 
	    @Autowired Utente_Dao Utente_InterfaceDao;
	
	    @Autowired Postazione_Dao Postazione_InterfaceDao;

@Bean("ParamsPostazione")
@Scope("prototype")
public Postazione postazioneCrea(String descrizionePostazione, Tipo tipo, Integer numMaxOccupanti,  Edificio edificio) {
		return new Postazione(null, descrizionePostazione, tipo, numMaxOccupanti, edificio);
	    }

@Bean("ParamsEdificio")
@Scope("prototype")
public Edificio edificioCrea(String nome, String indirizzo, String città, List<Postazione> listaPostazione) {
		return new Edificio(null, nome, indirizzo, città, listaPostazione);
	    }

@Bean("ParamsUtente")
@Scope("prototype")
public Utente utenteCrea(String cognome, String nome, String email) {
		return new Utente(null, cognome, nome, email);
	    }

@Bean("ParamsPrenotazione")
@Scope("prototype")
public Prenotazione prenotazioneCrea(Postazione postazione, OccupazionePostazioni occupazione, Date dataPrenotata, Utente utente) {
		return new Prenotazione(null, occupazione, postazione, dataPrenotata, utente);
	    }

@Bean("FakePrenotazione")
@Scope("prototype")
public Prenotazione fakePrenotazione() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		Prenotazione pre = new Prenotazione();
		int num = fake.number().numberBetween(1, 3);
		if (num == 1) {
		    pre.setOccupazione(OccupazionePostazioni.LIBERO);
		} else if (num == 2) {
		    pre.setOccupazione(OccupazionePostazioni.OCCUPATO);
		} else {
		    System.out.println("il palazzo va a fuoco scappate!!!");
		}
		Date startDate = java.sql.Date.valueOf("2020-01-01");
		Date endDate = java.sql.Date.valueOf("2022-01-01");
		pre.setDataPrenotata(fake.date().between(startDate, endDate));
		pre.setUtente(Utente_InterfaceDao.queryUtenteId1());
		pre.setPostazione(Postazione_InterfaceDao.queryPostazioneId1());
		return pre;
	    }

@Bean("FakePostazione")
@Scope("prototype")
public Postazione fakePostazione() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		Postazione p = new Postazione();
		p.setDescrizionePostazione(fake.company().name());
		p.setNumMaxOccupanti(fake.number().numberBetween(20, 40));
		int num = fake.number().numberBetween(1, 4);
		if (num == 1) {
		    p.setTipo(Tipo.OPENSPACE);
		} else if (num == 2) {
		    p.setTipo(Tipo.PRIVATO);
		} else if (num == 3) {
		    p.setTipo(Tipo.SALA_RIUNIONI);
		} else {
		    System.out.println("il palazzo va a fuoco scappate!!!");
		}
		p.setEdificio(Edificio_InterfaceDao.queryEdificioId1());
		return p;
	    }

 @Bean("FakeEdificio")
@Scope("prototype")
 public Edificio fakeEdificio() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		Edificio e = new Edificio();
		e.setCittà(fake.address().cityName());
		e.setIndirizzo(fake.address().streetName());
		e.setNome(fake.funnyName().name());
		return e;
	    }

@Bean("FakeUtente")
@Scope("prototype")
 public Utente fakeUtente() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		Utente u = new Utente();
		u.setCognome(fake.name().lastName());
		u.setNome(fake.name().firstName());
		u.setEmail(u.getNome() + "." + u.getCognome() + "@live.it");
		return u;
	    }

	}

	
}
