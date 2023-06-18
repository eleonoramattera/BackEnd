package GestioneDispositivi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import GestioneDispositivi.model.Dispositivo;

@Repository
public interface DispistivoPageableRepository extends PagingAndSortingRepository<Dispositivo, Long>{

}
