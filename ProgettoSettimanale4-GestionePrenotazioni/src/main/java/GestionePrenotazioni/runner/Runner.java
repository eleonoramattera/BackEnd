package GestionePrenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import GestionePrenotazioni.repository.IEdificioDAO;
import GestionePrenotazioni.repository.IPostazioneDAO;
import GestionePrenotazioni.repository.IUtenteDAO;
import GestionePrenotazioni.service.PrenotazioneService;

@Component
public class Runner implements ApplicationRunner{

	

	    @Autowired
	    PrenotazioneService serviceFunctionality;
	    @Autowired
	    IEdificioDAO Edificio_InterfaceDao;
	    @Autowired
	    IUtenteDAO Utente_InterfaceDao;
	    @Autowired
	    IPostazioneDAO Postazione_InterfaceDao;

	    @Override
	    public void run(ApplicationArguments args) throws Exception {
		System.out.println("run");
		
		serviceFunctionality.CreateFUtente();
		serviceFunctionality.CreateFEdificio();
		serviceFunctionality.CreateFPrenotazione();

	
		serviceFunctionality.CreateMultiplePostazioniAssociatedWithEdificio(Edificio_InterfaceDao.queryEdificioId1());
	
		serviceFunctionality.CreateMultiplePrenotazioniAssociatedWithUtente(Utente_InterfaceDao.queryUtenteId1());
		
		serviceFunctionality
			.CreateMultiplePrenotazioniAssociatedWithPostazione(Postazione_InterfaceDao.queryPostazioneId1());
	    }
	}

}
