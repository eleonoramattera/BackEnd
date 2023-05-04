package Esercizi;

import java.util.Scanner;

public class Esercizio2 {
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("inserisci numero intero:");
		int i= s.nextInt();
		
		switch(i) {
		case 0 : System.out.println("zero");
		break;
		case 1 : System.out.println("uno");
		break;
		case 2: System.out.println("due");
		break;
		case 3: System.out.println("tre");
		break;
		default: System.out.println("errore");
		
		
		}
		
		
		
	}
}
