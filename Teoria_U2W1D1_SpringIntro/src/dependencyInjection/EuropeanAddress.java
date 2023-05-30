package dependencyInjection;

public class EuropeanAddress implements Continent{

	
	private String city;
	private String street;
	
	public EuropeanAddress(String city, String street) {
		super();
		this.city = city;
		this.street = street;
	}
}
