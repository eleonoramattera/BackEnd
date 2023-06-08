package GestionePrenotazioni.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import GestionePrenotazioni.model.Edificio;
import GestionePrenotazioni.model.Postazione;
import GestionePrenotazioni.model.Utente;
import GestionePrenotazioni.repository.PostazioneDAO;
import enums.OccupazionePostazione;
import enums.Tipo;


  @Service
public class PostazioneService {
	  
	  @Autowired PostazioneDAO post;
	  
	  
@Autowired @Qualifier("PostazioneBean") private ObjectProvider<Postazione> postazioneProvider;
	
	public Postazione creaPostazione() {
		return postazioneProvider.getObject();
		
	}
	
	
	//JPA METHOD
		public void insertPostazione(Postazione p) {
			post.save(p);
			System.out.println( "POSTAZIONE" + p.getId() + " INSERITA NEL DB");
		}
		
		public void rimuoviPostazione(Long id) {
			post.deleteById(id);
			System.out.println("POSTAZIONE RIMOSSA DAL DB");
		}
		
		public void aggiornaPostazione(Postazione p) {
			post.save(p);
			System.out.println("POSTAZIONE " + p.getDescrizionePostazione()+ " AGGIORNATA");
		}

		public Postazione getByID(Long id) {
			return post.findById(id).get();	
		}
		
		public List<Postazione> findAll() {
			return (List<Postazione>) post.findAll();	
		}
		
		//CUSTOM METHODS
		
		public List<Postazione> getByEdificio(Edificio e){
		   return post.findByEdificio(e);
		}
		
		public List<Postazione> getByTipo(Tipo tipo){
			return post.findByTipo(tipo);
			}
		
		public List<Postazione> getByEdificioAndTipo(Edificio e, Tipo tipo){
			return post.findByEdificioAndTipo(e, tipo);
			}
		
		public List<Postazione> getByEdificioAndOccupazionePostazione(Edificio e, OccupazionePostazione op){
			return post.findByEdificioAndOccupazionePostazione(e, op);
			}
}
