package catalogo_bibliografico;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity

public class Libro  extends Lettura implements Serializable{

	private String autore;
	private String genere;

	
	// COSTUTTORI
	public Libro() {
	}

	public Libro(String autore, String genere) {
		super();
		this.autore = autore;
		this.genere = genere;
	}
	
	

	// GETTER SETTER
	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	
	//TOSTRING
	@Override
	public String toString() {
		return "Libri [autore=" + autore + ", genere=" + genere + "]";
	}
}
