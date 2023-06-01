package model;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PizzaTopping extends FoodDrinkItem{

	private Pizza pizza;

	public PizzaTopping(Pizza pizza, String nome, double prezzo, double calorie) {
		super(nome, prezzo, calorie);
		this.pizza = pizza;
	}
	
	public PizzaTopping(String nome, double prezzo, double calorie) {
		super(nome, prezzo, calorie);
	
	}
	

}
