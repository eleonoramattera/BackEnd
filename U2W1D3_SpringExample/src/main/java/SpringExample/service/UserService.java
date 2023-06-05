package SpringExample.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import SpringExample.model.User;

@Service
public class UserService {
	
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

}
