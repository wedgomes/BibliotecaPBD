package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import DAO.GenericDAO;
import DAO.PessoaDAO;
import Model.Departamento;
import Model.Pessoa;
import View.CadastroUsuario;

public class ControleTelaCadastroUser implements ActionListener, ItemListener{

	private CadastroUsuario cadastroUser;
	private Pessoa pessoa;
	
	public ControleTelaCadastroUser(CadastroUsuario cadUsuario) {
		cadastroUser = cadUsuario;
		
		cadUsuario.getComboBox().addItemListener(this);
		cadastroUser.getBtnSalvar().addActionListener(this);
		cadastroUser.getBtnVoltar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cadastroUser.getBtnSalvar()) {
			
			
			if(cadastroUser.getComboBox().getSelectedIndex() == 0) {
				Departamento dep = new Departamento();
				pessoa = new Pessoa();
				
				dep.setNome(cadastroUser.getNomeDptField().getText());
				
				pessoa.setMatricula(Integer.parseInt(cadastroUser.getMatriculaField().getText()));
				pessoa.setCpf(cadastroUser.getCpfField().getText());
				pessoa.setNome(cadastroUser.getNomeField().getText());
				pessoa.setEmail(cadastroUser.getEmailField().getText());
				pessoa.setProfessor(true);
				pessoa.setTipo(1);
				
				try {
					GenericDAO.salvar(dep);
					PessoaDAO.salvar(pessoa);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(cadastroUser.getComboBox().getSelectedIndex() == 1) {
				pessoa = new Pessoa();
				
				pessoa.setMatricula(Integer.parseInt(cadastroUser.getMatriculaField().getText()));
				pessoa.setCpf(cadastroUser.getCpfField().getText());
				pessoa.setNome(cadastroUser.getNomeField().getText());
				pessoa.setEmail(cadastroUser.getEmailField().getText());
				pessoa.setProfessor(false);
				pessoa.setTipo(1);
				
				try {
					PessoaDAO.salvar(pessoa);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(cadastroUser.getComboBox().getSelectedIndex() == 2) {
				pessoa = new Pessoa();
				
				pessoa.setMatricula(Integer.parseInt(cadastroUser.getMatriculaField().getText()));
				pessoa.setCpf(cadastroUser.getCpfField().getText());
				pessoa.setNome(cadastroUser.getNomeField().getText());
				
				try {
					PessoaDAO.salvar(pessoa);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		if(e.getSource() == cadastroUser.getBtnVoltar()) {
			cadastroUser.setVisible(false);
			ControleGeral.getTelaF().setVisible(true);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(cadastroUser.getComboBox().getSelectedIndex() == 0) {
			cadastroUser.getNomeDptLabel().setVisible(true);
			cadastroUser.getNomeDptField().setVisible(true);
			
			cadastroUser.getMatriculaLabel().setVisible(true);;
			cadastroUser.getMatriculaField().setVisible(true);
			cadastroUser.getCpfLabel().setVisible(true);
			cadastroUser.getCpfField().setVisible(true);
			cadastroUser.getNomeLabel().setVisible(true);
			cadastroUser.getNomeField().setVisible(true);
			cadastroUser.getEmailLabel().setVisible(true);
			cadastroUser.getEmailField().setVisible(true);
			cadastroUser.getEnderecoLabel().setVisible(true);
			cadastroUser.getRuaLabel().setVisible(true);
			cadastroUser.getRuaField().setVisible(true);
			cadastroUser.getNumeroLabel().setVisible(true);
			cadastroUser.getNumeroField().setVisible(true);
			cadastroUser.getBairroLabel().setVisible(true);
			cadastroUser.getBairroField().setVisible(true);
			cadastroUser.getPaisLabel().setVisible(true);
			cadastroUser.getPaisField().setVisible(true);
			cadastroUser.getUfLabel().setVisible(true);
			cadastroUser.getUfField().setVisible(true);
		}else if(cadastroUser.getComboBox().getSelectedIndex() == 1) {
			cadastroUser.getNomeDptLabel().setVisible(false);
			cadastroUser.getNomeDptField().setVisible(false);
			
			cadastroUser.getMatriculaLabel().setVisible(true);;
			cadastroUser.getMatriculaField().setVisible(true);
			cadastroUser.getCpfLabel().setVisible(true);
			cadastroUser.getCpfField().setVisible(true);
			cadastroUser.getNomeLabel().setVisible(true);
			cadastroUser.getNomeField().setVisible(true);
			cadastroUser.getEmailLabel().setVisible(true);
			cadastroUser.getEmailField().setVisible(true);
			cadastroUser.getEnderecoLabel().setVisible(true);
			cadastroUser.getRuaLabel().setVisible(true);
			cadastroUser.getRuaField().setVisible(true);
			cadastroUser.getNumeroLabel().setVisible(true);
			cadastroUser.getNumeroField().setVisible(true);
			cadastroUser.getBairroLabel().setVisible(true);
			cadastroUser.getBairroField().setVisible(true);
			cadastroUser.getPaisLabel().setVisible(true);
			cadastroUser.getPaisField().setVisible(true);
			cadastroUser.getUfLabel().setVisible(true);
			cadastroUser.getUfField().setVisible(true);
		}else {
			cadastroUser.getNomeDptLabel().setVisible(false);
			cadastroUser.getNomeDptField().setVisible(false);
			
			cadastroUser.getMatriculaLabel().setVisible(true);;
			cadastroUser.getMatriculaField().setVisible(true);
			cadastroUser.getCpfLabel().setVisible(true);
			cadastroUser.getCpfField().setVisible(true);
			cadastroUser.getNomeLabel().setVisible(true);
			cadastroUser.getNomeField().setVisible(true);
			cadastroUser.getEmailLabel().setVisible(false);
			cadastroUser.getEmailField().setVisible(false);
			cadastroUser.getEnderecoLabel().setVisible(false);
			cadastroUser.getRuaLabel().setVisible(false);
			cadastroUser.getRuaField().setVisible(false);
			cadastroUser.getNumeroLabel().setVisible(false);
			cadastroUser.getNumeroField().setVisible(false);
			cadastroUser.getBairroLabel().setVisible(false);
			cadastroUser.getBairroField().setVisible(false);
			cadastroUser.getPaisLabel().setVisible(false);
			cadastroUser.getPaisField().setVisible(false);
			cadastroUser.getUfLabel().setVisible(false);
			cadastroUser.getUfField().setVisible(false);
		}
	}
}
