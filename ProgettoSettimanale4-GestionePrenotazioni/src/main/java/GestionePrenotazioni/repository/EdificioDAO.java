package GestionePrenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import GestionePrenotazioni.model.Edificio;

public interface EdificioDAO extends JpaRepository <Edificio, Long> {

	@Query
	public List<Edificio> findByCitta(String citta);
	public List<Edificio> findByNome(String nome);


}
