package dependencyInjection;

public class AmericanAddress implements Continent {
	
	private String country;
	private String isolato;
	
	public AmericanAddress(String country, String isolato) {
		super();
		this.country = country;
		this.isolato = isolato;
	}
	
	
	
}
