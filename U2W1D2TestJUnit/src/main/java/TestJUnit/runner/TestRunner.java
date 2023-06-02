package TestJUnit.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import TestJUnit.configuration.UserConfiguration;
import TestJUnit.model.User;

@Component
public class TestRunner implements CommandLineRunner {

	 Logger log = LoggerFactory.getLogger(TestRunner.class);
	
	 @Override
	public void run(String... args) throws Exception {
		System.out.println("RUN frate'");
		
		log.info("Test logger");
		
		configBean();
		
	}


	
	public void configBean() {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(UserConfiguration.class);
	 
		User u1 = (User) appContext.getBean("customUser");
		System.out.println(u1);
		User u2 = (User) appContext.getBean("adminUser");	
		System.out.println(u2);
		User u3 = (User) appContext.getBean("newUser", "Luca", "neri", "ln@gmail.com", "qwerty");
		System.out.println(u3);
		
		appContext.close();
	
	}
	}
