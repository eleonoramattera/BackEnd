package model;

public class ToppingAglio extends PizzaTopping{


//	public ToppingAglio(String nome, Pizza pizza, double prezzo, double calorie) {
//		super(pizza, "Ananas", 0.69, 22);
//	
//	}

	

	public ToppingAglio( Pizza pizza) {
		super(pizza, "Aglio", 0.69, 22);
	
	}
	

	public ToppingAglio() {
		super("Aglio", 0.69, 22);
	
	}

}
