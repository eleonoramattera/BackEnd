package dependencyInjection;

public class Person {

	private String fullName;
	//private Address address;
	//private Phone phone;
	
	public Address address;
    public Phone phone;
	//DEPENCENCY INJECTION A LIVELLO DI PROPRIETA'
	
    Continent add;
	
	public Person() {
		super();
	}

	public Person(String fullName) {
		//Address e Phone passati come parametri sono una DEPENDENCY INJECTION 
		//ossia inietto altri oggetti nel costruttore di un oggetto
		//DEPENDENCY INJECTION A LIVELLO DI COSTRUTTORE
		super();
		this.fullName = fullName;
		//ACCOPPIAMENTO FORTE
		this.address = new Address("Torino", "Via Lanzo");
		this.phone = new Phone("+39 3331245678");

	}
	public Person(String fullName, Address address, Phone phone) {
		//Address e Phone passati come parametri sono una DEPENDENCY INJECTION 
		//ossia inietto altri oggetti nel costruttore di un oggetto
		//DEPENDENCY INJECTION A LIVELLO DI COSTRUTTORE
		super();
		this.fullName = fullName;
		//ACCOPPIAMENTO DEBOLE
		this.address = address;
		this.phone = phone;

	}
	 
	//passo interfaccia cosi posso avere sia indirizzo europei che americani
	public Person(String fullName, Continent address, Phone phone) {
		//Address e Phone passati come parametri sono una DEPENDENCY INJECTION 
		//ossia inietto altri oggetti nel costruttore di un oggetto
		//DEPENDENCY INJECTION A LIVELLO DI COSTRUTTORE
		super();
		this.fullName = fullName;
		//ACCOPPIAMENTO DEBOLE
		this.add = address;
		this.phone = phone;

	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		//DEPENDENCY INJECTION A LIVELLO DEI SETTER
		this.address = address;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		//DEPENDENCY INJECTION A LIVELLO DEI SETTER
		this.phone = phone;
	}
	




}

