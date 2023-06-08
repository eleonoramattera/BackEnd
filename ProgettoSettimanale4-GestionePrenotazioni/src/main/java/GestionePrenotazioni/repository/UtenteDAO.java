package GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import GestionePrenotazioni.model.Edificio;
import GestionePrenotazioni.model.Utente;

public interface UtenteDAO extends JpaRepository <Utente, Long>  {

	@Query
	public List<Utente> findByUsername(String username);
	public List<Utente> findByFullname(String fullname);
}
