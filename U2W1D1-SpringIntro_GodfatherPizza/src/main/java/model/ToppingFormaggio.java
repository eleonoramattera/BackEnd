package model;

public class ToppingFormaggio extends PizzaTopping{

//		public ToppingFormaggio(Pizza pizza,String nome,  double prezzo, double calorie) {
//			super(pizza, "Formaggio", 0.69, 92);
//		}

	public ToppingFormaggio(Pizza pizza) {
		super(pizza, "Formaggio", 0.69, 92);
	}
	public ToppingFormaggio() {
		super("Formaggio", 0.69, 92);
	}

		
}

