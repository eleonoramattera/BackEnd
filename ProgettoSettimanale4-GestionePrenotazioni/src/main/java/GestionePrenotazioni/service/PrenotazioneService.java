package GestionePrenotazioni.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import GestionePrenotazioni.repository.IEdificioDAO;
import GestionePrenotazioni.repository.IPostazioneDAO;
import GestionePrenotazioni.repository.IUtenteDAO;
import model.Edificio;
import model.Postazione;
import model.Prenotazione;
import model.Utente;

public class PrenotazioneService {
	
	@Service
	public class Prenotazione_Service {

	    @Autowired
	    private IEdificioDAO edificio_dao;
	    @Autowired
	    private IPostazioneDAO postazione_dao;
	    @Autowired
	    private IUtenteDAO utente_dao;
	    @Autowired
	    private IPostazioneDAO prenotazione_dao;

	    @Autowired @Qualifier("FakePostazione") private ObjectProvider<Postazione> FakePostazione;
	    @Autowired @Qualifier("FakeEdificio") private ObjectProvider<Edificio> FakeEdificio;
	    @Autowired @Qualifier("FakeUtente") private ObjectProvider<Utente> FakeUtente;
	    @Autowired  @Qualifier("FakePrenotazione")  private ObjectProvider<Prenotazione> FakePrenotazione;

	    public void CreateFPostazione() {
		insertPostazione(FakePostazione.getObject());

	    }

	    public void CreateFUtente() {
		insertUtente(FakeUtente.getObject());
	    }

	    public void CreateFEdificio() {
		insertEdificio(FakeEdificio.getObject());
	    }

//	    public void CreateFPrenotazione() {
//		insertPrenotazione(FakePrenotazione.getObject());
//	    }

	    public void insertPostazione(Postazione p) {
		postazione_dao.save(p);
	    }

	    public void insertUtente(Utente u) {
		utente_dao.save(u);
	    }

	    public void insertEdificio(Edificio e) {
		edificio_dao.save(e);
	    }

//	    public void insertPrenotazione(Prenotazione pre) {
//		prenotazione_dao.save(pre);
//	    }

	    public List<Postazione> CreateMultiplePostazioniAssociatedWithEdificio(Edificio edificio) {
		// creo lista di postazioni
		List<Postazione> listPostazioni = new ArrayList<Postazione>();

		// creo 3 FakePostazioni salvandole nel database
		Postazione p1 = postazione_dao.save(FakePostazione.getObject());
		Postazione p2 = postazione_dao.save(FakePostazione.getObject());
		Postazione p3 = postazione_dao.save(FakePostazione.getObject());

		// le aggiungo alla lista postazioni
		listPostazioni.add(p1);
		listPostazioni.add(p2);
		listPostazioni.add(p3);
		// ritorno la lista di postazioni
		return listPostazioni;
	    }

//	    public List<Prenotazione> CreateMultiplePrenotazioniAssociatedWithUtente(Utente utente) {
//
//		List<Prenotazione> listPrenotazioni = new ArrayList<Prenotazione>();
//
//		
//		Prenotazione p1 = prenotazione_dao.save(FakePrenotazione.getObject());
//		Prenotazione p2 = prenotazione_dao.save(FakePrenotazione.getObject());
//		Prenotazione p3 = prenotazione_dao.save(FakePrenotazione.getObject());
//
//		listPrenotazioni.add(p1);
//		listPrenotazioni.add(p2);
//		listPrenotazioni.add(p3);
//		
//		return listPrenotazioni;
//	    }

//	    public List<Prenotazione> CreateMultiplePrenotazioniAssociatedWithPostazione(Postazione Postazione) {
//	    	
//		List<Prenotazione> listPrenotazioni = new ArrayList<Prenotazione>();
//
//		Prenotazione pre1 = prenotazione_dao.save(FakePrenotazione.getObject());
//		Prenotazione pre2 = prenotazione_dao.save(FakePrenotazione.getObject());
//		Prenotazione pre3 = prenotazione_dao.save(FakePrenotazione.getObject());	
//		listPrenotazioni.add(pre1);
//		listPrenotazioni.add(pre2);
//		listPrenotazioni.add(pre3);
//		
//		return listPrenotazioni;
//	    }
	}


}
