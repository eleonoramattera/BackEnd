package GestionePrenotazioni.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import GestionePrenotazioni.model.Edificio;
import GestionePrenotazioni.model.Postazione;
import GestionePrenotazioni.model.Prenotazione;
import GestionePrenotazioni.model.Utente;
import GestionePrenotazioni.service.EdificioService;
import GestionePrenotazioni.service.UtenteService;
import enums.Tipo;
import GestionePrenotazioni.service.PostazioneService;
import GestionePrenotazioni.service.PrenotazioneService;

@Component
public class PrenotazioniRunner implements CommandLineRunner {

	@Autowired private UtenteService utenteService;
	@Autowired private EdificioService edificioService;
	@Autowired private PostazioneService postazioneService;
	@Autowired private PrenotazioneService prenotazioneService;
	
	@Override
	public void run(String... args) throws Exception {
	 System.out.println("RUNNER");
		
	 //CREO UTENTI
     Utente u1=	 utenteService.creaUtenteFake();
     Utente u2=	 utenteService.creaUtenteFake();
     Utente u3=	 utenteService.creaUtenteFake();
     System.out.println(u1);
     System.out.println(u2);
     System.out.println(u3);
     
     //LI INSERISCO NEL DB
     utenteService.insertUtente(u1);
     utenteService.insertUtente(u2);
     utenteService.insertUtente(u3);
     
     //CREO EDIFICI
     Edificio e1= edificioService.creaEdificioFake();
     e1.setCitta("Roma");
     e1.setIndirizzo("via Abc");
     e1.setNome("Edificio1");
     e1.setListaPostazioni(null);
     
     Edificio e2= edificioService.creaEdificioFake();
     e2.setCitta("Ancora");
     e2.setIndirizzo("via Abcd");
     e2.setNome("Edificio2");
     Edificio e3= edificioService.creaEdificioFake();
     e3.setCitta("Trieste");
     e3.setIndirizzo("via Abcdef");
     e3.setNome("Edificio3");
     
     //LI INSERISCO NEL DB
     edificioService.insertEdificio(e1);
     edificioService.insertEdificio(e2);
     edificioService.insertEdificio(e3);
     
     //CREO POSTAZIONI
     Postazione p1=postazioneService.creaPostazione();
     p1.setDescrizionePostazione("Descrizione1");
     p1.setEdificio(e1);
     p1.setNumMaxOccupanti(8);
     p1.setTipo(Tipo.OPENSPACE);
     Postazione p2=postazioneService.creaPostazione();
     p2.setDescrizionePostazione("Descrizione2");
     p2.setEdificio(e2);
     p2.setNumMaxOccupanti(4);
     p2.setTipo(Tipo.PRIVATO);
     Postazione p3=postazioneService.creaPostazione();
     p3.setDescrizionePostazione("Descrizione3");
     p3.setEdificio(e3);
     p3.setNumMaxOccupanti(28);
     p3.setTipo(Tipo.SALA_RIUNIONI);
     
     //LE INSERISCO NEL DB
     postazioneService.insertPostazione(p1);
     postazioneService.insertPostazione(p2);
     postazioneService.insertPostazione(p3);
     
   
//     //INSERISCO LE POSTAZIONI NEGLI EDIFICI
//     //EDIFICIO1
//     List<Postazione> listaPostazioni = new ArrayList<Postazione>();
//     listaPostazioni.add(p1);
//     listaPostazioni.add(p2);
//     listaPostazioni.add(p3);
//     e1.setListaPostazioni(listaPostazioni);
     
     //CREO PRENOTAZIONE
     
     Prenotazione pre1 =prenotazioneService.creaPrenotazione();
     pre1.setDataPrenotata(LocalDateTime.now());
     pre1.setPostazione(p1);
     pre1.setUtente(u1);
     prenotazioneService.insertPrenotazione(pre1);
     System.out.println(pre1);
     
     
     
     Scanner s = new Scanner(System.in);
     System.out.println("vuoi prenotare una postazione? si/ no");
     String resp = s.nextLine();
     if(resp == "no") {
    	 System.out.println("sei uscito");
     } else if (resp == "yes") {
    	
     }
     
	}
	

}
