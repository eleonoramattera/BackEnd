package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="utenti")
public class Utente {

 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Integer id;
 
 @Column(nullable=false)
 private String nome;
 @Column(nullable=false)
 private String cognome;
 @Column(nullable=false)
 private int eta;
 
 @OneToOne(cascade=CascadeType.ALL)
 private Smartphone smartphone;

public Utente() {
	super();
	}

public Utente(String nome, String cognome, int eta, Smartphone smartphone) {
	super();
	this.nome = nome;
	this.cognome = cognome;
	this.eta = eta;
	this.smartphone = smartphone;
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

public int getEta() {
	return eta;
}

public void setEta(int eta) {
	this.eta = eta;
}

public Smartphone getSmartphone() {
	return smartphone;
}

public void setSmartphone(Smartphone smartphone) {
	this.smartphone = smartphone;
}

@Override
public String toString() {
	return "Utente [ nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", smartphone="
			+ smartphone + "]";
}
 
 
 
 
 
	
}
