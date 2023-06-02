package TestJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TestJUnit.model.Prodotto;

class ProtottoTest {
Prodotto p;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("beforeAll");
	}

	
	@BeforeEach
	void setUp() throws Exception {
		p= new Prodotto("Samsung", "a40", 100);
		System.out.println("beforeEach");
	}


	@Test
	void testGetPrezzo() {
		assertTrue(p.getPrezzo()<200);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		p= null;
		System.out.println("afterEach");
		
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("afterAll");
	}


}
