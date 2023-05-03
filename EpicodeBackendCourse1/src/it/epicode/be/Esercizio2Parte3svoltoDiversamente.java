package it.epicode.be;

public class Esercizio2Parte3svoltoDiversamente {

	public static void main(String[] args) {
		String macchine []= {"ford", "bmw", "ferrari", "alfaromeo", "audi"};
		String nuovaMacchina ="MERCEDES";
		inserisciInArray(macchine, nuovaMacchina);
		String arrayRisultato [] = inserisciInArray(macchine,nuovaMacchina);
		for (int i =0; i < arrayRisultato.length; i++) {
			System.out.println("risultato:" + arrayRisultato[i]);
		}

	}
	public static String[] inserisciInArray (String a[], String s) {
		//creo nuovo array di 6 elementi
		String a2 [] =new String [6];
		//riempio nuovo array
	    a2[0] =a[0];
	    a2[1] =a[1];
	    a2[2] =s;
	    a2[3] =a[2];
	    a2[4] =a[3];
	    a2[5] =a[4];
	    
	    
	    
		
		
		
		return a2;
	}

}
