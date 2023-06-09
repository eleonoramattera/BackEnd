package catalogoBibliografico;


import java.io.File;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;


public class Main {
	
	static File file = new File("testFile/testo.txt");
	public static Scanner s = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		ArrayList<Catalogo> listaElementi = new ArrayList<Catalogo>();
	    String res;
	    
	    
	generaArchivio(listaElementi);
	    
	  
	scriviFile(listaElementi);
	  
	try {
		String s = LeggiFile();
		System.out.println(s);
	} catch (IOException e1) {
		e1.printStackTrace();
	}
	aggiungiArticolo(listaElementi);

      
		System.out.println("ARCHIVIO");
		System.out.println("Vuoi caricare il file dall'archivio o generare uno nuovo? digita CARICA o GENERA");
		int l = 1;
		while (l > 0) {
			res = s.nextLine().toUpperCase();
			if (res.equals("CARICA")) {
				System.out.println("Digita il nome del file");
				String Archivio = s.nextLine();
				File file = new File(Archivio);
				try {
					String input = FileUtils.readFileToString(file, "UTF-8");
					System.out.println(input);
				} catch (IOException e) {
					e.printStackTrace();
				}

				l = 0;
			} else if (res.equals("GENERA")) {
				generaArchivio(listaElementi);
				l = 0;
			} else {
				System.out.println("ERRORE");
			}
		}
		// RICERCA  ANNO O AUTORE

