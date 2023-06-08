package GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import enums.Tipo;
import model.Postazione;

public interface IPostazioneDAO extends JpaRepository <Postazione, Long> {
	
	  @Query(value = "SELECT p FROM postazione p WHERE p.id = 1")
	    public Postazione querypostazioneid1();

	    public List<Postazione> findBydescrizionepostazione(String descrizionepostazione);

	    public List<Postazione> findBynummaxoccupanti(Integer nummaxoccupanti);

	    public List<Postazione> findByTipo(Tipo tipo);
}
