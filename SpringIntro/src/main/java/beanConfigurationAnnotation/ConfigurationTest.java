package beanConfigurationAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationTest {

	//creare bean(Istanze)
	@Bean
	@Scope("singleton")
	public Test test() {
		return new Test("Primo Bean", "Testo per config primo bean");
	}
	
	@Bean
	@Scope("prototype")
	public Test testparam(String title, String txt) {
		return new Test(title, txt);
	}
}
