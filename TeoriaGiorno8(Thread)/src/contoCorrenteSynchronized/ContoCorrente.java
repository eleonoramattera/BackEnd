package contoCorrenteSynchronized;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import threadTeoria.Main;

public class ContoCorrente {

	Logger log = LoggerFactory.getLogger(ContoCorrente.class);
	 private double saldo;
	private String titolare;
	private double importo;

	//COSTRUTTORE
	public ContoCorrente( String titolare)  {
		this.titolare = titolare;
		this.saldo=0;
	}
	
	
	public  double deposito(double importo) {
		System.out.println("Deposito di € " + importo + "da parte di " + this.titolare);
		this.saldo +=importo;
		return saldo;
	}
	
	public  synchronized double prelievo(double importoDaPrelevare) {
		if(controlloPrelievo(importo)) {
			System.out.println("Prelievo di € " + importoDaPrelevare + "da parte di " + this.titolare);
			this.saldo -= importoDaPrelevare;
		}else {
			System.out.println("ERRORE Prelievo di € " + importoDaPrelevare + "da parte di " + this.titolare);
		}
		return this.saldo;
	}

	
	public boolean controlloPrelievo(double importo) {
		return this.saldo >= importo;
	}

	@Override
	public String toString() {
		return "ContoCorrente [saldo=" + saldo + ", titolare=" + titolare + "]";
		
	}
	
	
	
}
