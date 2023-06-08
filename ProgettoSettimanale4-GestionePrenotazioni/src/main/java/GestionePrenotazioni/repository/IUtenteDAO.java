package GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Utente;

public interface IUtenteDAO extends JpaRepository<Utente, Long>{
//	
//@Query(value = "SELECT u FROM Utente u WHERE u.id = 1")
//	    public Utente queryUtenteId1();
//
//	    public List<Utente> findByCognome(String cognome);
//
//	    public List<Utente> findByEmail(String email);

}
