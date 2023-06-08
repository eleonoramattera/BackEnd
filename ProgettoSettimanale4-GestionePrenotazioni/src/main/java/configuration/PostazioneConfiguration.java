package configuration;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import enums.Tipo;
import model.Edificio;
import model.Postazione;

public class PostazioneConfiguration {

	@Bean("PostazioneBean")
	@Scope("prototype")
	public Postazione postazione(String description, Tipo tipo, Integer numMaxOccupanti, Edificio edificio) {
		return new Postazione(description, tipo, numMaxOccupanti, edificio);
	}

	
}
