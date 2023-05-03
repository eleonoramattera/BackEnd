package it.epicode.be;

public class Esercizio2Parte3 {

	public static void main(String[] args) {
	String macchine []= {"ford", "bmw", "ferrari", "alfaromeo", "audi"};
	String nuovaMacchina ="MERCEDES";
	inserisciInArray(macchine, nuovaMacchina);
	
	// il metodo inserisciInArray ritorna un array di stringhe quindi se scrivo così in console mi esce la locazione di memoria
	System.out.println(inserisciInArray(macchine, nuovaMacchina));
	
	//per vedere array lo devo ciclare quindi mi salvo l'invocazione del metodo in una variabile
	String arrayFinale [] =inserisciInArray(macchine, nuovaMacchina);
	for (int i = 0; i<arrayFinale.length; i++) {
		System.out.println(arrayFinale[i]);
	}
	
	
	}

	public static String[] inserisciInArray (String a[], String s) {
		String a2[] = new String[a.length + 1]; //aggiungo un posto in più ad a
		//a2[i] = a[i]
        for (int i =0; i<a2.length; i++) {
        	if(i <2 ) {
        		a2[i] = a[i];
        	}else if (i ==2) { //2 perchè 2 è la 3 posizione
        		a2[i] = s;
        	} else if (i>2) {
        		a2[i] = a[i-1];
        	}
        }		
		return a2;
		}
}
