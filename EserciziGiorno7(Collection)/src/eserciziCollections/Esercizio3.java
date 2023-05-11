package eserciziCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Esercizio3 {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
Inserimento();
cancella(Inserimento());
	}

	public static HashMap<String, String> Inserimento () {
		Map<String, String> nomiContatti = new HashMap<String, String>();
		for (int i =0; i<5; i++) {
		System.out.println("inserisci nome e numero");
		String nome = s.nextLine();
		String numero = s.nextLine();
		nomiContatti.put(nome, numero);
		
		}
	System.out.println(nomiContatti);
	return (HashMap<String, String>) nomiContatti;	
	}
	
	public static void cancella(HashMap nomiContatti) {
		nomiContatti.containsKey("ele");
		nomiContatti.remove("ele");
		
	}
	
	
	
}
