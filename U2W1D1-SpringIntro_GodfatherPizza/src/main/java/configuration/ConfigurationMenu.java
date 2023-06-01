package configuration;

import java.util.Collection;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import model.Drink;
import model.DrinkAcqua;
import model.DrinkLimonata;
import model.DrinkVino;
import model.FranchiseTazza;
import model.FranchiseTshirt;
import model.Menu;
import model.Pizza;
import model.PizzaFamilySize;
import model.PizzaHawaiana;
import model.PizzaMargherita;
import model.PizzaSalame;
import model.ToppingAglio;
import model.ToppingAnanas;
import model.ToppingFormaggio;
import model.ToppingProsciutto;
import model.ToppingSalame;

@Configuration
public class ConfigurationMenu {


@Bean
public Menu menu() {
	//mi deve ritornare un oggetto di tipo Menu ovvero 
	//insieme di liste di pizza, drink, topping e franchise
	//faccio bean per creare instanza di pizza, drink, topping e franchise 
	// che devo inserire poi nella lista contenuta nel menu
    Menu m = new Menu();
    
    m.getMenuPizza().add(pizzaMargherita());
    m.getMenuPizza().add(pizzaHawaiana());
    m.getMenuPizza().add(pizzaSalame());
    m.getMenuPizza().add(pizzaFamilySize(pizzaMargherita()));
    
    m.getMenuDrink().add(drinkAcqua());
    m.getMenuDrink().add(drinkVino());
    m.getMenuDrink().add(drinkLimonata());
    
    m.getMenuTopping().add(toppingAglio());
    m.getMenuTopping().add(toppingAnanas());
    m.getMenuTopping().add(toppingFormaggio());
    m.getMenuTopping().add(toppingProsciutto());
    m.getMenuTopping().add(toppingSalame());
    
    m.getMenuFranchise().add(franchiseTshirt());
    m.getMenuFranchise().add(franchiseTazza());
    
	return m;
}
	
@Bean
public PizzaMargherita pizzaMargherita() {
	return new PizzaMargherita();	
}

@Bean
public PizzaHawaiana pizzaHawaiana() {
	return new PizzaHawaiana();	
}

@Bean
public PizzaSalame pizzaSalame() {
	return new PizzaSalame();	
}

@Bean
@Scope("prototype")
public PizzaFamilySize pizzaFamilySize(Pizza p) {
	return new PizzaFamilySize(p);	
}


@Bean
@Scope("singleton")
public DrinkAcqua drinkAcqua () {
	return new DrinkAcqua();
}

@Bean
public DrinkVino drinkVino () {
	return new DrinkVino();
}

@Bean
public DrinkLimonata drinkLimonata () {
	return new DrinkLimonata();
}

@Bean
public ToppingAglio toppingAglio () {
	return new ToppingAglio();
}

//@Bean
//public ToppingAglio toppingAglio (Pizza p) {
//	return new ToppingAglio(p);
//}


//@Bean
//public ToppingAnanas toppingAnanas(Pizza p) {
//	return new ToppingAnanas(p);
//}
@Bean
public ToppingAnanas toppingAnanas() {
	return new ToppingAnanas();
}

//@Bean
//public ToppingFormaggio toppingFormaggio(Pizza p) {
//	return new ToppingFormaggio(p);
//}
@Bean
public ToppingFormaggio toppingFormaggio() {
	return new ToppingFormaggio();
}

//@Bean
//public ToppingProsciutto toppingProsciutto(Pizza p) {
//	return new ToppingProsciutto(p);
//}
@Bean
public ToppingProsciutto toppingProsciutto() {
	return new ToppingProsciutto();
}

//@Bean
//public ToppingSalame toppingSalame(Pizza p) {
//	return new ToppingSalame(p);
//}
@Bean
public ToppingSalame toppingSalame() {
	return new ToppingSalame();
}

@Bean
public FranchiseTshirt franchiseTshirt () {
	return new FranchiseTshirt();
}

@Bean
public FranchiseTazza franchiseTazza() {
	return new FranchiseTazza();
}


}
