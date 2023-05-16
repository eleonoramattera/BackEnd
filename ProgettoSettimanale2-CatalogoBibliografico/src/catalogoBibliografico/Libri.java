package catalogoBibliografico;

public class Libri extends Catalogo{

	private String autore;
	private Genere genere;

    
			

				
	public Libri(int isbn, String titolo, int year, int numberOfPage, String autore, Genere genere){
	   super(isbn, titolo, year, numberOfPage);
	   this.autore = autore;
	   this.genere = genere;
		}

		public String getAutore() {
			return autore;
			}

     public void setAutore(String autore) {
	  this.autore = autore;
	  }

	public Genere getGenere() {
	return genere;
	}

		
			

	public String toString() {
	String res= "\nLibro:";
	res += "\n Titolo: " + super.getTitolo();
	res += "\n Autore: " + this.getAutore();
	res += "\n Genere: " + this.getGenere();
	res += "\n Numero Pagine: " + super.getNumberOfPage();
	res += "\n Year: " + super.getYear();
	res += "\n ISBN: " + super.getISBN();
	res += "\n";
	return res;
		}
				
				
				
   public static Libri aggiungereLibro() throws Exception {
				  
    System.out.println( "Inserisci l'isbn del libro");
	int isbn = scanner.nextInt();
	scanner.nextLine();
				      
		System.out.println("Inserisci titolo del libro");
		String titolo = scanner.nextLine();
				        
		System.out.println(" Inserisci anno di pubblicazione");
		int year = scanner.nextInt();
				        
		 System.out.println(">> Inserisci il numero di pagine");
		 int numberOfPage = scanner.nextShort();
		 scanner.nextLine();
				        
		System.out.println(" Inserisci il nome dell'autore");
		String autore = scanner.nextLine();
				        
		System.out.println("Inserisci il genere del libro");
		Genere genere = null;
		
		  int genre = 0;
		     do {
		        genre = scanner.nextInt();
		           switch (genre) {
		                case 1:
		                   genere = Genere.HORROR;
		                    break;
		                case 2:
		                	genere  = Genere.FANTASY;
		                	break;
		                case 3:
		                	genere  = Genere.HISTORY;
		                	break;
		                default:
		                    System.out.println("Errore");

		            }
		            ;
		        } while (genre < 0 || genre > 3);
				        
				        
		 System.out.println(" Libro aggiunto con successo");
				       
				      

			return new Libri( isbn, titolo, year, numberOfPage, autore, genere);
	
				        
		 }
				  
				        
			

				
				
				
				
				
				
	
		
		

	

}
