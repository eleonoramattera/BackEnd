package eserciziCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;



public class Esercizio2 {
	
	
	
	public static void main(String[] args) {
	listaRandom(10);
	
	listaOrdineInverso(listaRandom(10));
	boolean b =false;
	listaPariDispari(listaRandom(10), b);
	
	}
	//1)
	private static List<Integer> listaRandom(int n) {
		List<Integer> lista = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
		random.nextInt(101);
		//System.out.println(random.nextInt(101));
		lista.add(random.nextInt(101));
		
		//ORDINARE LISTA .sort()
		//lista.toArray();
		lista.sort(Comparator.naturalOrder());
		System.out.println("lista in ordine " + lista);
	}
		return lista;
	}
	
	//2)
	private static List<Integer> listaOrdineInverso(List<Integer> listaOrdine) {
		List <Integer> listaConcatenata = new ArrayList<Integer>();
		
		List <Integer> listaOrdineInverso = new ArrayList<Integer>(listaOrdine);
		//invertire ordine
		  for (int i = listaOrdineInverso.size() - 1; i >= 0 ; i--) {
	            System.out.println(listaOrdineInverso.get(i));
	        }
		  
		 listaConcatenata.addAll(listaOrdine);
		listaConcatenata.addAll(listaOrdineInverso);
		//invertire ordine
//		Collections.sort(listaOrdine, Collections.reverseOrder());
//		 System.out.println(listaOrdine);
		
		return listaConcatenata;
		
		
	}
	
	//3)
	private static List<Integer> listaPariDispari(List<Integer> lista, boolean b) {
		//se il boolean è true, itero tutta la lista e se l'indice è 0 o indice %2 è 0
		// restituisce tutti gli indici e leggo il numero corrispondendte con .get()
		if(b == true) {
			for (int i =0; i<lista.size(); i++) {
			  if(i == 0 || i%2==0) {
				  System.out.println("nella posizione " +  i + " c'è il numero "+ lista.get(i));
			  }
			}
			
		}else {
			for (int i =0; i<lista.size(); i++) {
				  if( i%2 !=0) {
					  System.out.println("nella posizione " +  i + " c'è il numero " + lista.get(i));
				  }
				}
		}
		
		return lista;
		
	}
	
	
	
	
	
}