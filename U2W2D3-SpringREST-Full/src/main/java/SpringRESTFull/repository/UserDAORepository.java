package SpringRESTFull.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringRESTFull.model.User;

@Repository
public interface UserDAORepository extends JpaRepository<User, Long>{

	//cerca id
	//se devo cancellare o modificare o leggere elem devo verificare se id esiste
	public boolean existsById(Long id);
	
	//email già esistente
	//mi serve quando inserisco un nuovo ogg perchè se email è univoca non devo poterlo fare
	public boolean existsByEmail(String email);
}
