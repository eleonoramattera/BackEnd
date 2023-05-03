package it.epicode.be;

public class Esercizio2Parte2 {

	public static void main(String[] args) {
		//1)
		String stringa ="ciao";
		int numero = 10;
		concatena(stringa, numero);
		//2)
		concatena ("ciao", 10);
		//3)
		System.out.println(concatena("ciao",10));


	}
	
	public static String concatena (String s, int n) {
		return s+n;
		
	}

}
