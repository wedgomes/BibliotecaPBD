package DAO;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import Model.Livro;
import Model.Pessoa;

public class LivroDAO extends GenericDAO{

	public static void salvar(Livro livro) throws Exception {
	    EntityManager entityManager = getEntityManager();
	    try {
	      // Inicia uma transação com o banco de dados.
	      entityManager.getTransaction().begin();
	      System.out.println("Salvando o livro.");
	      // Verifica se a pessoa ainda não está salva no banco de dados.
	      if(livro.getId() == null) {
	        //Salva os dados da pessoa.
	        entityManager.persist(livro);
	      }  else{
	        //Atualiza os dados da pessoa.
	        livro = entityManager.merge(livro);
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
	  public static void excluir(Long id) {
	    EntityManager entityManager = getEntityManager();
	    try {
	      // Inicia uma transação com o banco de dados.
	      entityManager.getTransaction().begin();
	      // Consulta a pessoa na base de dados através do seu ID.
	      Livro livro = entityManager.find(Livro.class, id);
//	      System.out.println("Excluindo os dados de: " + pessoa.getNome());
	      // Remove a pessoa da base de dados.
	      entityManager.remove(livro);
	      // Finaliza a transação.
	      entityManager.getTransaction().commit();
	    } finally {
	      entityManager.close();
	    }
	  }

	  public static Livro consultarPorId(Long id) {
	    return getEntityManager().find(Livro.class, id);
	  }
	
	  public static List<Livro> consultarPorPalavra(String palavra) {
		  Query query = getEntityManager().createQuery("select l from Livro l where titulo like ?");
		  query.setParameter(0, "%"+palavra+"%");
		  return query.getResultList();
	  }
	  
	  public static List<Livro> consultarPorAno(int ano) {
		  Query query = getEntityManager().createQuery("select l from Livro l where ano_Publicacao like ?");
		  query.setParameter(0, ano);
		  return query.getResultList();
	  }
	  
	  public static List<Livro> consultarPorTitulo(String titulo) {
		  Query query = getEntityManager().createQuery("select l from Livro l where titulo like ?");
		  query.setParameter(0, titulo);
		  return query.getResultList();
	  }
	  
	  public static List<Livro> consultarPorEditora(String editora) {
		  Query query = getEntityManager().createQuery("select l from Livro l where editora like ?");
		  query.setParameter(0, editora);
		  return query.getResultList();
	  }
	  
	  public static List<Livro> consultarEdicao(int edicao) {
		  Query query = getEntityManager().createQuery("select l from Livro l where numero_Edicao like ?");
		  query.setParameter(0, edicao);
		  return query.getResultList();
	  }
	  
	  public static List<Livro> consultarExemplar(int exemplar) {
		  Query query = getEntityManager().createQuery("select l from Livro l where numero_Exemplares like ?");
		  query.setParameter(0, exemplar);
		  return query.getResultList();
	  }
	  
	  public static List<Livro> consultarPorAutor(String autor) {
		  Query query = getEntityManager().createQuery("select l from Livro l join Autor a on l.id = a.livro.id where a.nome = ?");
		  query.setParameter(0, autor);
		  return query.getResultList();
	  }
}
