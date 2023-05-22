package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="smartphone")
public class Smartphone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false)
	private String marca;
	@Column(nullable=false)
	private String modello;
	@Column(nullable=false)
	private String memoria;
	
	@OneToOne(mappedBy="smartphone")
	private Utente utente;
	
	
	
	public Smartphone() {
		super();
	}


	public Smartphone( String marca, String modello, String memoria) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.memoria = memoria;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModello() {
		return modello;
	}


	public void setModello(String modello) {
		this.modello = modello;
	}


	public String getMemoria() {
		return memoria;
	}


	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}


	public Utente getUtente() {
		return utente;
	}


	public void setUtente(Utente utente) {
		this.utente = utente;
	}


	@Override
	public String toString() {
		return "Smartphone [marca=" + marca + ", modello=" + modello + ", memoria=" + memoria + ", utente=" + utente
				+ "]";
	}
	
	
	

}
