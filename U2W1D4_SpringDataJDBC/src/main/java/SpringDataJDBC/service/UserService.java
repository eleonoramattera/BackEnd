package SpringDataJDBC.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import SpringDataJDBC.model.User;
import SpringDataJDBC.repository.UserDAO;



@Service
public class UserService {
	
	@Autowired UserDAO db;
	

	@Autowired @Qualifier("AdminUserBean") ObjectProvider<User> userAdminProvider;
	@Autowired @Qualifier("CustomUserBean") ObjectProvider<User> customUserProvider;
	@Autowired @Qualifier("FakeUserBean") ObjectProvider<User> fakerUserProvider;

public User createUserAdimin() {
		return userAdminProvider.getObject();
}

public User createCustomUser() {
	return customUserProvider.getObject();
}

public User createFakerUser() {
	return fakerUserProvider.getObject();
}

//METODI DELLA CLASSE USERDAO (crud)

public void insertUser(User u ) {
	db.insert(u);
	System.out.println(u.getName() + u.getLastname() + " AGGIUNTO NEL DB");
	
}

public void updatetUser(User u ) {
	db.update(u);
	System.out.println(u.getName() + u.getLastname() + " MODIFICATO NEL DB");
	
}

public void deleteUser(long id) {
	db.delete(id);
	System.out.println( " ELIMINATO NEL DB");
	
}

public User getByIdUser(long id) {
	return db.getByID(id);

}

public List<User> getAllUser() {
	return db.gettAll();

}


}
