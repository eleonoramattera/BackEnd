package GestionePrenotazioni.model;

import java.util.ArrayList;
import java.util.List;

import enums.OccupazionePostazione;
import enums.Tipo;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "postazioni")
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descrizionePostazione;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    private Integer numMaxOccupanti;
    @ManyToOne
    @JoinColumn
    private Edificio edificio;
    @OneToMany
	private List<Prenotazione> listaPrenotazioni;
    private OccupazionePostazione occupazionePostazione = OccupazionePostazione.LIBERO;
    
    public Postazione(Long id, String descrizionePostazione, Tipo tipo, Integer numMaxOccupanti, Edificio edificio,
    		List<Prenotazione> listaPrenotazioni, OccupazionePostazione occupazionePostazione) {
    	super();
    	this.id = id;
    	this.descrizionePostazione = descrizionePostazione;
    	this.tipo = tipo;
    	this.numMaxOccupanti = numMaxOccupanti;
    	this.edificio = edificio;
    	this.listaPrenotazioni = new ArrayList<Prenotazione>();
    	this.occupazionePostazione = OccupazionePostazione.LIBERO;
    }
    public Postazione(String descrizionePostazione, Tipo tipo, Integer numMaxOccupanti, Edificio edificio,List<Prenotazione> listaPrenotazioni,OccupazionePostazione occupazionePostazione ) {
		super();
		this.descrizionePostazione = descrizionePostazione;
		this.tipo = tipo;
		this.numMaxOccupanti = numMaxOccupanti;
		this.edificio = edificio;
		this.listaPrenotazioni = new ArrayList<Prenotazione>();
		this.occupazionePostazione = OccupazionePostazione.LIBERO;
	}


	
    
}
