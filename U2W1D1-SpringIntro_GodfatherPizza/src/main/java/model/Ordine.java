package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import enums.StatoOrdine;
import enums.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@PropertySource("classpath:application.properties")
@Data
public class Ordine {
   
	private int numeroOrdine;
	List<FoodDrinkItem> listaOrdine = new ArrayList<FoodDrinkItem>();
	private Tavolo tavolo;
	private StatoOrdine statoOrdine = StatoOrdine.INCORSO;
	private int numeroCoperti =1;
	private LocalDateTime ora = LocalDateTime.now();
	private double totaleConto;
	private String costoCoperto;
	
//	@Value("${}tavolo.coperto.costo") String costocoperto;
//    private int CostoCoperto=  Integer.parseInt(Costocoperto);
    
	
	public Ordine(int numeroOrdine, Tavolo tavolo,
			int numeroCoperti, String costoCoperto) throws Exception {
		super();
		this.numeroOrdine = numeroOrdine;
		this.listaOrdine = new ArrayList<FoodDrinkItem>();
		this.tavolo = tavolo;
		
		//per cambiare stato del tavolo da libero a occupato
		this.tavolo.setStato(StatoTavolo.OCCUPATO);
		this.statoOrdine  = StatoOrdine.INCORSO;
		
		//per controllare che i numero dei coperti dell'ordine deve essere <= numero coperti Tavolo
		this.numeroCoperti = controlloCoperti(numeroCoperti);
		
		this.ora  = LocalDateTime.now();
		this.totaleConto = calcolaTotale();
		this.costoCoperto = costoCoperto;
		
	}
	public int controlloCoperti(int coperti) throws Exception {
		if(this.tavolo.getNumeroCoperti() < coperti ) {
			throw new Exception("Numero di coperti errato!!!!");
		} else {
			return coperti;
		}
	}
	
	public double calcolaTotale() {
	 double totale = 0d;
	for(FoodDrinkItem f :listaOrdine) {
		totale += f.getPrezzo();
		}
	//manca costo coperti ma string non si converte in double 
//	double cc=Double.parseDouble(costoCoperto);
//	totale +=  cc* numeroCoperti;
	return totale;
	}
}
