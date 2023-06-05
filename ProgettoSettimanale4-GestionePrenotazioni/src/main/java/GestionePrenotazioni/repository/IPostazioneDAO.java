package GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import enums.Tipo;
import model.Postazione;


@Repository
public interface IPostazioneDAO extends CrudRepository<Postazione, Long>{

	  @Query(value = "SELECT p FROM Postazione p WHERE p.id = 1")
	    public Postazione queryPostazioneId1();

	    public List<Postazione> findByDescrizionePostazione(String descrizionePostazione);

	    public List<Postazione> findByNumMaxOccupanti(Integer numMaxOccupanti);

	    public List<Postazione> findByTipo(Tipo tipo);
	}


