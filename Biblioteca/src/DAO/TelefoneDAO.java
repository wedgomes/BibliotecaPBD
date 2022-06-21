package DAO;

import javax.persistence.EntityManager;

import Model.Telefone;

public class TelefoneDAO extends GenericDAO{
	
	 public void salvar(Telefone telefones) throws Exception {
		    EntityManager entityManager = getEntityManager();
		    try {
		      entityManager.getTransaction().begin();
		      if(telefones.getId() == null) {
		        entityManager.persist(telefones);
		      }  else{
		        telefones = entityManager.merge(telefones);
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
		      Telefone tel = entityManager.find(Telefone.class, id);
		      entityManager.remove(tel);
		      entityManager.getTransaction().commit();
		    } finally {
		      entityManager.close();
		    }
		  }

		  public Telefone consultarPorId(Long id) {
		    EntityManager entityManager = getEntityManager();
		    Telefone tel = null;
		    try {
		      tel = entityManager.find(Telefone.class, id);
		    } finally {
		      entityManager.close();
		    }
		    return tel;
		  }
}