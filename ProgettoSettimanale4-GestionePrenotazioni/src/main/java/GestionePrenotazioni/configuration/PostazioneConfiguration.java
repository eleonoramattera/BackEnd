package GestionePrenotazioni.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import GestionePrenotazioni.model.Edificio;
import GestionePrenotazioni.model.Postazione;
import enums.Tipo;
@Configuration
public class PostazioneConfiguration {

	@Bean("PostazioneBean")
	@Scope("prototype")
	public Postazione postazione() {
		return new Postazione();
	}
}
