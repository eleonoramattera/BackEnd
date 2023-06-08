package GestionePrenotazioni.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import GestionePrenotazioni.model.Postazione;
import GestionePrenotazioni.model.Prenotazione;
import GestionePrenotazioni.model.Utente;

public interface PrenotazioneDAO extends JpaRepository <Prenotazione, Long>  {

	//cerca per utente e data
	public List<Prenotazione> findByUtenteAndDataPrenotata(Utente u, LocalDateTime data);
	
	//cerca per data
	public List<Prenotazione> findByDataPrenotata(LocalDateTime data);
	
	//cerca per utente
	public List<Prenotazione> findByUtente(Utente u);
	
	//cerca per postazione
	public List<Prenotazione> findByPostazione(Postazione p);
	
	//cerca per postazione e data
	public List<Prenotazione> findByPostazioneAndDataPrenotata(Postazione p, LocalDateTime data);
}
