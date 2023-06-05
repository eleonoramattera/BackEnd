package model;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "postazione")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
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
	}

