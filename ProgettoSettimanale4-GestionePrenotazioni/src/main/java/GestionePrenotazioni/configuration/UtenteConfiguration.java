package GestionePrenotazioni.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


import com.github.javafaker.Faker;

import GestionePrenotazioni.model.Utente;

@Configuration
public class UtenteConfiguration {

	@Bean("UtenteBean")
	@Scope("prototype")
	public Utente utente(String fullname, String email, String username) {
		return new Utente(fullname, email, username);
	}
	
	@Bean("UtenteFakeBean")
	@Scope("prototype")
	public Utente utenteFake() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		Utente u = new Utente();
		String nome = fake.name().firstName();
		String cognome = fake.name().lastName();
		u.setFullname(nome + " " + cognome);
		u.setUsername(nome.toLowerCase().charAt(0) + "." + cognome.toLowerCase());
		u.setEmail(nome+cognome + "@live.it");
		return u;
	}
}
