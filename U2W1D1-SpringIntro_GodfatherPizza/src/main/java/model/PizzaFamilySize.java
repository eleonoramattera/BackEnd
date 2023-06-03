package model;

public class PizzaFamilySize extends Pizza {

	private Pizza pizza;
	private String nome;
	private double calorie;
	private double prezzo;

//	public PizzaFamilySize(Pizza pizza) {
//		super();
//		this.nome = pizza != null ? "Family Size for Pizza (" + pizza.getNome() + ") " : "Family Size for Pizza" ;
//		this.prezzo = pizza != null ? pizza.getPrezzo() + 4.15 : 4.15;
//		this.calorie = pizza != null ? pizza.getCalorie() * 1.95 :  1.95;
//		this.pizza = pizza;
//	}
	public PizzaFamilySize(Pizza pizza) {
		super();
		this.nome = "Family Size for Pizza (" + pizza.getNome() + ")" ;
		this.prezzo =  pizza.getPrezzo() + 4.15 ;
		this.calorie =  pizza.getCalorie() * 1.95 ;
		this.pizza = pizza;
	}
	

	
	public PizzaFamilySize() {
		super();
		this.nome = "Family Size for Pizza";
		this.prezzo = 4.15;
		this.calorie= 1.95;
		this.pizza = null;
	}
	
	public String getMenu() {
		
		return this.nome + " " + this.calorie  + " " + " +" + this.prezzo;
	
	}
	
	

	
	
}