				int h = 1;
				while (h > 0) {
					System.out.println("Vuoi ricercare un Articolo dell'archivio? Digita Y o N");
					res = s.nextLine().toUpperCase();
					if (res.equals("Y")) {
						System.out.println("Ricerca per ANNO di pubblicazione o AUTORE? Digita ANNO oppure AUTORE");
						res = s.nextLine().toUpperCase();
						if (res.equals("ANNO")) {
							ricercaPerAnno(listaElementi);
							h = 0;
						} else if (res.equals("AUTORE")) {
							ricercaPerAutore(listaElementi);
							h = 0;
						} else {
							System.out.println("Risposta non corretta.");
						}
					} else if (res.equals("N")) {
						h = 0;
					} else {
						System.out.println("Risposta non corretta.");
					}
				}
		
 
	}
	//LETTURA DA FILE
	public static String  LeggiFile() throws IOException {
	  return FileUtils.readFileToString(file, "UTF-8");	
	}

	
	//SALVATAGGIO SU FILE
	public static void scriviFile(ArrayList<Catalogo> elem) {
//		System.out.println("digita nome del file");
//		String nomeFile = s.nextLine();
//		System.out.println("Il file si chiama: " + nomeFile);
//		 file = new File(nomeFile);
		try {
			FileUtils.writeStringToFile(file, elem.toString(), "UTF-8", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("testo salvato su file");
	}
	
	public static void generaArchivio(ArrayList<Catalogo> list) {
		
		Libri a1 = new Libri(4554, "It", 1865, 1986, "Stephen King ", Genere.HORROR);
    	Libri a2 = new Libri(6565, "I pilastri della Terra", 1989, 312, "Ken Follet", Genere.HISTORY);
		Libri a3 = new Libri(2322, "Le Mille e una notte", 1300, 750, "A. Galland", Genere.NOVEL);
		Libri a4 = new Libri(5432, "Presunto innocente", 1990, 784, " Alan J. Pakula", Genere.THRILLER);
     	Libri a5 = new Libri(5433, "Harry Potter", 1998, 784, "J. K. Rowling", Genere.FANTASY);
    	Rivista a6 = new Rivista(5345, "Focus", 2022, 150, PeriodicitaRiviste.MENSILE);
		Rivista a7 = new Rivista(5235, "New York Times for Kids", 2000, 100, PeriodicitaRiviste.SETTIMANALE);
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
		list.add(a7);
	}

	
	
//RICERCA PER ANNO
	public static void ricercaPerAnno(ArrayList<Catalogo> list) {
		System.out.println("ricerca Articolo per ANNO di pubblicazione: ");
		int annoPub = s.nextInt();
		s.nextLine();
		list.stream().filter(elem -> elem.getYear() == annoPub)
				.forEach(articolo -> System.out.println(articolo.toString()));
	}

	

//RICERCA PER AUTORE	
	public static void ricercaPerAutore(ArrayList<Catalogo> list) {
		System.out.print("ricerca Articolo per AUTORE: ");
		s.nextLine();
		String aut = s.nextLine().toUpperCase();
		list.stream()
				.filter(singoloLibro -> ((Libri) singoloLibro).getAutore().toUpperCase().contains(aut.toUpperCase()))
				.forEach(Libro -> System.out.println(Libro.toString()));
	}

	
	
//AGGIUNGI ELEMENTO
	public static void aggiungiArticolo(ArrayList<Catalogo> list) {
		boolean end =false;
	do {
try {
		System.out.println("Aggiungi articolo: indica se é una Libro o una Rivista digitando LIBRO o RIVISTA oppure 'ESCI' per uscire");
		String res = s.nextLine().toUpperCase();
		if (res.equals("LIBRO")) {
			System.out.println("Hai scelto libro");
			//ISBN
			System.out.println("Inserisci ISBN:");
			int isbn = s.nextInt();
			s.nextLine();
			//TITOLO
			System.out.println("Inserisci Titolo: ");
			String tit = s.nextLine();
			//ANNO PUB
			System.out.println(" Inserisci anno di pubblicazione: ");
			int aPub = s.nextInt();
			s.nextLine();
			//N PAGINE
			System.out.println("Inserisci numero pagine: ");
			int nPag = s.nextInt();
			s.nextLine();
			//AUTORE
			System.out.println("Inserisci Autore: ");
			String Aut = s.nextLine();
			//GENERE
			System.out.println("Inserisci Genere: HORROR, FANTASY, HISTORY, NOVEL, THRILLER");
			Genere gen;			
			gen = Genere.valueOf(s.nextLine().toUpperCase());
			Libri a7 = new Libri(isbn, tit, aPub, nPag, Aut, gen );
			list.add(a7);
			System.out.println("hai inserito " + a7);
			} 
		    else if (res.equals("RIVISTA")) {
			System.out.println("Hai scelto Rivista");
			//ISBN
			System.out.println("Inserisci ISBN:");
			int isbn = s.nextInt();
			s.nextLine();
			//TITOLO
			System.out.println("Inserisci Titolo: ");
			String tit = s.nextLine();
			//ANNO PUB
			System.out.println("Inserisci anno di pubblicazione: ");
			int aPub = s.nextInt();
			s.nextLine();
			//N PAGINE
			System.out.println("Inserisci numero pagine: ");
			int nPag = s.nextInt();
			s.nextLine();
			//PERIODICITA'
			System.out.println("Periodicità: SETTIMANALE, MENSILE, SEMESTRALE");
			PeriodicitaRiviste per;
			per =PeriodicitaRiviste.valueOf(s.nextLine().toUpperCase());

			Rivista a8 = new Rivista(isbn, tit, aPub, nPag, per);
			list.add(a8);
			System.out.println("hai inserito " + a8);
		}else if (res.equals("ESCI")) {
			end = true;
			System.out.println("SEI USCITO");
		}
			else {
			System.out.println("ERRORE. RIPROVA");
		}
    }catch(InputMismatchException e){
	System.out.println("Valore non valido");
}catch(IllegalArgumentException e) {
	System.out.println("inserisci uno dei valori suggeriti ⬆ ");
}catch (Exception e ) {
	System.out.println("ERRORE");
}
	}while(!end);
		}
	


//RIMUOVI ELEMENTO
	public static void RimuoviArticolo(int isbn, ArrayList<Catalogo> list) {
		list = (ArrayList<Catalogo>) list.stream()
				.filter(e -> e.getISBN() != isbn)
				.collect(Collectors.toList());
	}




}

