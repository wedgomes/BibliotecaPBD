package DAO;

import javax.persistence.EntityManager;

import Model.Departamento;


public class DepartamentoDAO extends GenericDAO{
	
		  public void salvar(Departamento departamento) throws Exception {
		    EntityManager entityManager = getEntityManager();
		    try {
		      entityManager.getTransaction().begin();
		      System.out.println("Salvando a pessoa.");
		      if(departamento.getId() == null) {
		        entityManager.persist(departamento);
		      }  else{
		        departamento = entityManager.merge(departamento);
		      }
		      entityManager.getTransaction().commit();
		    } finally {
		      entityManager.close();
		    }
		  }

		  
		  public void excluir(Long id) {
		    EntityManager entityManager = getEntityManager();
		    try {
		      entityManager.getTransaction().begin();
		      Departamento departamento = entityManager.find(Departamento.class, id);
	//	    
		      entityManager.remove(departamento);
		      entityManager.getTransaction().commit();
		    } finally {
		      entityManager.close();
		    }
		  }

		  
		  public Departamento consultarPorId(Long id) {
		    EntityManager entityManager = getEntityManager();
		    Departamento departamento = null;
		    try {
		      departamento = entityManager.find(Departamento.class, id);
		    } finally {
		      entityManager.close();
		    }
		    return departamento;
		  }
		
}
