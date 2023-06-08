package GestionePrenotazioni.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import GestionePrenotazioni.repository.IPostazioneDAO;
import model.Edificio;
import model.Postazione;

@Service
public class PostazioneService {

//@Autowired private IPostazioneDAO db;
	
@Autowired @Qualifier("PostazioneBean") private ObjectProvider<Postazione> postazioneProvider;
	
	public Postazione createPostazione() {
		return postazioneProvider.getObject();
	}
}
