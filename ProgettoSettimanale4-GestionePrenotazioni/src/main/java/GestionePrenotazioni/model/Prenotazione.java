package GestionePrenotazioni.model;


import java.time.LocalDateTime;
import java.util.Date;

import enums.OccupazionePostazione;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "prenotazione")
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private OccupazionePostazione Occupazione;
    @ManyToOne
    private Postazione postazione;
	@Column(nullable = false)
    private LocalDateTime dataPrenotata;
    @ManyToOne
    private Utente utente;
    
	public Prenotazione(OccupazionePostazione occupazione, Postazione postazione, LocalDateTime dataPrenotata, Utente utente) {
		super();
		Occupazione = occupazione;
		this.postazione = postazione;
		this.dataPrenotata = dataPrenotata;
		this.utente = utente;
	}
	
    
    

}
