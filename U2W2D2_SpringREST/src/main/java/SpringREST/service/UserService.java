package SpringREST.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringREST.model.User;
import SpringREST.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired UserRepository userRepo;
	
	public String registerUserMethod(User u) {
		userRepo.save(u);
		return "User " + u.getName() + " " + u.getLastname() + " salvato nel DB";
	}

	public String loginUserMethod(User user) {
	User u=userRepo.findByEmailAndPassword(user.getEmail(),user.getPassword());
	return "User " + u.getName() + " " + u.getLastname() + " logged";
	}


	
}

