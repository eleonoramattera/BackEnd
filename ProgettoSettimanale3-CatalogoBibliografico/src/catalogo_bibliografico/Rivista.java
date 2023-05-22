package catalogo_bibliografico;
import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Rivista extends Lettura implements Serializable{

	private Periodicita periodicità;

	
	// COSTUTTORI
	public Rivista() {
	}

	public Rivista(Periodicita per) {
		super();
		this.periodicità = per;
	}

	
	
	
	// GETTER SETTER
	public Periodicita getPeriodicità() {
		return periodicità;
	}

	public void setPeriodicità(Periodicita per) {
		this.periodicità = per;
	}

	
	//TOSTRING
	@Override
	public String toString() {
		return "Rivista [periodicità=" + periodicità + "]";
	}
}
