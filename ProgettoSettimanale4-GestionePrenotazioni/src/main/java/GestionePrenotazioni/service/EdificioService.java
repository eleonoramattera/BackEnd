package GestionePrenotazioni.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import GestionePrenotazioni.repository.IEdificioDAO;
import model.Edificio;

@Service
public class EdificioService {
	
	//@Autowired private IEdificioDAO db;
	
	@Autowired @Qualifier("EdificioBean") private ObjectProvider<Edificio> edificioProvider;
	
	public Edificio createEdificio() {
		return edificioProvider.getObject();
	}
	

	
	
}
