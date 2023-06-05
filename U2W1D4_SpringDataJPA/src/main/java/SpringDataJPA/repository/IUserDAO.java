package SpringDataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringDataJPA.model.User;

public interface IUserDAO extends JpaRepository <User, Long>{

	//in JDBC qui creavo metodi crud che definivo nella classeDAO,
	//usavo nel service ed eseguivo nel runner
}
