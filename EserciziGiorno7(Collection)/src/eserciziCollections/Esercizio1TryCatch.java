package eserciziCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1TryCatch {

	static Scanner s =new Scanner(System.in);  
	static Set<String> setParole = new HashSet<String>(); //static così accessibile da tutti i metodi
	
public static void main(String[] args) {
	boolean b= true;
	do {
	try {
	System.out.print("Inserisci N di parole da inserire o 0 per uscire: "); //chiedo di inserire un N
	int numElementi = Integer.parseInt(s.nextLine());
	 
	if(numElementi == 0) {                                   // se N che inserisco è 0 esco b è false così esco dal ciclo
		b= false;
		System.out.println("sei uscito");
	
	} else {
		for (int i = 0; i < numElementi; i++) {               // se N che inserisco è valido
			System.out.print("Inserisci una parola: ");       //ciclo in N e inserisco tante parole quanto è grande il N inserito su
			String parola = s.nextLine();
			
			//CONTROLLO PAROLE GIA' INSSERITE
			//1)
			//boolean rispParolaAgiunta = setParole.contains(parola);
			
			// .add(sc.nextLine()) 
			//restituisce true se la parola viene aggiunta nella collection false se la parola non viene aggiunta perchè duplicata
			boolean rispParolaAgiunta = setParole.add(parola);
			
			if(!rispParolaAgiunta) { //se la parola è duplicata
				System.out.println("Parola duplicata: " + parola);
				
			}
		}
		
		System.out.println("Numero di parole distinte: " + setParole.size());
		System.out.println("Elenco parole distinte: ");
		//1)
		setParole.forEach(p -> System.out.println(p));
		//2)
		//FOR OFF
		for (String parola : setParole) {
			System.out.println("- " + parola);
		}
	}
	}catch(NumberFormatException e) {
		System.out.println("Valore inserito non valido. Scrivi un numero intero");	
	}finally {
		setParole.clear();
	}
	
	}while(b);

}//chiusura main
}//chiusura classe
