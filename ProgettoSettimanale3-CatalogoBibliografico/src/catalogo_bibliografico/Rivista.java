package catalogo_bibliografico;
import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Rivista extends Lettura implements Serializable{

	private Frequenza periodicità;

	
	// COSTUTTORI
	public Rivista() {
	}

	public Rivista(Frequenza per) {
		super();
		this.periodicità = per;
	}

	
	
	
	// GETTER SETTER
	public Frequenza getPeriodicità() {
		return periodicità;
	}

	public void setPeriodicità(Frequenza per) {
		this.periodicità = per;
	}

	
	//TOSTRING
	@Override
	public String toString() {
		return "Rivista [periodicità=" + periodicità + "]";
	}
}
