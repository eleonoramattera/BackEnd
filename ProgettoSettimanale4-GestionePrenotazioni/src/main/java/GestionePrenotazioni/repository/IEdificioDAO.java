package GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import model.Edificio;

public interface IEdificioDAO extends JpaRepository <Edificio, Long>  {

//	@Query(value = "SELECT e FROM Edificio e WHERE e.id = 1")
//    public Edificio queryEdificioId1();
//	
//	public List<Edificio> findByCittà(String città);
//
//    public List<Edificio> findByIndirizzo(String indirizzo);
//
//    public List<Edificio> findBynome(String nome);
    
}
