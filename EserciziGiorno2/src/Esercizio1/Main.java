package Esercizio1;

public class Main {

	public static void main(String[] args) {
		Rettangolo r = new Rettangolo(2,4);
		//System.out.println(r);// esce indirizzo di memoria
        r.calcolaArea();
       // System.out.println("area rett: " +r.calcolaArea());
        r.calcolaPerimetro();
        //System.out.println("perimetro rett: " + r.calcolaPerimetro());
        
        Rettangolo r2 = new Rettangolo();
        r2.calcolaArea();
        //System.out.println("area rett: " +r2.calcolaArea());
        r2.calcolaPerimetro();
       // System.out.println("perimetro rett: " + r2.calcolaPerimetro());
         
       //richiamo i metodi nel main per farli uscire in console
        stampaRettangolo(r);
        stampaRettangolo(r2);
        
        stampaDueRettangoli(r, r2);
        
		
	}

	public static void stampaRettangolo(Rettangolo r) {
     System.out.println(r.calcolaArea() + r.calcolaPerimetro());
	}

 public static void stampaDueRettangoli (Rettangolo r, Rettangolo r2) {
	 double perimetroRett1= r.calcolaPerimetro();
	 double areaRett1 = r.calcolaArea();
	 double perimetroRett2= r2.calcolaPerimetro();
	 double areaRett2= r2.calcolaArea();
	 double sommaArea = areaRett1 + areaRett2;
	 double sommaPerimetro = perimetroRett1 + perimetroRett2;
	 System.out.println("perimetro rett1: " + perimetroRett1 + " perimetro rett2: " + perimetroRett2 + " areaRett1: " + areaRett1 + " areaRett2: " + areaRett2 + " somma aree: " + sommaArea + " sommaPerimetro: " + sommaPerimetro );
 }
}
