package TeoriaPratica;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateOre {

	public static void main(String[] args) {
		LocalDate x = LocalDate.now(); //data di oggi xon giorno/mese/anno (in base alla lingua del browser)
	    System.out.println(x);	
	
	    LocalTime t = LocalTime.now(); //orario con ora/minuti/secondi/millisecondi
	    System.out.println(t);
	    
	    LocalDateTime dt = LocalDateTime.now();//data e orario
	    System.out.println(dt);

// per formattare e fare uscire DATA : GIORNO, MESE, ANNO
	    //DATETIMEFORMATTER
	    
	    DateTimeFormatter cambio = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    System.out.println(x.format(cambio));
	    
	    /*SINTASSI FORMATTAZIONE
	     dd-MM-yyyy = 04-04-2023
	     dd/MM/yyyy = 04/04/2023 
	     dd MMM yyyy =04-apr-2023
	     dd MMMM yyyy =04-aprile-2023
	     E, dd MMMM  yyyy = lunedi,4 apile 2023
	     */
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
