package controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import model.Cliente;

public class Main {

static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TeoriaGiorno12JPAProject");	
static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		try {
//	  Cliente c = new Cliente();
//	  c.setNome("Eleonora");
//	  c.setCognome("Ross");
//	  c.setEmail("ele@r.it");
//	  c.setDataNascita(LocalDate.of(1999, 01, 12));
//	  c.setRegione("Molise");
//	  
	//  inserisciCliente(c);
			
//	   Cliente c =leggiCliente(5);
//	   System.out.println(c);
	
//	   c.setCognome("Matte");
//	  modificaCliente(c);
//    refresh(c);
	  
//	  eliminaCliente(c);
	  }catch(Exception e ) {
		  e.printStackTrace();
	  }finally {
		  em.close();
		  emf.close();
	  }
		
	}

	
	public static void inserisciCliente(Cliente c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		System.out.println(c.getNome() + " " + c.getCognome() + " inserito");
	}
	
	public static void modificaCliente(Cliente c) {
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
		System.out.println(c.getNome() + " " + c.getCognome() + "modificato");
		
	}
	
	public static void eliminaCliente(Cliente c){
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
		System.out.println(c.getNome() + " " + c.getCognome() + "eliminato");
		
	}	
	
	public static Cliente leggiCliente(Integer id) {
		em.getTransaction().begin();
		Cliente c = em.find(Cliente.class, id);
		em.getTransaction().commit();
		return c;
	}
	
}
