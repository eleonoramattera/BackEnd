package GestioneIncendi.factory;

import org.springframework.http.ResponseEntity;
import GestioneIncendi.model.Sonda;

public interface SondaInterface {
	public ResponseEntity<Sonda> sendStats();
}
