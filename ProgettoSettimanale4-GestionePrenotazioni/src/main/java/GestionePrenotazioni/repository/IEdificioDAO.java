package GestionePrenotazioni.repository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Edificio;
@Repository
public interface IEdificioDAO extends CrudRepository<Edificio, Long>{

@Query(value = "SELECT e FROM Edificio e WHERE e.id = 1")
    public Edificio queryEdificioId1();
	
	public List<Edificio> findByCittà(String città);

    public List<Edificio> findByIndirizzo(String indirizzo);

    public List<Edificio> findBynome(String nome);
    
    
}

