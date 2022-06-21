package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenericDAO {

	 public static EntityManager getEntityManager() {
		    EntityManagerFactory factory = null;
		    EntityManager entityManager = null;
		    
		    try {
		      factory = Persistence.createEntityManagerFactory("biblioteca");
		      entityManager = factory.createEntityManager();
		    } finally {
		//      factory.close();
		    }
		    return entityManager;
		  }
	 
	 public static void salvar(Object objeto) {
		 try {
			getEntityManager().getTransaction().begin();
			getEntityManager().persist(objeto);
			getEntityManager().getTransaction().commit();
		} catch (Exception e) {
			getEntityManager().getTransaction().rollback();
		}
	 }
}
