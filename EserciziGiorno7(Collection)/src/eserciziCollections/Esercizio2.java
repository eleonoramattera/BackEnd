package eserciziCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class Esercizio2 {


	
	public static void main(String[] args) {

     listaOrdinata(10);
     List<Integer> listaNumeri =    listaOrdinata(10);

	}
	
	public static List<Integer> listaOrdinata(int num) {
		List<Integer> listNums = new ArrayList<Integer>();
		
		Random generatoreNumeri = new Random();
	
		for (int i =0; i<num; i++) { //cicla fino a num che passo come parametro
		generatoreNumeri.nextInt(101); //tra () range. Valore massimo è escluso
		
		listNums.add(generatoreNumeri.nextInt(100));
		}	
			return listNums;
		}
		
	
}


 


