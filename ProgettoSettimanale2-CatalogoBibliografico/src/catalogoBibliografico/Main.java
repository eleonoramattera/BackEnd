package catalogoBibliografico;


import java.io.File;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
		// RICERCA X ANNO O AUTORE

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
		Libri a1 = new Libri(4554754, "Guerra e Pace", 1865, 1415, "Lev Tolstoj", Genere.HORROR);
    	Libri a2 = new Libri(65645, "Il barone rampante", 1957, 312, "Italo Calvino", Genere.HISTORY);
		Libri a3 = new Libri(23432, "Moby Dick", 1851, 750, "Herman Melville", Genere.NOVEL);
		Libri a4 = new Libri(5432, "Lepanto", 2010, 784, "Alessandro Barbero", Genere.THRILLER);
     	Libri a5 = new Libri(54343, "Delitto e castigo", 1866, 784, "Fedor", Genere.FANTASY);
    	Rivista a6 = new Rivista(5342345, "Focus", 2022, 150, PeriodicitaRiviste.MENSILE);
		Rivista a7 = new Rivista(5342345, "Focus", 2022, 150, PeriodicitaRiviste.SETTIMANALE);
		
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
		List<Catalogo>.stream()
				.filter(singoloLibro -> ((Libro) singoloLibro).getAutore().toUpperCase().contains(aut.toUpperCase()))
				.forEach(Libro -> System.out.println(Libro.toString()));
	}

	public static void aggiungiArticolo(ArrayList<Catalogo> list) {
		StringBuilder BufferPass = new StringBuilder();
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
			String gen = s.nextLine();
			int g =1;
			while(g>0) {
				switch( gen) {
				case "HORROR":
				  g=1;
				  break;
				case "FANTASY":
					g = 2;
					break;
				case "HISTORY":
					g = 3;
					break;
				case "NOVEL":
					g = 4;
					break;
				case "THRILLER":
					g = 5;
					break;
				default:
					System.out.println("Devi digitare  HORROR, FANTASY, HISTORY, NOVEL, THRILLER Riprova: ");
					break;
				
			}
			Libri a7 = new Libri(isbn, tit, aPub, nPag, Aut, gen );
			list.add(a7);
			} else if (res.equals("RIVISTA")) {
			System.out.println("Digita il Titolo, anno di pubblicazione, numero pagine, periodicità");
			System.out.println("Titolo: ");
			String tit = s.nextLine();
			System.out.println("anno di pubblicazione: ");
			int aPub = s.nextInt();
			s.nextLine();
			System.out.println("numero pagine: ");
			int nPag = s.nextInt();
			s.nextLine();
			System.out.println("Periodicità: SETTIMANALE, MENSILE, SEMESTRALE");
			String per =s.nextLine().toUpperCase();
			int Check = 1;
			while (Check > 0) {
				switch (per) {
				case "SETTIMANALE":
					Check = 0;
					break;
				case "MENSILE":
					Check = 0;
					break;
				case "SEMESTRALE":
					Check = 0;
					break;
				default:
					System.out.println("Devi digitare SETTIMANALE, MENSILE, SEMESTRALE, ridigita: ");
					break;
				}
			}

			
			Rivista a8 = new Rivista(isbn, tit, aPub, nPag, per);
			list.add(a8);
		} else {
			System.out.println("Risposta non corretta.");
		}
		}

	public static void RimuoviArticolo(StringBuilder isbn, ArrayList<Catalogo> list) {
		list = (ArrayList<Catalogo>) list.stream().filter(e -> e.getCod_ISBN() != isbn).collect(Collectors.toList());
	}




}

