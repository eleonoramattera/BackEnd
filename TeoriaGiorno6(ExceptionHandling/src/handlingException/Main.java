package handlingException;

import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		operazioni(); // è il metodo da cui parte tutto che poi a catena richiama altri metodi
		
	/*es somma: richiamo metodo operazioni che mi chiede che operazione voglio fare,
	 metto 1 e nello switch 1 richiama metodo somma che per chiedere numeri a sua volta
	 richiama il metodo chiediValore
	 Se in chiediValore inserisco una stringa e non un numero in console mi da ERRORE.
	 Mi dice però che l'errore è nel metodo main() e non nel metodo chiediValore().
	 Parte tutto da chiediValore()
	 -1. in chiediValore()inserisco stringa e non numero quindi parte eccezione e java cerca
	 una risoluzione del problema nel metodo chiediValore() e qui c'è una PROPAGAZIONE DELL'ECCEZIONE.
	 vede che chiediValore() è stato richiamato	da somma()
	 -2. Va in somma() e cerca se c'è una gestione dell'eccezione ma non c'è allora risale ancora
	 e vede che somma() è stato richiamato da operazioni()
	 -3 va in operazioni() ma non c'è niente per gestire eccezioni e risale al metodo che ha 
	 richiamato operazioni() ovvero main()
	 -4 vede in main() se c'è una gestione dell'eccezione. Non la trova e ferma tutto
	 RISALE ALLA RICERCA DI UNA GESTIONE FINO A CHE NON TROVA IL PUNTO INIZIALE DALLA 
	 QUALE E' PARTITO TUTTO. QUESTA E' LA PROPAGAZIONE.
	 NEL PUNTO DEL CODICE IN CUI VIENE SOLLEVATA L'ECCEZIONE IO DOVREI GESTIRE ECCEZIONE,
	 SE NON LO FACCIO JAVA RISALE FINO A CHE NON ARRIVA A PUNTO IN CUI E' INIZIATO TUTTO.
	 
	 per gestire eccezione TRY CATCH
	 */
	}

	public static void operazioni () {
		boolean end =false;
		do {
		
		try {
		System.out.println("che tipo di operazione vuoi fare?");
		System.out.println("1-somma | 2-sottrazione | 3-moltiplicazione |4-divisione | 5-chiudi");
	    int scelta = Integer.parseInt(s.nextLine()); //s.nextInt()--> può dare problemi quindi uso nextLine()
		
	    switch(scelta) {
	    case 1: somma(); break;
	    case 2: sottrazione(); break;
	    case 3: moltiplicazione(); break;
	    case 4: divisione(); break;
	    case 5: end=true;  System.out.println("fine"); break;
	    default: System.out.println("Numero non valido");
	    }
		}catch (NumberFormatException e ) {
			System.out.println("Errore valore non valido!!");
		} 
	}while(!end);
	}
	
	public static void somma() {
		int num1 =chiediValore();
		int num2 =chiediValore();
	 System.out.println("la somma tra " + num1 + " e " + num2 + " è: " + (num1+ num2));
		
	}
	
    public static void sottrazione() {
    	int num1 =chiediValore();
		int num2 =chiediValore();
	 System.out.println("la sottrazione tra " + num1 + " e " + num2 + " è: " + (num1+ num2));
	}
	
    public static void moltiplicazione() {
    	int num1 =chiediValore();
		int num2 =chiediValore();
	 System.out.println("la moltiplicazione tra " + num1 + " e " + num2 + " è: " + (num1+ num2));
    }

    public static void divisione() {
    	try {
    	int num1 =chiediValore();
		int num2 =chiediValore();
	 System.out.println("la divisione tra " + num1 + " e " + num2 + " è: " + (num1+ num2));
    } catch (ArithmeticException e) {
		System.out.println("Errore di divisione per 0");
    }}
    //uso metodo chiediValore per non ripetere nei metodi su il codice
    
	public static int chiediValore() {
		try{
		System.out.println("inserisci numero");
		int num = Integer.parseInt(s.nextLine());
		return num;
		}catch (Exception e){
			System.out.println("Numero inserito non valido. Inserisci valore corretto");
			int num = Integer.parseInt(s.nextLine());
			return num;
		}
	}
    
	/*⬆⬆⬆⬆ "inserisci num", se valore è un num allora me lo ritorni, se non è un num vado nel catch.
	 Non conviene fare così perchè dovrei riscrivere try catch anche negli altri metodi.
	 chiediValore() è alla base di tutto ma viene richiamato da un altro metodo
	 (somma/divs/molt/sott) che a sua volta è chiamato da metodo operazioni().
	 In operazioni() devo inserire n da 1 a 4. Se inserio altro numero non mi da errore
	 perchè si aspetta comunque int come valore ma si blocca tutto perchè non parte lo switch.
	 Quindi dovrei inserire il try catch sia in chiediValore() che in somma che in operazioni()
	 Però a sua volta operazioni() è richiamato da main. quindi il try catch lo metto nel main 
	 per non doverlo ripetere in più metodi e quindi per non ripetere il codice
	*/
	
//	public static int chiediValore() {
//	System.out.println("inserisci numero");
//	int num = Integer.parseInt(s.nextLine());
//	return num;
//	
//	
//}

	
}
