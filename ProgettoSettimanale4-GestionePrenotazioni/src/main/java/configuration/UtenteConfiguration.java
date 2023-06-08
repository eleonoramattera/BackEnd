package configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;

import model.Utente;

public class UtenteConfiguration {

	@Bean("UtenteBean")
	@Scope("prototype")
	public Utente utente(String username, String fullname, String email) {
		return new Utente(username,fullname, email);
	}
	
	@Bean("UtenteFakeBean")
	@Scope("prototype")
	public Utente fakeUtente() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		String nome = fake.name().firstName();
		String cognome = fake.name().lastName();
		Utente u = new Utente();
		u.setFullname(nome + " " + cognome);
		u.setUsername(nome.toLowerCase().charAt(0) + "." + cognome.toLowerCase());
		u.setEmail(u.getFullname()+ "@live.it");
		return u;
	}

}
