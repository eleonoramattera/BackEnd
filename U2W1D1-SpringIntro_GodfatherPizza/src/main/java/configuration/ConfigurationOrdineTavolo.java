package configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import model.Ordine;
import model.Tavolo;

@Configuration
@PropertySource("classpath:application.properties")
public class ConfigurationOrdineTavolo {

	@Value("${tavolo.coperto.costo}")private String costoCoperto;
	//double cc=Double.parseDouble(costoCoperto);
	
	@Bean
	@Scope("prototype")
	public Tavolo tavolo(int numeroTavolo,int numeroCoperti) {
		return new Tavolo(numeroTavolo,numeroCoperti);
	};
	
	@Bean
	@Scope("prototype")
	public Ordine ordine(int numeroOrdine, Tavolo tavolo, int numeroCoperti) {
		System.out.println(costoCoperto);
		try {
			return new Ordine( numeroOrdine, tavolo, numeroCoperti, costoCoperto);
		 
		} catch (Exception e) {
		return null;
		}
		
		
	}
}
