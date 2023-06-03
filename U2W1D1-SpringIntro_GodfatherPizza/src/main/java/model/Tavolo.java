package model;

import enums.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data

public class Tavolo {
	private int numeroTavolo;
	private int numeroCoperti;
	private StatoTavolo stato = StatoTavolo.LIBERO;
	
	public Tavolo(int numeroTavolo, int numeroCoperti) {
		super();
		this.numeroTavolo = numeroTavolo;
		this.numeroCoperti = numeroCoperti;
		this.stato = StatoTavolo.LIBERO;
	}

	
	
}
