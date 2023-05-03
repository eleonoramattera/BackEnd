package it.epicode.be;

public class Esercizio4Parte3 {

	public static void main(String[] args) {
		//1)
		float base= 2.40f;
		float altezza =1.20f;
		perimetroTriangolo(base, altezza);
		//2)
		perimetroTriangolo(2.40f , 1.20f);
		//3)
		System.out.println(perimetroTriangolo(2.40f , 1.20f));
	}

	
	public static float perimetroTriangolo (float b, float h) {
		float perimetro = (b*h)/2; 
		return perimetro;
	}
}
