package prestito;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import catalogo_bibliografico.Lettura;
import utente.Utente;

@Entity
@NamedQuery(name = "Prestito.findAll", query = "SELECT p FROM Prestito p")
public class Prestito implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private String id;
	
	private LocalDate inizio_prestito;
	private LocalDate fine_prevista;
	private LocalDate fine_effettiva;
	
	@OneToOne
	private Lettura lettura_in_prestito;
	
	@OneToOne
	private Utente utente;
	
	
	
	// COSTRUTTORU
	public Prestito() {}
	
	public Prestito(Lettura lettura_in_prestito, Utente utente, LocalDate inizio_prestito, LocalDate fine_prevista,
			LocalDate fine_effettiva) {
		super();
		this.lettura_in_prestito = lettura_in_prestito;
		this.utente = utente;
		this.inizio_prestito = inizio_prestito;
		this.fine_prevista = fine_prevista;
		this.fine_effettiva = fine_effettiva;
	}
	
	
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	
	// GETTER SETTER
	public Lettura getLettura_in_prestito() {
		return lettura_in_prestito;
	}

	public void setLettura_in_prestito(Lettura lettura_in_prestito) {
		this.lettura_in_prestito = lettura_in_prestito;
	}
	
	public Utente getUtente() {
		return utente;
	}
	
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	public LocalDate getInizio_prestito() {
		return inizio_prestito;
	}
	
	public void setInizio_prestito(LocalDate inizio_prestito) {
		this.inizio_prestito = inizio_prestito;
	}
	
	public LocalDate getFine_prevista() {
		return fine_prevista;
	}
	
	public void setFine_prevista(LocalDate fine_prevista) {
		this.fine_prevista = fine_prevista;
	}
	
	public LocalDate getFine_effettiva() {
		return fine_effettiva;
	}
	
	public void setFine_effettiva(LocalDate fine_effettiva) {
		this.fine_effettiva = fine_effettiva;
	}

	
	
	//TOSTRING
	@Override
	public String toString() {
		return "Prestito [lettura_in_prestito=" + lettura_in_prestito + ", utente=" + utente + ", inizio_prestito="
				+ inizio_prestito + ", fine_prevista=" + fine_prevista + ", fine_effettiva=" + fine_effettiva + "]";
	}

}
