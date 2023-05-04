package Esercizi;

import java.util.Scanner;

public class Esercizio3 {
	public static void main(String[] args) {
		String stringInserita;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("inserisci Stringa:");
		 stringInserita = sc.nextLine();
		String [] stringaSplit = stringInserita.split("");
			
		if(stringInserita != "") {
		for (int i = 0; i <stringaSplit.length; i ++){
			System.out.println( stringaSplit[i] + ",");
		   }	
		}else  {
			System.out.println("inserisci stringa con caratteri");
			 stringInserita = sc.nextLine();
		
		}
		 

		 } while (! ":q".equals(stringInserita)); // stringInserita != ":q" non si usa
		System.out.println("stop");
		
		
	
	}
}
