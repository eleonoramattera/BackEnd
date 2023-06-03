package GodfatherPizza.U2W1D1SpringIntro_GodfatherPizza.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import configuration.ConfigurationMenu;

import enums.StatoOrdine;
import enums.StatoTavolo;
import model.Menu;
import model.Ordine;
import model.Tavolo;

@Component
public class MenuRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("MenuRunner...");
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
