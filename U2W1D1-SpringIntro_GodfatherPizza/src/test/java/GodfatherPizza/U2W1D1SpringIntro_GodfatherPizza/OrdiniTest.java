package GodfatherPizza.U2W1D1SpringIntro_GodfatherPizza;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import enums.StatoOrdine;
import enums.StatoTavolo;
import model.DrinkAcqua;
import model.DrinkLimonata;
import model.Ordine;
import model.PizzaMargherita;
import model.PizzaSalame;
import model.Tavolo;

class OrdiniTest {

	Tavolo t;
	Ordine o;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("--- Test Ordine ---");
	}

	@BeforeEach
	void setUp() throws Exception {
		t = new Tavolo(1, 4);
		o = new Ordine(1, t, 2, "2");
		o.getListaOrdine().add(new PizzaMargherita());
		o.getListaOrdine().add(new PizzaSalame());
		o.getListaOrdine().add(new DrinkLimonata());
		o.getListaOrdine().add(new DrinkAcqua());
	}

	@Test
	void testGetNewTavolo() {
		t = new Tavolo(1, 4);
		equals( t.getStato().compareTo(StatoTavolo.LIBERO));
		System.out.println("testGetNewTavolo: ");
	}

	@Test
	void testGetTavolo() {
		o.getTavolo().getStato();
		equals( t.getStato().compareTo(StatoTavolo.OCCUPATO));
	System.out.println("testsTavolo");
	}

	@Test
	void testGetStatoOrdine() {
		assertEquals( StatoOrdine.INCORSO,  o.getStatoOrdine().INCORSO);
		System.out.println("testGetTotale");
	}

	@Test
	void testGetNumeroCoperti() {
		assertTrue(t.getNumeroCoperti() >= o.getNumeroCoperti());
		System.out.println("testGetNumeroCoperti: " );
	}

	@Test
	void testGetTotaleConto() {
		assertEquals(14.059999999999999, o.calcolaTotale());
		System.out.println("testGetTotale");
	}

	@AfterEach
	void tearDown() throws Exception {
		t = null;
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("--- Fine Test Ordine ---");
	}
}
