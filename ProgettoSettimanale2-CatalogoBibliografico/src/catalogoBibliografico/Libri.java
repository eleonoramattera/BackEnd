package catalogoBibliografico;

public class Libri extends Catalogo{

	private String autore;
	private String genere;
			

				
	public Libri(int isbn, String titolo, int year, int pages, String autore, String genere) throws Exception {
	   super(isbn, titolo, year, pages);
	   this.autore = autore;
	   this.genere = genere;
		}

		public String getAutore() {
			return autore;
			}

     public void setAutore(String autore) {
	  this.autore = autore;
	  }

	public String getGenere() {
	return genere;
	}

	public void setGenere(String genere) {
	this.genere = genere;
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
		 int pages = scanner.nextShort();
		 scanner.nextLine();
				        
		System.out.println(" Inserisci il nome dell'autore");
		String autore = scanner.nextLine();
				        
		System.out.println("Inserisci il genere del libro");
		String genere = scanner.next();
				     
				        
				        
		 System.out.println(" Libro aggiunto con successo");
				       
				      
		return new Libri( isbn, titolo, year, pages, autore, genere);
				        
		 }
				  
				        
			

				
				
				
				
				
				
	
		
		

	

}
