package SpringDataJDBC.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import SpringDataJDBC.model.User;
import SpringDataJDBC.service.UserService;

@Component
public class UserRunner implements CommandLineRunner{

	@Autowired private UserService userService;
	//private UserSevice userService = new UserSevice();
	@Override
	public void run(String... args) throws Exception {
		User u1 =userService.createFakerUser();
		User u2= userService.createUserAdimin();
		 User u3= userService.createCustomUser();
		 u3.setAge(20);
		 u3.setCity("Empoli");
		 u3.setEmail("email@email.it");
         u3.setLastname("Banfi");
         u3.setName("Lino");
         
         System.out.println(u1);
         System.out.println(u2);
         System.out.println(u3);
         
         
         //uso i metodi del service
         
         //inserisco
//         userService.insertUser(u1);
//         userService.insertUser(u2);
//         userService.insertUser(u3);
         
         //leggo
         //userService.getAll().forEach(u -> System.out.println(u));
         
         //modifico
//      	User editUser = userService.getByIdUser(2);
//     	editUser.setAge(99);
//		userService.updatetUser(editUser);
         
         //elimino
	//   userService.deleteUser(1);
	
         
         
         
	}

}
