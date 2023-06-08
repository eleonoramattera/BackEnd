package GestionePrenotazioni.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import GestionePrenotazioni.model.Edificio;
import GestionePrenotazioni.model.Postazione;
import enums.OccupazionePostazione;
import enums.Tipo;

public interface PostazioneDAO extends JpaRepository <Postazione, Long>  {

//	
//	@Query(value = "SELECT p FROM Postazione p INNER JOIN p.edificio e WHERE LOWER(e.citta) LIKE LOWER('%' || :citta || '%')")
//	public List<Postazione> listByCitta(String citta);
//	
//	@Query(value = "SELECT p FROM Postazione p WHERE p.type LIKE :type")
//	public List<Postazione> listByType(Tipo type);
//
	
//cerca per edificio
	public List<Postazione> findByEdificio(Edificio e);
	
	//cerca per tipo
	public List<Postazione> findByTipo (Tipo tipo);
	
	//cerca per edificio tipo
	public List<Postazione> findByEdificioAndTipo(Edificio e, Tipo tipo);
	

	//cerca per occupazione ed edificio 
	public List<Postazione> findByEdificioAndOccupazionePostazione (Edificio e,  OccupazionePostazione op);
	
}
