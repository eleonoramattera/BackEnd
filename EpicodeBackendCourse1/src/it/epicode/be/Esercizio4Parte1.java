package it.epicode.be;

public class Esercizio4Parte1 {

	public static void main(String[] args) {
		//1)
		float lato1 = 2.52f;
		float lato2 = 4.20f;
		perimetroRettangolo(lato1, lato2);
		//2)
		perimetroRettangolo(2.52f , 4.20f);
		//3)
        System.out.println(perimetroRettangolo(2.52f , 4.20f));

	}

	public static float perimetroRettangolo(float l1, float l2) {
		float perimetro = (l1*2) + (l2+2);
		return perimetro;
	}
}
