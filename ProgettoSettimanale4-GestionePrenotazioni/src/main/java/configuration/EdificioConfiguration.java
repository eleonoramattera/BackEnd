package configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;

import model.Edificio;

@Configuration
public class EdificioConfiguration {

	@Bean("EdificioBean")
	@Scope("prototype")
	public Edificio edificio(String nome, String indirizzo, String citta) {
		return new Edificio(nome, indirizzo, citta);
	}
	
	@Bean("EdificioFakeBean")
	@Scope("prototype")
	public Edificio edificioFake() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		Edificio e = new Edificio();
		e.setCitta(fake.address().city());
		e.setIndirizzo(fake.address().streetAddress());
		e.setNome(fake.backToTheFuture().character());
		return e;
	}
}
