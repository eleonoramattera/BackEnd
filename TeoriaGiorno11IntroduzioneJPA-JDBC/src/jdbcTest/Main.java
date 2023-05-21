package jdbcTest;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//SCRIVERE
	/*	try {
			DBconnection db = new DBconnection();
			System.out.println("sei connesso");
			Cliente c =new Cliente("Eleonora", "Mattera", LocalDate.of(1998,01,02), "Campania");
		    db.inserisciCliente(c);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	*/	
		//LEGGERE
	/*	try {
			DBconnection db = new DBconnection();
			System.out.println("sei connesso");
			Cliente c = db.leggiCliente(2);
			System.out.println(c);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	*/	
		//MODIFICARE
		
		/*	DBconnection db;
			try {
				db = new DBconnection();
				Cliente c = db.leggiCliente(3);
				
				c.setRegione("MARCHE");
				db.modificaCliente(c);
				System.out.println(c);
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
        */
		
		//ELIMINA
	/*	 try {
			DBconnection db = new DBconnection();
			Cliente c = db.leggiCliente(7);
			System.out.println(c);
			
			db.cancellaCliente(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/	 
			
		//LEGGI TUTTO
		 try {
			DBconnection db = new DBconnection();
			List<Cliente> listaClienti = db.leggiTuttiClienti();
			listaClienti.forEach(c -> System.out.println(c));
			
			Cliente modificato = listaClienti.get(2);
			modificato.setCognome("Rocchini");
			db.modificaCliente(modificato);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
			
	}

}
