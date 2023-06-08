package GestionePrenotazioni.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import GestionePrenotazioni.model.Edificio;
@Configuration
public class EdificioConfigration {


	@Bean("EdificioBean")
	@Scope("prototype")
	public Edificio edificio() {
		return new Edificio();
	}
	

	}

