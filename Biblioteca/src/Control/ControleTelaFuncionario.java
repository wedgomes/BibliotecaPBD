package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.TelaFuncionario;

public class ControleTelaFuncionario implements ActionListener{

	private TelaFuncionario telaFuncio;
	
	public ControleTelaFuncionario(TelaFuncionario tela) {
		telaFuncio = tela;
		
		telaFuncio.getBtnCadastrarUser().addActionListener(this);
		telaFuncio.getBtnCadastrarLivro().addActionListener(this);
		telaFuncio.getBtnDevolucao().addActionListener(this);
		telaFuncio.getBtnEmprestimo().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == telaFuncio.getBtnCadastrarUser()) {
			telaFuncio.setVisible(false);
			ControleGeral.getCadastroUser().setVisible(true);
		}
		if(e.getSource() == telaFuncio.getBtnCadastrarLivro()) {
			
		}
		if(e.getSource() == telaFuncio.getBtnDevolucao()) {
			
		}
		if(e.getSource() == telaFuncio.getBtnEmprestimo()) {
			
		}
		
	}

	public TelaFuncionario getTelaFuncio() {
		return telaFuncio;
	}
}
