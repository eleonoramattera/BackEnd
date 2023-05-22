package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Smartphone;
import model.Utente;

public class Main {

static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TeoriaGiorno13RelazioniJPA");	
static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		
//		Smartphone s = new Smartphone("a4", "Samsung", "64");
//		Utente u = new Utente("Mario", "Neri", 12, s);
//	
//		inserisciUtente(u);
		
//		Utente mario = leggiUtente(1);
//		System.out.println(mario);
//		System.out.println(mario.getSmartphone().getModello());
	
		
		Smartphone samsung = leggiSmartphone(1);
		System.out.println(samsung);
		System.out.println(samsung.getUtente().getNome());
		
		
		
	}
	
	//METODI CRUD
	
	public static void inserisciUtente(Utente u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
	}
	
	public static Utente  leggiUtente(int id) {
		em.getTransaction().begin();
		Utente u =em.find(Utente.class, id);
		em.getTransaction().commit();
		return u;
	}
		
		public static void inserisciSmartphine(Smartphone s) {
			em.getTransaction().begin();
			em.persist(s);
			em.getTransaction().commit();
		}
		
		public static Smartphone  leggiSmartphone(int id) {
			em.getTransaction().begin();
			Smartphone  s=em.find(Smartphone.class, id);
			em.getTransaction().commit();
			return s;
				
		
	}
	
	
	

}
