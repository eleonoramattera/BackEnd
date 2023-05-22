package catalogo_bibliografico;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import utils.JpaUtil;

public class LetturaDAO {

static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	
	public static void salva_libro(Libro li) {
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		System.out.println("Libro Salvata");
	}
	
	public static void salva_rivista(Lettura r) {
		em.getTransaction().begin();
		em.persist(r);
		em.getTransaction().commit();
		System.out.println("Rivista Salvata");
	}
	
	public static void rimuovi_lettura(Lettura le) {
		em.getTransaction().begin();
		em.remove(le);
		em.getTransaction().commit();
		System.out.println("Lettura eliminato!");
	}
	
	public static void rimuovi_libro(Libro li) {
		em.getTransaction().begin();
		em.remove(li);
		em.getTransaction().commit();
		System.out.println("Libro eliminato!");
	}
	
	public static void rimuovi_rivista(Libro r) {
		em.getTransaction().begin();
		em.remove(r);
		em.getTransaction().commit();
		System.out.println("Rivista eliminato!");
	}
	
	public static void aggiorna_libro(Libro li) {
		em.getTransaction().begin();
		em.merge(li);
		em.getTransaction().commit();
		System.out.println("Libro aggiornato!");		
	}
	
	public static void aggiorna_Rivista(Rivista r) {
		em.getTransaction().begin();
		em.merge(r);
		em.getTransaction().commit();
		System.out.println("Rivista aggiornato!");		
	}
	
	public static Lettura trova_lettura(String ISBN) {
		em.getTransaction().begin();
		Lettura le = em.find(Lettura.class, ISBN);
		em.getTransaction().commit();
		return le;
	}
	
	public static Libro trova_libro(String ISBN) {
		em.getTransaction().begin();
		Lettura li = em.find(Libro.class, ISBN);
		em.getTransaction().commit();
		return(Libro) li;
	}
	
	public static Rivista trova_rivista(String ISBN) {
		em.getTransaction().begin();
		Lettura r = em.find(Rivista.class, ISBN);
		em.getTransaction().commit();
		return(Rivista) r;
	}
	
	public static void rimuovi_con_codice_ISBN(String ISBN) {
		em.getTransaction().begin();
		Lettura le = em.find(Lettura.class, ISBN);
		em.getTransaction().commit();
		rimuovi_lettura(le);
	}
	
	public static Libro trova_libro_annoP(LocalDate data) {
		em.getTransaction().begin();
		Lettura li = em.find(Libro.class, data);
		em.getTransaction().commit();
		return(Libro) li;
	}
	
	public static Rivista trova_rivista_annoP(LocalDate data) {
		em.getTransaction().begin();
		Lettura r = em.find(Rivista.class, data);
		em.getTransaction().commit();
		return(Rivista) r;
	}
	
	public static String generatore_codice_ISBN() {		
		int limite_sinistro = 97; // lettera 'a'
	    int limite_destro = 122; // lettera 'z'
	    int lunghezza_stringa = 10;
	    Random random = new Random();
	    StringBuilder stringa_crescente = new StringBuilder(lunghezza_stringa);
	    for (int i = 0; i < lunghezza_stringa; i++) {
	        int carattere_singolo = limite_sinistro + (int) 
	          (random.nextFloat() * (limite_destro - limite_sinistro + 1));
	        stringa_crescente.append((char) carattere_singolo);
	    }
	    String codice = stringa_crescente.toString();
	    // System.out.println(codice);
		return codice;
	}
	
	public static Lettura trova_ISBN(String codice) {
		em.getTransaction().begin();
		Lettura le = em.find(Lettura.class, codice);
		em.getTransaction().commit();
		return le;
	}
	
	public static List<Lettura> trova_tutte_letture() {
		Query q = em.createNamedQuery("Lettura.trova_tutti");
		return q.getResultList();
	}
	
	public static List<Lettura> trova_per_anno_pubblicazione(LocalDate data) {
		Query q = em.createNamedQuery("Lettura.trova_per_anno");
		q.setParameter (":anno_pubblicazione", data);
		return q.getResultList();
	}
	
	public static List<Lettura> trova_per_titolo(String tit) {
		Query q = em.createNamedQuery("Lettura.trova_per_titolo");
		q.setParameter (":titolo", tit);
		return q.getResultList();
	}
	
	public static List<Lettura> trova_per_autore(String aut) {
		Query q = em.createNamedQuery("Lettura.trova_per_autore");
		q.setParameter (":autore", aut);
		return q.getResultList();
	}
}
