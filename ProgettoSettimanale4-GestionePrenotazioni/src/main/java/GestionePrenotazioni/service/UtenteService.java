package GestionePrenotazioni.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import GestionePrenotazioni.repository.IUtenteDAO;
import model.Utente;

@Service
public class UtenteService {
	//@Autowired private IUtenteDAO db;

	@Autowired @Qualifier("UtenteFakBean") private ObjectProvider<Utente> UtenteFakeProvider;
	
	public Utente creaUtenteFake() {
		return UtenteFakeProvider.getObject();
	
	}
	

}
