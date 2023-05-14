package contoCorrenteSynchronized;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	public static void main(String[] args) {
		

		Logger log = LoggerFactory.getLogger(Bancomat.class);
		
		ContoCorrente rossi = new ContoCorrente("Famiglia Rossi");
		ContoCorrente verdi= new ContoCorrente("Famiglia Verdi");
		
		rossi.deposito(400);
		verdi.deposito(500);
		
		Bancomat b1 = new Bancomat(verdi); //sarebbe la carta della famiglia verdi
		Bancomat b2 = new Bancomat(verdi);
		Bancomat b3 = new Bancomat(rossi);
	
	 b1.start();
	 b2.start();
	
	}

}
