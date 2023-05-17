package catalogoBibliografico;


import java.io.File;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
	
	static File file = new File("testFile/testo.txt");
	public static Scanner s = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		ArrayList<Catalogo> listaElementi = new ArrayList<Catalogo>();
		//StringBuilder BufferPass = new StringBuilder();
		String res;

	
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
				// SALVATAGGIO FILE

				System.out.println("Salvataggio database, digita nome del file");
				String bufferName = s.nextLine();
				System.out.println("Il file si chiama: " + bufferName);
				File file = new File(bufferName);
				try {
					FileUtils.writeStringToFile(file, listaElementi.toString(), "UTF-8");
				} catch (IOException e) {
					e.printStackTrace();
				}

				System.out.println("");
				System.out.println("Il programma è finito, arrivederci");
    
	}
	
	public static void generaArchivio(ArrayList<Catalogo> list) {
		StringBuilder BufferPass = new StringBuilder();
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


	public static void ricercaPerAnno(ArrayList<Catalogo> list) {
		System.out.println("ricerca Articolo per ANNO di pubblicazione: ");
		int annoPub = s.nextInt();
		s.nextLine();
		list.stream().filter(elem -> elem.getYear() == annoPub)
				.forEach(articolo -> System.out.println(articolo.toString()));
	}

	public static void ricercaPerAutore(ArrayList<Catalogo> list) {
		System.out.print("ricerca Articolo per AUTORE: ");
		s.nextLine();
		String aut = s.nextLine().toUpperCase();
		list.stream()
				.filter(singoloLibro -> ((Libri) singoloLibro).getAutore().toUpperCase().contains(aut.toUpperCase()))
				.forEach(Libro -> System.out.println(Libro.toString()));
	}

	public static void aggiungiArticolo(ArrayList<Catalogo> list) {
	//	StringBuilder BufferPass = new StringBuilder();
		System.out.println("indica se é una Libro o una Rivista digitando LIBRO o RIVISTA:");
		String res = s.nextLine().toUpperCase();
		if (res.equals("LIBRO")) {
			System.out.println("Hai scelto libro");
			//ISBN
			System.out.println("Inserisci ISBN:");
			int isbn = s.nextInt();
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
			System.out.println("Inserisci Genere: ");
			System.out.println("Inserisci Genere: HORROR, FANTASY, HISTORY, NOVEL, THRILLER");
			Genere gen;
//			if(gen =="horror".toUpperCase()) {
//				Genere g = Genere.valueOf(gen);
//			} else if (gen =="fantasy".toUpperCase()) {
//				Genere g = Genere.valueOf(gen);
//			}
			gen = Genere.valueOf(s.nextLine());
			
//			public enum Day {
//			    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
//			    THURSDAY, FRIDAY, SATURDAY
//			}

//
//			String day = "SUNDAY";
//			Day dayEnum = Day.valueOf(day);	
//			}
			Libri a7 = new Libri(isbn, tit, aPub, nPag, Aut, gen );
			list.add(a7);
			} else if (res.equals("RIVISTA")) {
			System.out.println("Hai scelto Rivista");
			//ISBN
			System.out.println("Inserisci ISBN:");
			int isbn = s.nextInt();
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
			per =PeriodicitaRiviste.valueOf(s.nextLine());

			
			Rivista a8 = new Rivista(isbn, tit, aPub, nPag, per);
			list.add(a8);
		} else {
			System.out.println("Risposta non corretta.");
		}
		}

	public static void RimuoviArticolo(StringBuilder isbn, ArrayList<Catalogo> list) {
		list = (ArrayList<Catalogo>) list.stream()
				.filter(e -> e.isbn != isbn).collect(Collectors.toList());
	}




}

