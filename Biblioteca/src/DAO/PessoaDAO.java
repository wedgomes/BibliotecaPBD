package DAO;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import Model.Pessoa;


public class PessoaDAO extends GenericDAO{
		
		  public static void salvar(Pessoa pessoa) throws Exception {
		    EntityManager entityManager = getEntityManager();
		    try {
		      entityManager.getTransaction().begin();
		      System.out.println("Salvando a pessoa.");
		      if(pessoa.getId() == null) {
		        entityManager.persist(pessoa);
		      }  else{
		        pessoa = entityManager.merge(pessoa);
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
		      Pessoa pessoa = entityManager.find(Pessoa.class, id);
		      entityManager.remove(pessoa);
		      entityManager.getTransaction().commit();
		    } finally {
		      entityManager.close();
		    }
		  }

		  public Pessoa consultarPorId(Long id) {
		    EntityManager entityManager = getEntityManager();
		    Pessoa pessoa = null;
		    try {
		      pessoa = entityManager.find(Pessoa.class, id);
		    } finally {
		      entityManager.close();
		    }
		    return pessoa;
		  }
		  
		  public static Pessoa localizarPorCPF(String cpf) {
		        Pessoa obj = null;
		        Session session = (Session) getEntityManager().getDelegate();

		        Criteria criteria = session.createCriteria(Pessoa.class);
		        criteria.add(Restrictions.ilike("cpf","%"+cpf+"%"));

		        obj=(Pessoa)criteria.uniqueResult();
		        return obj;
		}
}
