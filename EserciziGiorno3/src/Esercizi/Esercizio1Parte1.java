package Esercizi;

public class Esercizio1Parte1 {

	public static void main(String[] args) {

		String ep ="Epicode";
		System.out.print(stringaPariDispari(ep));
}

	
public static boolean stringaPariDispari(String s) {
	char ris = 0;
	for (int i =0; i<s.length(); i++ ) {
		//System.out.print("-" +s.charAt(i));
		ris = s.charAt(i);
	}
	if (ris %2 == 0) {
		return true;
	} else {
		return false;
	}
}
}
	
/*PER STAMAPARE TUTTI I CARATTERI DI UNA PAROLA
	String ep ="Epicode"; 
	
	for (int i =0; i<ep.length(); i++ ) {  ciclo la parola
	System.out.print("-" +ep.charAt(i));  stampo tutti i caratteri
	}

charAT  estrae da una stringa il carattere che occupa una certa posizione.
in questo caso con ep.charAt(i) me li stampa tutti perchè c'è i quindi tutti gli indici
*/

