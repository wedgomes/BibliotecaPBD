package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import DAO.PessoaDAO;
import View.LoginUser;

public class ControleTelaInicial implements ActionListener{
	
	private LoginUser loginTela;
	
	public ControleTelaInicial(LoginUser login) {
		loginTela = login;
		
		loginTela.getBtnOk().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		if(e.getSource() == loginTela.getBtnOk()){
			
			if(loginTela.getLoginField().getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Insira os dados!");
			}else {
				if(PessoaDAO.localizarPorCPF(loginTela.getLoginField().getText()) != null && loginTela.getFunciRadio().isSelected() &&
						PessoaDAO.localizarPorCPF(loginTela.getLoginField().getText()).getTipo() == 0) {
							JOptionPane.showMessageDialog(null, "BEM VINDO! Funcionário");
							loginTela.setVisible(false);
							ControleGeral.getTelaF().setVisible(true);
						 
				}else if(PessoaDAO.localizarPorCPF(loginTela.getLoginField().getText()) != null && loginTela.getUserRadio().isSelected() &&
						PessoaDAO.localizarPorCPF(loginTela.getLoginField().getText()).getTipo() == 1){
							JOptionPane.showMessageDialog(null, "BEM VINDO! Usuário");
							loginTela.setVisible(false);
							ControleGeral.getPesquiUsuario().setVisible(true);
							
				}else {
					JOptionPane.showMessageDialog(null, "Há algo errado!");
				}
			}
		}
	}

	public LoginUser getLoginTela() {
		return loginTela;
	}

}
