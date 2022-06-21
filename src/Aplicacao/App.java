package Aplicacao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;

import Control.ControleGeral;
import Control.ControleTelaCadastroUser;
import Control.ControleTelaInicial;
import DAO.DepartamentoDAO;
import DAO.GenericDAO;
import DAO.LivroDAO;
import DAO.PessoaDAO;
import DAO.TelefoneDAO;
import Model.Autor;
import Model.Departamento;
import Model.Emprestimo;
import Model.Livro;
import Model.Pessoa;
import Model.Telefone;
import View.CadastroUsuario;
import View.LoginUser;

public class App {

	public static void main(String[] args) throws Exception {
//		LoginUser login = new LoginUser();
//		 new ControleTelaInicial(login);
		 
//		 CadastroUsuario cadUser = new CadastroUsuario();
//		 new ControleTelaCadastroUser(cadUser);
		
		new ControleGeral();
		
//		Long id = (long) 7;
	
		//GenericDAO daoGenerico = new GenericDAO();
//		
//		
//		PessoaDAO pessoaDao = new PessoaDAO();
//		DepartamentoDAO depDao = new DepartamentoDAO();
//		TelefoneDAO telDAO = new TelefoneDAO();
//		LivroDAO livroDAO = new LivroDAO();
//		Autor autor = new Autor();
//		Autor autor2 = new Autor();
//		ArrayList<Autor> autores = new ArrayList<>();
//		
//		Emprestimo emprestimo = new Emprestimo();
//		Livro livro = new Livro();
//		Pessoa pessoa = new Pessoa();
//		Departamento departamento = new Departamento();
//		Telefone tel = new Telefone();
		
//		departamento.setNome("Administrativo");
		
//		emprestimo.setLivro(livro);
//		emprestimo.setPessoa(pessoa);
//		emprestimo.setData_Emprestimo(data_Emprestimo);
		
//		autor.setNome("Berg");
//		autor.setLivro(livro);
//		
//		autor2.setNome("Wédson");
//		autor2.setLivro(livro);
//		
//		autores.add(autor);
//		autores.add(autor2);
		

//		autores.add(autores.get(1));
		
//		livro.setTitulo("Estrutura de Dados II");
//		livro.setNumero_Exemplares(3);
//		livro.setNumero_Edicao(9);
//		livro.setAno_Publicacao(2010);
//		livro.setEditora("Brasil");
//		livro.setAutores(autores);
//		
//		LivroDAO.salvar(livro);
	//	LivroDAO.excluir(id);
		
//		pessoa.setNome("Thiaguinho");
//		pessoa.setTipo(0);
//		pessoa.setMatricula(15);
//		pessoa.setCpf("9874561");
//		pessoa.setEmail("thia@hotmail"); 
		
//		pessoa.setDepartamento(departamento);
		
//		tels.get(0).setNumero("999999999");
//		tels.get(1).setNumero("888888888");
//		tels.get(0).setPessoa(pessoa);
//		tel.setNumero("99999999");
	//	tel.setNumero("88050260");
		
//		depDao.salvar(departamento);
//		pessoaDao.salvar(pessoa);
//		telDAO.salvar(tel);
		
//		pessoaDao.excluir(id);
		
	//	livroDAO.salvar(livro);
		
	}
}
