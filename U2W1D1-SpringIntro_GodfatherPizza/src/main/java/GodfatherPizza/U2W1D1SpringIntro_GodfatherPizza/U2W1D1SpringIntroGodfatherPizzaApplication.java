package GodfatherPizza.U2W1D1SpringIntro_GodfatherPizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ConfigurationMenu;
import model.Menu;

@SpringBootApplication
public class U2W1D1SpringIntroGodfatherPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(U2W1D1SpringIntroGodfatherPizzaApplication.class, args);
	
		configMenu();
	}

	
	
	public static void configMenu() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationMenu.class);
		
		Menu m1 = (Menu) appContext.getBean("menu");
		//System.out.println(m1.toString());
		//m1.getMenuPizza().forEach(p -> System.out.println(p));
		//getMenu si trova nella classe FoodDrinkIntem
		m1.getMenuPizza().forEach(p -> System.out.println(p.getMenu()));
		
		System.out.println("-----------------");
		m1.getMenuDrink().forEach(d->System.out.println(d.getMenu()));
	
		System.out.println("-----------------");
		m1.getMenuTopping().forEach(t->System.out.println(t.getMenu()));
		
		System.out.println("-----------------");
		m1.getMenuFranchise().forEach(f->System.out.println(f.getFranchise()));
		
		
		
		
		appContext.close();
	} 
	
}
