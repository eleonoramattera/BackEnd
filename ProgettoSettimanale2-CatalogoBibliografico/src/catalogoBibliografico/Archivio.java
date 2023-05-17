package catalogoBibliografico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Archivio {
 public static void main(String[] args) {
	List<Catalogo> listaElems = new ArrayList<Catalogo>();
	Scanner s = new Scanner(System.in);
//	System.out.println("Periodicità: SETTIMANALE, MENSILE, SEMESTRALE");
//	String per =s.nextLine().toUpperCase();
//	int Check = 1;
//	while (Check > 0) {
//		switch (per) {
//		case "SETTIMANALE":
//			Check = 0;
//			break;
//		case "MENSILE":
//			Check = 0;
//			break;
//		case "SEMESTRALE":
//			Check = 0;
//			break;
//		default:
//			System.out.println("Devi digitare SETTIMANALE, MENSILE, SEMESTRALE, ridigita: ");
//			break;
//		}
	
	System.out.println("Inserisci Genere: ");
	String gen = s.nextLine().toUpperCase();
	//String gen;
	int g = 1;
	while (g > 0) {
		switch( gen) {
		case "HORROR":
			 g=0;
			break;
		case "FANTASY":
			g = 2;
			break;
		case "HISTORY":
			g = 3;
			break;
		case "NOVEL":
			g = 4;
			break;
		case "THRILLER":
			g = 5;
			break;
		default:
			System.out.println("Devi digitare  HORROR, FANTASY, HISTORY, NOVEL, THRILLER Riprova: ");
			break;
		}
	}
	
	
 }	
	
}
