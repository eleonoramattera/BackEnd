package GestioneDispositivi.repository;


import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import GestioneDispositivi.model.Dipendente;

@Repository
public interface DipendenteDAORepository extends JpaRepository<Dipendente, Long>{
                                                 

		public boolean existsByEmail(String email);
		
		public boolean existsByUsername(String username);
		
		public Dipendente findByEmail(String email);
		public Dipendente findByUsername(String username);


	


		
	}

