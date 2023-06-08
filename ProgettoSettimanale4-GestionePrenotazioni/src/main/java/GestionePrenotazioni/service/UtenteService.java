package GestionePrenotazioni.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import GestionePrenotazioni.model.Utente;
import GestionePrenotazioni.repository.UtenteDAO;

@Service
public class UtenteService {

	@Autowired UtenteDAO db;
	
@Autowired @Qualifier("UtenteFakeBean") private ObjectProvider<Utente> utentefakeProvider;
	
	public Utente creaUtenteFake() {
		return utentefakeProvider.getObject();
	}
	
	//JPA METHOD
	public void insertUtente(Utente u) {
		db.save(u);
		System.out.println(u.getFullname() + " INSERITO NEL DB");
	}
	
	public void rimuoviUtente(Long id) {
		db.delete(findByID(id));
		System.out.println("UTENTE RIMOSSO DAL DB");
	}
	
	public void aggiornaUtente(Utente u) {
		db.save(u);
		System.out.println("UTENTE " + u.getFullname() + " AGGIORNATO");
	}

	public Utente findByID(Long id) {
		return db.findById(id).get();	
	}
	
	public List<Utente> findAll() {
		return  db.findAll();	
	}
	
	//CUSTOM METHODS
	public List<Utente> getByFullname(String fullname){
		return db.findByFullname(fullname);
	}
	
	public List<Utente> getByUsername(String username){
		return db.findByUsername(username);
	}
}

