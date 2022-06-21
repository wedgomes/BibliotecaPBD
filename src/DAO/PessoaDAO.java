package DAO;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import Model.Pessoa;


public class PessoaDAO extends GenericDAO{
	
//	 private EntityManager getEntityManager() {
//		    EntityManagerFactory factory = null;
//		    EntityManager entityManager = null;
//		    
//		    try {
//		      //Obtém o factory a partir da unidade de persistência.
//		      factory = Persistence.createEntityManagerFactory("biblioteca");
//		      //Cria um entity manager.
//		      entityManager = factory.createEntityManager();
//		      //Fecha o factory para liberar os recursos utilizado.
//		    } finally {
//		//      factory.close();
//		    }
//		    return entityManager;
//		  }

		  /**
		   * Método utilizado para salvar ou atualizar as informações de uma pessoa.
		   * @param pessoa
		   * @return
		   * @throws java.lang.Exception
		   */
		  public static void salvar(Pessoa pessoa) throws Exception {
		    EntityManager entityManager = getEntityManager();
		    try {
		      // Inicia uma transação com o banco de dados.
		      entityManager.getTransaction().begin();
		      System.out.println("Salvando a pessoa.");
		      // Verifica se a pessoa ainda não está salva no banco de dados.
		      if(pessoa.getId() == null) {
		        //Salva os dados da pessoa.
		        entityManager.persist(pessoa);
		      }  else{
		        //Atualiza os dados da pessoa.
		        pessoa = entityManager.merge(pessoa);
		      }
		      // Finaliza a transação.
		      entityManager.getTransaction().commit();
		    } finally {
		      entityManager.close();
		    }
		  }

		  /**
		   * Método que apaga a pessoa do banco de dados.
		   * @param id
		   */
		  public void excluir(Long id) {
		    EntityManager entityManager = getEntityManager();
		    try {
		      // Inicia uma transação com o banco de dados.
		      entityManager.getTransaction().begin();
		      // Consulta a pessoa na base de dados através do seu ID.
		      Pessoa pessoa = entityManager.find(Pessoa.class, id);
	//	      System.out.println("Excluindo os dados de: " + pessoa.getNome());
		      // Remove a pessoa da base de dados.
		      entityManager.remove(pessoa);
		      // Finaliza a transação.
		      entityManager.getTransaction().commit();
		    } finally {
		      entityManager.close();
		    }
		  }

		  /**
		   * Consulta o pessoa pelo ID.
		   * @param id
		   * @return o objeto Pessoa.
		   */
		  public Pessoa consultarPorId(Long id) {
		    EntityManager entityManager = getEntityManager();
		    Pessoa pessoa = null;
		    try {
		      //Consulta uma pessoa pelo seu ID.
		      pessoa = entityManager.find(Pessoa.class, id);
		    } finally {
		      entityManager.close();
		    }
		    return pessoa;
		  }
		  
//		  public static Pessoa consultarPorCPF(String cpf) {
//			  EntityManager entityManager = getEntityManager();
//			  Pessoa pessoa = null;
//			  
//			  try {
//				pessoa = entityManager.find(Pessoa.class, cpf); 
//			} finally {
//				entityManager.close();
//			}
//			  return pessoa;
//		  }

//		  public static boolean verificarLogin(String cpf) {
//			  Pessoa pessoa = null;
//			  System.out.println("########################### " );
//			  
//			  //try {
//				getEntityManager().getTransaction().begin();
//				Query query = getEntityManager().createQuery("select pessoa from pessoa where cpf = ?");
//				query.setParameter(0, cpf);
//				pessoa = (Pessoa) query.getSingleResult();
//				System.out.println("########################### " + pessoa.getNome());
//				getEntityManager().getTransaction().commit();			
//			//} catch (Exception e) {
//				//System.out.println("ERROU ERROU ERROU ERROU" );
//				//getEntityManager().getTransaction().rollback(); 
//			//}
//			  if(pessoa != null) {
//				  return true;
//			  }else {
//				  return false;
//			  }
//		  }
		  
		  public static Pessoa localizarPorCPF(String cpf) {
		        Pessoa obj = null;
		        Session session = (Session) getEntityManager().getDelegate();

		        Criteria criteria = session.createCriteria(Pessoa.class);
		        criteria.add(Restrictions.ilike("cpf","%"+cpf+"%"));

		        obj=(Pessoa)criteria.uniqueResult();
		        return obj;
		}
}
