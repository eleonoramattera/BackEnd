package contoCorrenteSynchronized;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bancomat extends Thread {

	Logger log = LoggerFactory.getLogger(Bancomat.class);
	private ContoCorrente conto;
	
	public Bancomat(ContoCorrente conto) {
		this.conto = conto;
	}

	public  void preleva(double importo) {
		
			if(this.conto.controlloPrelievo(importo)) {
				this.conto.prelievo(importo);
				log.info("Prelievo effettuato su " + this.conto);
			}
		
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			this.preleva(100);
		}
	}

	
	
}
