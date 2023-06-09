package GestioneIncendi.model;

import java.util.Locale;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.github.javafaker.Faker;

import GestioneIncendi.factory.OggettiAllarmati;
import ch.qos.logback.core.boolex.EvaluationException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sonda extends OggettiAllarmati {

	private Long id;
	private String lat;
	private String lon;
	private Integer smokeLevel;



	public OggettiAllarmati createSonda() {
		return ((OggettiAllarmati) new Sonda());
	}

	public OggettiAllarmati createSondaFake() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		Sonda s = Sonda.builder().id(fake.number().numberBetween(3l, 10l)).lat(fake.address().latitude()).lon(fake.address().longitude()).smokeLevel(fake.number().numberBetween(0, 10)).build();
		return s;
	}

}
