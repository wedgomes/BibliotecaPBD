package DAO;

import javax.persistence.EntityManager;

import Model.Departamento;


public class DepartamentoDAO extends GenericDAO{
	
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
		  public void salvar(Departamento departamento) throws Exception {
		    EntityManager entityManager = getEntityManager();
		    try {
		      // Inicia uma transação com o banco de dados.
		      entityManager.getTransaction().begin();
		      System.out.println("Salvando a pessoa.");
		      // Verifica se a pessoa ainda não está salva no banco de dados.
		      if(departamento.getId() == null) {
		        //Salva os dados da pessoa.
		        entityManager.persist(departamento);
		      }  else{
		        //Atualiza os dados da pessoa.
		        departamento = entityManager.merge(departamento);
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
		      Departamento departamento = entityManager.find(Departamento.class, id);
	//	      System.out.println("Excluindo os dados de: " + pessoa.getNome());
		      // Remove a pessoa da base de dados.
		      entityManager.remove(departamento);
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
		  public Departamento consultarPorId(Long id) {
		    EntityManager entityManager = getEntityManager();
		    Departamento departamento = null;
		    try {
		      //Consulta uma pessoa pelo seu ID.
		      departamento = entityManager.find(Departamento.class, id);
		    } finally {
		      entityManager.close();
		    }
		    return departamento;
		  }
		
}
