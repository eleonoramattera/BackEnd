package SpringDataJDBC.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {
	private Long id; // mi serve per il db
	private String name;
	private String lastname;
	private String city;
	private Integer age;
	private String email;
	
	//COSTRUTTORE con tutti le properità tranne id 
	// perchè quando creo un nuovo user id non ce l'ho
	public User(String name, String lastname, String city, Integer age, String email) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.city = city;
		this.age = age;
		this.email = email;
	}
	
	

}
