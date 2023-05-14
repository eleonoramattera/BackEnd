package collectionEsempi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

import org.slf4j.Logger;// non lo poso fare perchè in questo progetto non ho importato
public class Main {

	public static void main(String[] args) {
	//iterare ciclare
		
	
	
	}
	public static void collections() {
		Collection <String> c =new ArrayList<String>();
		//collection è un interfaccia e quindi non può essere istanziata. quindi uso ArrayList
		ArrayList <String> a =new ArrayList<String>();
	//posso fare ma sono 2 cose diverse.
	
		//COLLECTION
	//gestisce dati
	// non memorizza ordine in cui sono tatic memorizzati i dati. insieme di dati mischiati
	// non definisce se ci possono essere valore duplicati
	// non può contenere valori primitivi (solo oggetti)
		//se voglio fare collection di int devo usare integer (classi wrapper ovvero classe che wrappa un tipo di dato primitivi)
   //classi wrapper tipo dati primitivi impacchettati Integer Char Double Boolean)		
	
	
	//c. ed escono tutti i metodi che eredito dalla classe collection
	//aggiungere add() tipo push
	//collection accetta stringhe
	
	c.add("elem 1");
	c.add("elem 2");
	
	//contains() per vedere se contiene un elemento
	c.contains("elem 2"); //ritorna un booleano
	c.isEmpty(); // se è vuooto
	c.size(); //serebbe length.
	c.clear();//pulire tutto
	c.remove(c); //cacnellare 1 elem
	c.forEach(e->System.out.println(e));//arrow function di js. espressione lambda
	
	
	//List
	//get() perleggere
//	get(0)
	//set(1, "elemento aggiunto") per aggiungere
	

	
	
	}

}
