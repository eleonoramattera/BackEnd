package configuration;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import model.Postazione;
import model.Prenotazione;
import model.Utente;

public class PrenotazioneConfiguration {

	@Bean("PrenotazioneBean")
	@Scope("prototype")
	public Prenotazione prenotazione(Postazione postazione, Utente utente, LocalDateTime dataPrenotata) {
		Prenotazione p = new Prenotazione();
		p.setPostazione(postazione);
		p.setUtente(utente);
		p.setDataPrenotata(dataPrenotata);
		return p;
	}

}
