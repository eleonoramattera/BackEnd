package it.epicode.be;

public class Esercizio2Parte3svoltoDiversamente2 {
	public static void main(String[] args) {
		
		String macchine []= {"ford", "bmw", "ferrari", "alfaromeo", "audi"};
		String nuovaMacchina ="MERCEDES";
		inserisciInArray(macchine, nuovaMacchina);
		
		String [] arrFinale = inserisciInArray(macchine, nuovaMacchina);
		for(int i =0; i<arrFinale.length; i++) {
			System.out.println(arrFinale[i]);
		}
	}
	
	
	public static String[] inserisciInArray (String a[], String s) {
		//creo nuovo array
		String [] a2 = {a[0], a[1], s, a[2], a[3], a[4] };
		return a2;
	}
	
	


}
