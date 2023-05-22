package catalogo_bibliografico;

import java.time.LocalDate;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Lettura.trova_tutti", query = "SELECT l FROM Lettura l")
@NamedQuery(name = "Lettura.trova_per_anno", query = "SELECT l FROM Lettura l WHERE p.anno_pubblicazione = :anno_pubblicazione ORDER BY l.anno_pubblicazione DESC")
@NamedQuery(name = "Lettura.trova_per_titolo", query = "SELECT l FROM Lettura l WHERE LOWER(l.titolo) LIKE LOWER ('%' || :titolo || '%'")
@NamedQuery(name = "Lettura.trova_per_autore", query = "SELECT l FROM Lettura l WHERE LOWER(l.autore) LIKE LOWER ('%' || :autore || '%'")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Lettura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Codice_ISBN;
	private String titolo;
	private LocalDate anno_pubblicazione;
	private Integer numero_pagine;

	

	public String getCodice_ISBN() {
		return Codice_ISBN;
	}

	public void setCodice_ISBN(String codice_ISBN) {
		Codice_ISBN = codice_ISBN;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getAnno_pubblicazione() {
		return anno_pubblicazione;
	}

	public void setAnno_pubblicazione(LocalDate anno_pubblicazione) {
		this.anno_pubblicazione = anno_pubblicazione;
	}

	public Integer getNumero_pagine() {
		return numero_pagine;
	}

	public void setNumero_pagine(Integer numero_pagine) {
		this.numero_pagine = numero_pagine;
	}

	@Override
	public String toString() {
		return "Lettura [Codice_ISBN=" + Codice_ISBN + ", titolo=" + titolo + ", anno_pubblicazione="
				+ anno_pubblicazione + ", numero_pagine=" + numero_pagine + "]";
	}
}
