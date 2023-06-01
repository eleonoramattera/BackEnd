package model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Menu {

	private List<Pizza> menuPizza = new ArrayList<Pizza>();
	private List<Drink> menuDrink = new ArrayList<Drink>();
	private List<PizzaTopping> menuTopping = new ArrayList<PizzaTopping>();
	private List<Franchise> menuFranchise = new ArrayList<Franchise>();
}
