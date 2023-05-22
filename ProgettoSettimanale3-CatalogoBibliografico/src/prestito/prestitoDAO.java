package prestito;

import javax.persistence.EntityManager;
import utils.JpaUtil;

public class prestitoDAO {
 
	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
}
