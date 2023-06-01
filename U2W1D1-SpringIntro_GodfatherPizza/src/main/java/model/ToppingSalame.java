package model;

public class ToppingSalame 	extends PizzaTopping{

//			public ToppingSalame(Pizza pizza, String nome, double prezzo, double calorie) {
//				super(pizza, "Salame",  0.79, 24);
//			}

	public ToppingSalame(Pizza pizza) {
		super(pizza, "Salame",  0.79, 24);
	}
	
	public ToppingSalame() {
		super("Salame",  0.79, 24);
	}
}
