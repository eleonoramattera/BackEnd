package SpringDataJPA.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import SpringDataJPA.model.User;
import SpringDataJPA.service.UserService;

@Component
public class UserRunner implements CommandLineRunner{

	@Autowired UserService userService;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = userService.createAdminUser();
		User u2 = userService.createFakeUser();
	
		
		User u3 = userService.createCustomUser();
		u3.setName("Giuseppe");
		u3.setLastname("Verdi");
		u3.setCity("Roma");
		u3.setAge(29);
		u3.setEmail("g.verdi@example.com");
		

        //uso i metodi del service
        
        //inserisco
//        userService.insertUser(u1);
//        userService.insertUser(u2);
//        userService.insertUser(u3);
        

		//modifico
//		User editUser = userService.getByID(1);	
//		editUser.setAge(99);
//		editUser.setCity("Milano");
//		userService.updateUser(editUser);
	
		//cancello
//		User deleteUser = userService.getByID(1);	
//		userService.deleteUser(deleteUser);
		
		//getAll
	//	userService.getAll().forEach(u -> System.out.println(u));
		
		
		
		
		
		
	
//		userService.getByCity("Roma").forEach(u -> System.out.println(u));
		
//		userService.getByAgeBetween(30, 40).forEach(u -> System.out.println(u));
	
//		userService.getAllUserRM_MI_NA().forEach(u -> System.out.println(u));
	
//		userService.getUserGTAge(40).forEach(u -> System.out.println(u));
		
	}

}
