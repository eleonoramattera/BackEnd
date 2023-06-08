package GestionePrenotazioni.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import GestionePrenotazioni.model.Edificio;
import GestionePrenotazioni.model.Utente;
import GestionePrenotazioni.repository.EdificioDAO;

@Service
public class EdificioService {
@Autowired EdificioDAO db;
	
@Autowired @Qualifier("EdificioBean") private ObjectProvider<Edificio> edificioProvider;
	
	public Edificio creaEdificioFake() {
		return edificioProvider.getObject();	
	}
	
	
	//JPA METHOD
	public void insertEdificio(Edificio e) {
		db.save(e);
		System.out.println("edificio " + e.getNome() + " INSERITO NEL DB");
		
	}
	
	public void rimuoviEdificio(Long id) {
		db.deleteById(id);
		System.out.println("EDIFICIO DAL DB");
	}
	
	public void aggiornaEdificio(Edificio e) {
		db.save(e);
		System.out.println("EDIFICIO " + e.getNome() + " AGGIORNATO");
	}

	public Edificio findByID(Long id) {
		return db.findById(id).get();	
	}
	
	public List<Edificio> findAll() {
		return (List<Edificio>) db.findAll();	
	}
	
	//CUSTOM METHODS
	public List<Edificio> getByCitta(String citta){
		return db.findByCitta(citta);
	}
	
	public List<Edificio> getByNome(String nome){
		return db.findByNome(nome);
	}
}
