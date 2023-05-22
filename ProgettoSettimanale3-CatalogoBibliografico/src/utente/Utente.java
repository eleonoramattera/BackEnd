package utente;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numero_tessere;
	private String nome;
	private String cognome;
	private LocalDate data_di_nascita;
	
	//COSTRUTTORI
	public Utente() {}
	
	public Utente(Long numero_tessere, String nome, String cognome, LocalDate data_di_nascita) {
		super();
		this.numero_tessere = numero_tessere;
		this.nome = nome;
		this.cognome = cognome;
		this.data_di_nascita = data_di_nascita;
	}

	
	
	// GETTER SETTER
	public Long getNumero_tessere() {
		return numero_tessere;
	}
	
	public void setNumero_tessere(Long numero_tessere) {
		this.numero_tessere = numero_tessere;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public LocalDate getData_di_nascita() {
		return data_di_nascita;
	}
	
	public void setData_di_nascita(LocalDate data_di_nascita) {
		this.data_di_nascita = data_di_nascita;
	}

	
	//TOSTRING
	@Override
	public String toString() {
		return "Utente [numero_tessere=" + numero_tessere + ", nome=" + nome + ", cognome=" + cognome
				+ ", data_di_nascita=" + data_di_nascita + "]";
	}
}
