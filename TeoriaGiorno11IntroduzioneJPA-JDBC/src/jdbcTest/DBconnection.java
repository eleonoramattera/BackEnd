package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DBconnection {

	String url="jdbc:postgresql://localhost:5432/";
	String dbName="jpaIntroduction";
	String user="postgres";
	String pass="root";
	
	Connection conn;
	Statement st;
	
	//COSTRUTTORE
	public DBconnection() throws SQLException{
	conn = DriverManager.getConnection(url+dbName, user, pass);
	st= conn.createStatement();
	}
	
	
//METODI CRUD

//SCRIVERE/INSERIRE
	
	//INSERT INTO clienti(nome, cognome, dataNascita, regione)
    //VALUES ('Mario', 'Verdi', '01/01/1999', 'Marche'),
public void inserisciCliente(Cliente c) throws SQLException {
	String sql = "INSERT INTO clienti (nome, cognome, dataNascita, regione)" +
	             "VALUES ('"+c.getNome()+"',"
	             +"'" + c.getCognome()+"',"
	             +"'" + c.getDataNascita()+"',"
	             +"'" + c.getRegione()+"')";
	st.executeUpdate(sql);
	System.out.println(c.getNome() + " " + c.getCognome() +" salvato nel DB");
	
}


//LEGGERE 

    //SELECT * FROM clienti
public Cliente leggiCliente (Integer id) throws SQLException {
	String sql="SELECT * FROM clienti WHERE numeroCliente =" + id;
	ResultSet rs= st.executeQuery(sql);
	Cliente c = null;
	if(rs.next()) {
		Integer numeroCliente = rs.getInt("numeroCliente");
		String nome = rs.getString("nome");
		String cognome = rs.getString("cognome");
		String DataNascita = rs.getString("dataNascita");
		String regione = rs.getString("regione");
	
		c= new Cliente(numeroCliente, nome, cognome, LocalDate.parse(DataNascita), regione);
		return c;
	}else {
		return null;
	}
}

//MODIFICA

public void modificaCliente(Cliente c) throws SQLException {
	String sql ="UPDATE clienti SET "
			    + "nome = '"+c.getNome() +" ',"
			    + "cognome = '"+c.getCognome() + " ',"
			    + "dataNascita = '"+c.getDataNascita() + " ',"
			    + "regione = '"+c.getRegione() + " '"
			    + "WHERE numeroCliente =" + c.getNumeroCliente() ;
  
   st.executeUpdate(sql);
   System.out.println(c.getNome() + "" + c.getCognome()+" è stato modificato");

}

//DELETE

public  void cancellaCliente(Cliente c) throws SQLException {
	String sql = "DELETE FROM clienti WHERE numeroCliente =" + c.getNumeroCliente();
	   st.executeUpdate(sql);
	   System.out.println(c.getNome() + " " + c.getCognome() + " è stato eliminato");
}
	

//LEGGI TUTTI

public List<Cliente> leggiTuttiClienti() throws SQLException{
	
	List<Cliente> list = new ArrayList<Cliente>();
	
	String sql = "SELECT * FROM clienti";
	ResultSet rs = st.executeQuery(sql);
	while(rs.next()) {
		Integer numeroCliente = rs.getInt("numeroCliente");
		String nome = rs.getString("nome");
		String cognome = rs.getString("cognome");
		String DataNascita = rs.getString("dataNascita");
		String regione = rs.getString("regione");
	
		Cliente c =new Cliente(numeroCliente, nome, cognome, LocalDate.parse(DataNascita), regione);
		list.add(c);
	}
	System.out.println(list.size() + " numero clienti letti");
	return list;
	
}



}
