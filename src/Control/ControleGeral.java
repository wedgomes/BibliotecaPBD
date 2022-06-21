package Control;

import View.CadastroUsuario;
import View.LoginUser;
import View.PesquisaUsuario;
import View.TelaFuncionario;

public class ControleGeral {

	 private static LoginUser login;
	 private static CadastroUsuario cadastroUser;
	 private static TelaFuncionario telaF;
	 private static PesquisaUsuario pesquiUsuario;
	
	public ControleGeral() {
		login = new LoginUser();
		cadastroUser = new CadastroUsuario();
		telaF = new TelaFuncionario();
		pesquiUsuario = new PesquisaUsuario();
		
		
		
		new ControleTelaInicial(login);
		new ControleTelaFuncionario(telaF);
		new ControleTelaCadastroUser(cadastroUser);
		new ControleTelaUsuario(pesquiUsuario);
	}

	public static LoginUser getLogin() {
		return login;
	}

	public static CadastroUsuario getCadastroUser() {
		return cadastroUser;
	}

	public static TelaFuncionario getTelaF() {
		return telaF;
	}

	public static PesquisaUsuario getPesquiUsuario() {
		return pesquiUsuario;
	}	
}
