package GestioneDispositivi.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import GestioneDispositivi.model.Dipendente;
import GestioneDispositivi.model.Dispositivo;
import GestioneDispositivi.model.StatoDispositivo;
import GestioneDispositivi.model.TipoDispositivo;

public interface DispositivoDAORepository extends JpaRepository<Dispositivo, Long>, 
                                                  PagingAndSortingRepository<Dispositivo, Long> {

		Page<Dispositivo> findByStato(StatoDispositivo stato, Pageable pageable);
		Page<Dispositivo> findByTipo(TipoDispositivo tipo, Pageable pageable);
		Page<Dispositivo> findByStatoAndTipo(StatoDispositivo stato, TipoDispositivo tipo, Pageable pageable);
		
		List<Dispositivo> findByDipendente(Dipendente dip);
}
