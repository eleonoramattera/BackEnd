package GestioneDispositivi.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import GestioneDispositivi.model.Dipendente;

@Repository
public interface DipendentePageableRepository  extends PagingAndSortingRepository<Dipendente, Long> {

	public Page<Dipendente> findAll(Pageable pageable);
}
