package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public abstract class  FoodDrinkItem {

	protected String nome;
	protected double prezzo;
	protected double calorie;

	
	public String getMenu() {
		return  this.nome + " " + this.prezzo + " " + this.calorie;
	} 

}
	
