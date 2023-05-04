package Esercizi;

import java.util.GregorianCalendar;

public class Esercizio1Parte2 {

	public static void main(String[] args) {
		GregorianCalendar data1 = new GregorianCalendar(2020,0,1);
		GregorianCalendar data2 = new GregorianCalendar(2023,0,1);
		int annoData1 = data1.get(GregorianCalendar.YEAR);
		int annoData2 = data2.get(GregorianCalendar.YEAR);
		
		System.out.println(annoBisestile(annoData1));
		System.out.println(annoBisestile(annoData2));
	}

	
	
	public static String annoBisestile(int anno) {
		if (anno%4 ==0 || (anno%100==0 && anno%400==0)) {
			   return " è bisestile";
		} else {
			   return "non è bisestile";
			}	
	}
	
	
	
	
	
	
	
}
