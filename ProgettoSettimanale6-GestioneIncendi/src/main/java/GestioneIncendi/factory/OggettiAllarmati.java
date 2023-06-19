package GestioneIncendi.factory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import GestioneIncendi.model.CentroDiControllo;
import GestioneIncendi.model.Sonda;
import ch.qos.logback.core.boolex.EvaluationException;
import lombok.extern.slf4j.Slf4j;

public abstract class OggettiAllarmati {
	public abstract OggettiAllarmati createSonda();
	public abstract OggettiAllarmati createSondaFake();
	
	public ResponseEntity<OggettiAllarmati> sendStats(Sonda s) throws Exception {
		try {
			if (s.getSmokeLevel() > -1 && s.getSmokeLevel() < 11) {
				System.out.print("Rilevazione sonda effettuata tramite API");
				CentroDiControllo.alert(s);
				return new ResponseEntity<OggettiAllarmati>(HttpStatus.OK);
			} else {
				throw new EvaluationException("tutto ok");
			}
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
}
