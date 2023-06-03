package GodfatherPizza.U2W1D1SpringIntro_GodfatherPizza.runner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import configuration.ConfigurationMenu;
import configuration.ConfigurationOrdineTavolo;
import model.Drink;
import model.Ordine;
import model.Pizza;
import model.PizzaTopping;
import model.Tavolo;

@Component
public class OrdineTavoloRunner implements CommandLineRunner{
	AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationOrdineTavolo.class);
	AnnotationConfigApplicationContext appMenuContext = new AnnotationConfigApplicationContext(ConfigurationMenu.class);
	//Map<Integer, Ordine> listaDiTutteLeOrdinazioni = new HashMap<Integer, Ordine>();

	@Override
	public void run(String... args) throws Exception {
		
	System.out.println("______________________");
		System.out.println("OrdineTavoloRunner...");
		
		configOrdiniTavoli();
		
//Alternativa 2	
//		for(int i=1; i<=listaDiTutteLeOrdinazioni.size(); i++) {
//			System.out.println("Ordine n. " + listaDiTutteLeOrdinazioni.get(i).getNumeroOrdine());
//			listaDiTutteLeOrdinazioni.get(i).getListaOrdine().forEach(f -> System.out.println(f.getName() + " $" + f.getPrice()));
//			System.out.println("Totale: " + listaDiTutteLeOrdinazioni.get(i).calcolaTotale());
//		}	
		
		appContext.close();
		appMenuContext.close();
	}

	public  void configOrdiniTavoli() {
	appContext = new AnnotationConfigApplicationContext(ConfigurationOrdineTavolo.class);
	appMenuContext = new AnnotationConfigApplicationContext(ConfigurationMenu.class);
		
		Map<Integer, Tavolo> listaTavoli = new HashMap<Integer, Tavolo>();
		//Cosi creo tavoli ma in un locale i tavoli hanno tutti un id/un numero univoco quindi
		// posso inserirli in una Lista (Map) 
		Tavolo t1 = (Tavolo) appContext.getBean("tavolo", 1, 4);
		Tavolo t2 = (Tavolo) appContext.getBean("tavolo", 2, 2);
		Tavolo t3 = (Tavolo) appContext.getBean("tavolo", 3, 6);
//		System.out.println(t1);
//		System.out.println(t2);
//		System.out.println(t3);
		
		//devo inserire i tavoli nella lista. put(chiave, valore)
		//in questo caso la chiave, il valore univoco è in numero del tavolo
		listaTavoli.put(t1.getNumeroTavolo(), t1);
		listaTavoli.put(t2.getNumeroTavolo(), t2);
		listaTavoli.put(t3.getNumeroTavolo(), t3);
		
       //System.out.println(listaTavoli.values()); //values ritorna una collection di valori
		System.out.println(listaTavoli.get(1)); //get ritorna il valore associato alla chiave che inserisco
		System.out.println(listaTavoli.get(2));
		System.out.println(listaTavoli.get(3));
		
		//---------------------------------------------------------------//
		
		//CREO ORDINI
	Map<Integer, Ordine> listaDiTutteLeOrdinazioni = new HashMap<Integer, Ordine>();
		
	
	Ordine o1 = (Ordine) appContext.getBean("ordine",1, listaTavoli.get(1), 2);
		//devo mettere nell'ordine pizza/drink..creo bean
		Pizza margherita = (Pizza) appMenuContext.getBean("pizzaMargherita");
		Pizza salame = (Pizza) appMenuContext.getBean("pizzaSalame");
		Drink acqua = (Drink) appMenuContext.getBean("drinkAcqua");
		PizzaTopping toppingAglio = (PizzaTopping) appMenuContext.getBean("toppingAglio");
		//metto topping sulla pizza
		toppingAglio.setPizza(margherita);
		//aggiungo alla lista che ho creato nell'ordine
		o1.getListaOrdine().add(margherita);
		o1.getListaOrdine().add(salame);
		o1.getListaOrdine().add(acqua);
		o1.getListaOrdine().add(toppingAglio);
	
		
		System.out.println(o1);
		System.out.println("TOTALE" + o1.calcolaTotale());
		
		//metto ordini nella lista Ordini
//Alternativa
//		listaDiTutteLeOrdinazioni.put(o1.getNumeroOrdine(), o1);
//		System.out.println("NUMERO ORDINE: " + o1.getNumeroOrdine());
//		o1.getListaOrdine().forEach(o -> System.out.println(o.getNome() + " € " + o.getPrezzo() ));
//		System.out.println("TOTALE" + o1.calcolaTotale());
		
		
		//CREO ORDINE 2
        Ordine o2 = (Ordine) appContext.getBean("ordine",2, listaTavoli.get(3), 3);
		
		o2.getListaOrdine().add((Pizza) appMenuContext.getBean("pizzaMargherita"));
		o2.getListaOrdine().add((Pizza) appMenuContext.getBean("pizzaHawaiana"));
		o2.getListaOrdine().add((Pizza) appMenuContext.getBean("pizzaFamilySizePizza",margherita));//mi da null
		o2.getListaOrdine().add((Drink) appMenuContext.getBean("drinkAcqua"));
		o2.getListaOrdine().add((Drink) appMenuContext.getBean("drinkAcqua"));
		o2.getListaOrdine().add((Drink) appMenuContext.getBean("drinkAcqua"));
		
		listaDiTutteLeOrdinazioni.put(o2.getNumeroOrdine(), o2);
		System.out.println(o2);
		System.out.println("TOTALE" + o2.calcolaTotale());
		
		
		
	}
}
