package catalogoBibliografico;

public class Rivista extends Catalogo {


 private PeriodicitaRiviste periodicità;
	    
	
public Rivista(int isbn, String titolo, int year, int numberOfPage, PeriodicitaRiviste periodità)  {
	super(isbn, titolo, year, numberOfPage);
	this.periodicità = periodicità;
	    }

public PeriodicitaRiviste getPeriodicità() {
	return periodicità;
}


	    
public String toString() {
  String res= "\nRivista:";
  res += "\n Titolo: " + super.getTitolo();
  res += "\n Year: " + super.getYear();
  res += "\n Periodicità: " + this.getPeriodicità();
  res += "\n Numero Pagine: " + super.getNumberOfPage();
  res += "\n isbn: " + super.getISBN();
  res += "\n";
	return res;
	  }

 public static Rivista aggiungiRivista() throws Exception {
	    	
	 System.out.println(" Inserisci l'ISBN della rivista");
	 int isbn = scanner.nextInt();
	 scanner.nextLine();
	        
	  System.out.println("Inserisci titolo della rivista");
	  String title = scanner.nextLine();
	        
	  System.out.println("Inserisci anno di pubblicazione");
	  int year = scanner.nextInt();
	        
	  System.out.println("Inserisci il numero di pagine");
	  int pages = scanner.nextShort();
	        
	  System.out.println(">> Inserisci periodicità");
	  PeriodicitaRiviste periodicità = null;
	  int period = 0;
	     do {
	        period = scanner.nextInt();
	           switch (period) {
	                case 1:
	                    periodicità = PeriodicitaRiviste.SETTIMANALE;
	                    break;
	                case 2:
	                	periodicità  = PeriodicitaRiviste.MENSILE;
	                	break;
	                case 3:
	                	periodicità  = PeriodicitaRiviste.SEMESTRALE;
	                	break;
	                default:
	                    System.out.println("Errore");

	            }
	            ;
	        } while (period < 0 || period > 3);

	  System.out.println("ivista aggiunta alla biblioteca!");
	       
	     return new Rivista(isbn, title, year, pages, periodicità);
	           
	       
	        
	    
	}


}
