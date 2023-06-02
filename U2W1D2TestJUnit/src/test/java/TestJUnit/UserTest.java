package TestJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TestJUnit.model.User;

class UserTest {
	User u;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("beforeAll");
	}

	
	@BeforeEach
	void setUp() throws Exception {
		u = new User("Antonio", "Bianchi", "a.bianchi@example.com", "querty");
		System.out.println("beforeEach");
	}

	

	@Test
	void testGetEmail() {
	assertEquals("a.bianchi@example.com", u.getEmail());
	}

	@Test
	void testGetPassword() {
		assertTrue(u.getPassword().length()>4);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		u = null;
		System.out.println("afterEach");
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}


}
