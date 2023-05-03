package it.epicode.be;

import java.util.Scanner;

public class Helloworld {


//ESERCIZIO 2 	
//METODO MOLTIPLICA
public static int moltiplica (int num1,  int num2) {
	int mol = num1 *num2;
	return mol;
}
//METODO CONCATENA
public static String concatena (String s, int n){
	String conc = s+n;
	return conc;
}

//METODO ARRAY
public static String[] inserisciInArray (String a[], String s1) {
	 String a2[]= new String [a.length + 1]; // devo aggiungere un elem ad a
	
	
	for(int i = 0; i < a2.length; i++) {
		//a2[i] = a[i];
		if(i<2) {
			a2[i]=a[i];
		}else if (i == 2) { // 2 perchè è la terza posizione
			a2[i] = s1;
		}else if (i>2) {
			a2[i] = a[i -1];
		}
	}
	return a2;	
}


//ESERCIZIO4
//PERIMETRO RETTANGOLO
public static float perimetroRettangolo(float l1, float l2) {
	float perimetro = (l1*2) + (l2+2);
	return perimetro;
}

//PARI DISPARTI
public static int pariDispari(int i) {
	if(i % 2 == 0) {
		return 0;
	} else {
		return 1;
	}
}

//PERIMETRO TRIANGOLO
public static float perimetroTriangolo (float b, float h) {
	float perimetro = (b*h)/2; 
	return perimetro;
}







public static void main (String[] args){
	// Stampa a console  la frase
	System.out.println("This is my first Epicode Java Project!");
	
	System.out.println(	moltiplica(2,5));
	System.out.println (concatena("ciao", 2));
	
	String arr [] = {"fiat", "bmw", "audi", "alfaromeo", "ferrari"};
	String auto ="MERCEDES";
	//output = fiat, bmw, mercedes, audi, alfaromes, ferrari
	
//System.out.println(inserisciInArray(arr,auto)); così in console mi esce indirizzo di memoria e non elems dell'array
   String arrayFinale[] = inserisciInArray(arr, auto); // salvo  metodo in una variabile così la posso riutilizzare
   // il metodo inserisciInArray ha come risultato un array a2. Per usarlo all'esterno salvo metodo in un nuovo array
   for (int i = 0; i<arrayFinale.length; i++) {
	   System.out.println(arrayFinale[i]); 
   }
   
//ESERCIZIO 3
   Scanner s = new Scanner(System.in);
   System.out.println("scrivi il tuo nome");
   String nome =s.nextLine();
   System.out.println("scrivi il tuo cognome");
   String cognome =s.nextLine();
   System.out.println("scrivi la tua città");
   String citta =s.nextLine();
   String stringheConcatenate = nome + " " + cognome + " " + citta;
   System.out.println(stringheConcatenate);
   
   System.out.println(perimetroRettangolo(2.52f , 4.20f));
   
   System.out.println(pariDispari(3));
	
   System.out.println(perimetroTriangolo(2.40f , 1.20f));

}



}



