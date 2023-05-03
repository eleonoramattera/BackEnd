package Esercizio2;


public class Main {

	public static void main(String[] args) {
		
	    Chiamata c1 = new Chiamata(111, 20.22);
		Chiamata c2 = new Chiamata (222, 21.05);
		Chiamata c3 = new Chiamata (333, 24.20);
		Chiamata c4 = new Chiamata (444, 1.20);
		Chiamata c5 = new Chiamata (555, 15.22);
 
	  Sim s = new Sim (333123456, 20.20 );
	s.listaChiamate[0] = c1;
	s.listaChiamate[1] =c2;
	s.listaChiamate[2] =c3;
	s.listaChiamate[3] =c4;
	s.listaChiamate[4] =c5;
	
System.out.println(s.listaChiamate[0]);



	
	}

}
