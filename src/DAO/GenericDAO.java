package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenericDAO {

	 public static EntityManager getEntityManager() {
		    EntityManagerFactory factory = null;
		    EntityManager entityManager = null;
		    
		    try {
		      //Obtém o factory a partir da unidade de persistência.
		      factory = Persistence.createEntityManagerFactory("biblioteca");
		      //Cria um entity manager.
		      entityManager = factory.createEntityManager();
		      //Fecha o factory para liberar os recursos utilizado.
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
	 
//	 public void atualizar(Object objeto) {
//		 try {
//				getEntityManager().getTransaction().begin();
//				getEntityManager().merge(objeto);
//				getEntityManager().getTransaction().commit();
//			} catch (Exception e) {
//				getEntityManager().getTransaction().rollback();
//			}finally {
//				getEntityManager().close();
//			}
//	 }
}
