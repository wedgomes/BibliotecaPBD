package DAO;

import javax.persistence.EntityManager;

import Model.Telefone;

public class TelefoneDAO extends GenericDAO{
	
	 public void salvar(Telefone telefones) throws Exception {
		    EntityManager entityManager = getEntityManager();
		    try {
		      // Inicia uma transação com o banco de dados.
		      entityManager.getTransaction().begin();
		      System.out.println("Salvando a pessoa.");
		      // Verifica se a pessoa ainda não está salva no banco de dados.
		      if(telefones.getId() == null) {
		        //Salva os dados da pessoa.
		        entityManager.persist(telefones);
		      }  else{
		        //Atualiza os dados da pessoa.
		        telefones = entityManager.merge(telefones);
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
		      Telefone tel = entityManager.find(Telefone.class, id);
	//	      System.out.println("Excluindo os dados de: " + pessoa.getNome());
		      // Remove a pessoa da base de dados.
		      entityManager.remove(tel);
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
		  public Telefone consultarPorId(Long id) {
		    EntityManager entityManager = getEntityManager();
		    Telefone tel = null;
		    try {
		      //Consulta uma pessoa pelo seu ID.
		      tel = entityManager.find(Telefone.class, id);
		    } finally {
		      entityManager.close();
		    }
		    return tel;
		  }
}