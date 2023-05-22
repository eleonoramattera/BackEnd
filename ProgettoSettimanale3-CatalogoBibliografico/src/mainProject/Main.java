package mainProject;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import catalogo_bibliografico.Periodicita;
import catalogo_bibliografico.Lettura;
import catalogo_bibliografico.LetturaDAO;
import catalogo_bibliografico.Libro;
import catalogo_bibliografico.Periodicita;
import catalogo_bibliografico.Rivista;
import utils.JpaUtil; 

public class Main {
	
	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	public static void main(String[] args) {
	
				Libro l1 = new Libro();
				String ISBN1 = LetturaDAO.generatore_codice_ISBN();
				l1.setCodice_ISBN(ISBN1);
				l1.setTitolo("Libro di Mario");
				l1.setAnno_pubblicazione(LocalDate.of(1900,01,12));
				l1.setNumero_pagine(600);
				l1.setAutore("Mario Verdi");
				l1.setGenere("Libro avv");
				
		
				
				Rivista r1 = new Rivista();
				String ISBN2 = LetturaDAO.generatore_codice_ISBN();
				r1.setCodice_ISBN(ISBN2);
				r1.setTitolo("Rivistaa");
				r1.setAnno_pubblicazione(LocalDate.of(2007,10,11));
				r1.setNumero_pagine(100);
				r1.setPeriodicità(Periodicita.MENSILE);
				
				
				Libro libroDaCercare = LetturaDAO.trova_libro(ISBN1);
				Rivista RivistaDaCercare = LetturaDAO.trova_rivista(ISBN2);
			
				//elimina
				LetturaDAO.rimuovi_con_codice_ISBN(ISBN1);
				
				
				// Ricerca per anno pubb
				List<Lettura> elenco_per_anno = LetturaDAO.trova_per_anno_pubblicazione(LocalDate.of(1900,01,12));
				
				// Ricerca  autore
				List<Lettura> elenco_per_autore = LetturaDAO.trova_per_autore("Mario Verdi");
				
				// Ricerca per titolo
				List<Lettura> elenco_per_titolo = LetturaDAO.trova_per_titolo("Rivistaa");
				
				// Ricerca degli elementi attualmente in prestito dato un numero di tessera utente
				
				
		
				
			}

	}


