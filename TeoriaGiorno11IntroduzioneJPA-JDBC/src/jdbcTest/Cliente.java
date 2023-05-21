package jdbcTest;

import java.time.LocalDate;

public class Cliente {
	private Integer numeroCliente;
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private String regione;
	
	

//COSTRUTTORE SENZA ID(numeroCliente) PER SCRIVERE SUL DB
	public Cliente(String nome, String cognome, LocalDate dataNascita, String regione) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.regione = regione;
	}

//COSTRUTTORE CON ID (numeroCliente) PER LEGGERE SUL DB
	public Cliente(Integer numeroCliente, String nome, String cognome, LocalDate dataNascita, String regione) {
		super();
		this.numeroCliente = numeroCliente;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.regione = regione;
	}

	
//GETTER E SETTER
	
	public long getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(Integer numeroCliente) {
		this.numeroCliente = numeroCliente;
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

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	
//TOSTRING()
	@Override
	public String toString() {
		return "Cliente [numeroCliente=" + numeroCliente + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita="
				+ dataNascita + ", regione=" + regione + "]";
	}
	
	

}
