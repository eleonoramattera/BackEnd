package model;

import java.util.List;

import enums.Tipo;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "postazione")
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descrizionePostazione;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private Integer numMaxOccupanti;
    @ManyToOne
    private Edificio edificio;
    @OneToMany
	private List<Prenotazione> listaPrenotazioni;
    
    public Postazione(String descrizionePostazione, Tipo tipo, Integer numMaxOccupanti, Edificio edificio) {
		super();
		this.descrizionePostazione = descrizionePostazione;
		this.tipo = tipo;
		this.numMaxOccupanti = numMaxOccupanti;
		this.edificio = edificio;
	}

	
    
}
