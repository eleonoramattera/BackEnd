package SpringExample.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import SpringExample.model.User;
import SpringExample.service.UserService;

@Component
public class UserRunner implements CommandLineRunner {
    
	@Autowired//istanzia oggetto e lo inietta nella variabile
	//this.userService = new UserService()
	public UserService userService;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = userService.createUserAdimin();
		User u2 = userService.createCustomUser();
		u2.setAge(22);
		u2.setCity("Milano");
		u2.setEmail("email@email.it");
		u2.setLastname("Rossi");
		u2.setName("Ele");
		User u3 = userService.createFakerUser();
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		
		
	}

}
