package GestionePrenotazioni.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import GestionePrenotazioni.model.Postazione;
import GestionePrenotazioni.model.Prenotazione;
import GestionePrenotazioni.model.Utente;
import GestionePrenotazioni.repository.PrenotazioneDAO;
import GestionePrenotazioni.repository.UtenteDAO;
import enums.OccupazionePostazione;

@Service
public class PrenotazioneService {


	@Autowired private PrenotazioneDAO pre;
	
	
@Autowired @Qualifier("Prenotazione") private ObjectProvider<Prenotazione> prenotazioneProvider;
	
	public Prenotazione creaPrenotazione() {
		return prenotazioneProvider.getObject();
	}	
		
	//JPA METHODS
	public void insertPrenotazione(Prenotazione p) {
		List<Prenotazione> listaUtenteData = getByUtenteAndDataPrenotata(p.getUtente(), p.getDataPrenotata());
		List<Prenotazione> listaPrenotazioneData = getByPostazioneAndDataPrenotata(p.getPostazione(), p.getDataPrenotata());
		if(listaUtenteData.size()>0) {
			System.out.println("prenotazione già esistente per questa data");
		} else if (listaPrenotazioneData.size()>0) {
			System.out.println("postazione è già occupata in questa data");
		}else
		pre.save(p);
		p.setOccupazione(OccupazionePostazione.OCCUPATO);
		System.out.println("PRENOTAZIONE  INSERITA NEL DB");
	}
	
	
	public void aggiornaPrenotazione(Prenotazione p) {
		pre.save(p);
		System.out.println("PRENOTAZIONE n " + p.getId() + " per la data " + p.getDataPrenotata() + " da parte dell'utente " + p.getUtente() + " E' STATA AGGIORNATA");
	}
			
	public void rimuoviPrenotazione(Long id) {
		pre.delete(findByID(id));
		System.out.println(" PRENOTAZIONE RIMOSSA");
	}
	
     public Prenotazione findByID(Long id) {
	return pre.findById(id).get();	
			}
     
     public List<Prenotazione> findAll() {
 		return  pre.findAll();	
 	}
     
     //CUSTOM METHOD
   
			
	  public List<Prenotazione> getByUtente(Utente u) {
		return  pre.findByUtente(u);	
		}
	  
	  public List<Prenotazione> getByDataPrenotata(LocalDateTime data){
		  return pre.findByDataPrenotata(data);
	  }
	  
	  public List<Prenotazione> getByUtenteAndDataPrenotata(Utente u, LocalDateTime data){
		  return pre.findByUtenteAndDataPrenotata(u, data);
	  }
			
     public List<Prenotazione> getByPostazione(Postazione p){
    	 return pre.findByPostazione(p);
     }
     
     public List<Prenotazione> getByPostazioneAndDataPrenotata(Postazione p, LocalDateTime data){
    	 return pre.findByPostazioneAndDataPrenotata(p, data);
     }
	}

