package GestionePrenotazioni.configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import GestionePrenotazioni.model.Postazione;
import GestionePrenotazioni.model.Prenotazione;
import GestionePrenotazioni.model.Utente;

@Configuration
public class PrenotazioneConfiguration {
	
	@Bean("PrenotazioneBean")
	@Scope("prototype")
	public Prenotazione prenotazione(Postazione postazione, Utente utente,  LocalDateTime dataPrenotata) {
		Prenotazione p = new Prenotazione();
		p.setDataPrenotata(dataPrenotata);
		p.setPostazione(postazione);
		p.setUtente(utente);
		return p;
	}
	
	@Bean("Prenotazione")
	@Scope("prototype")
	public Prenotazione prenotazionee() {
		return 	 new Prenotazione();
	
	}


}
