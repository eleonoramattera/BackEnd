package it.epicode.be;

public class Esercizio2Parte1 {

	public static void main(String[] args) {
		//1)
		int a= 2;
		int b = 5;
		moltiplica (a,b);
		//2)
		moltiplica(2,5); 
		//3)
		System.out.println(moltiplica(2,5));

	}
	
	public static int moltiplica (int n1, int n2) {
		return n1 * n2;
	}

}
