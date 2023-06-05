package GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import model.Utente;

public interface IUtenteDAO extends CrudRepository<Utente, Long>  {
	
@Query(value = "SELECT u FROM Utente u WHERE u.id = 1")
	    public Utente queryUtenteId1();

	    public List<Utente> findByCognome(String cognome);

	    public List<Utente> findByEmail(String email);

	  
}
