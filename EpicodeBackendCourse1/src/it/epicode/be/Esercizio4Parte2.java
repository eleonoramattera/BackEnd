package it.epicode.be;

public class Esercizio4Parte2 {

	public static void main(String[] args) {
		//1)
		int numero =3;
		pariDispari(numero);
		//2)
		pariDispari(3);
		//3)
		System.out.println(pariDispari(numero));

	}

	
	public static int pariDispari(int i) {
		if(i % 2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}
}
