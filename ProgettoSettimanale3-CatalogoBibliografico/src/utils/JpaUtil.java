package utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {


		private static final EntityManagerFactory entityManagerFactory;

		static {
			try {
				System.out.println("Entro nel try");
				entityManagerFactory = Persistence.createEntityManagerFactory("jpa_challenge_d5");
			} catch (Throwable ex) {
				System.err.println("Initial EntityManagerFactory creation failed." + ex);
				throw new ExceptionInInitializerError(ex);
			}
		}
		
		public static EntityManagerFactory getEntityManagerFactory() {
			return entityManagerFactory;
		}
	}

