package GestionePrenotazioni.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	@Builder
	@Entity
	@Table(name = "utenti")
	public class Utente {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		@Column(nullable = false, unique = true)
		private String username;
		private String fullname;
		@Column(nullable = false, unique = true)
		private String email;
		
		public Utente(String fullname, String email, String username) {
			super();
			this.email = email;
			this.fullname = fullname;
			this.username = username;
		}
	}

