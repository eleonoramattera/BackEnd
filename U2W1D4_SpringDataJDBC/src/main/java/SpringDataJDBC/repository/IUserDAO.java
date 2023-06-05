package SpringDataJDBC.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import SpringDataJDBC.model.User;

@Repository
public interface IUserDAO {
	
public void insert(User u);
public void update(User u );
public void delete(long id);
public User getByID(long id);
public List<User> gettAll();

}
