package eserciziCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Esercizio3 {
	private static Scanner s = new Scanner(System.in);
	
static	Map<String, String> rubrica = new HashMap<String, String>();

	public static void main(String[] args) {
		boolean b = true;
		do {
		System.out.println("inserisci nome e numero");
		String nome = s.nextLine();
		String numero = s.nextLine();
		if (nome.equals("chiudi")) {
			nome= "";
			numero ="";
			b = false;
			System.out.println("finito");
		}
		try {
			inserimento(nome, numero);
		} catch (Exception e) {
			System.out.println("contatto già esistente");
			e.printStackTrace();
		}
		}while(b);
	}

	public static  void inserimento (String nome, String numero) throws Exception {
		if(rubrica.containsKey(nome)) {
			throw new Exception();
		}else {
		rubrica.put(nome, numero);
		}
		
	System.out.println(rubrica);

	}
	
	public static void cancella(String nome) {
		rubrica.containsKey(nome);
		rubrica.remove(nome);
		
	}
	//accedere alla chiave tramite il valore
	public static String ricercaPersonaTramiteNumero(String numero) {
		Set <String> keys =rubrica.keySet();
		for(String nome : keys) {
			if(rubrica.get(nome).equals(numero)) {
				return nome;
			}
		}
		return null;
	}
	 //accedere al valore tramite la chiave
	public static String ricercaNumero(String nome) {
		return rubrica.get(nome);
		
	}
	
	//per iterare la mappa devo conoscere la chiave
	public static void stampa() {
		rubrica.keySet();
		Set <String> keys =rubrica.keySet();
	for (String nome : keys) {
		System.out.println("nome contatto: " + nome + " numero: " + rubrica.get(nome));
	}
		
	
	}
}
