package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import DAO.LivroDAO;
import View.PesquisaUsuario;

public class ControleTelaUsuario implements ActionListener, ItemListener{

	private PesquisaUsuario pesqUser;
	
	public ControleTelaUsuario(PesquisaUsuario userPesq) {
		pesqUser = userPesq;
		
		pesqUser.getComboBox().addItemListener(this);	
		pesqUser.getPesquisarButton().addActionListener(this);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(pesqUser.getComboBox().getSelectedIndex() == 0 && e.getSource() == pesqUser.getPesquisarButton()) {
			
			if(pesqUser.getIdRadio().isSelected()) {
				System.out.println(LivroDAO.consultarPorId((long) Integer.parseInt(pesqUser.getCampoPesquisaField().getText())));	
			}
			if(pesqUser.getTituloRadio().isSelected()) {
				System.out.println(LivroDAO.consultarPorTitulo(pesqUser.getCampoPesquisaField().getText()));
			}
			if(pesqUser.getNumEdicaoRadio().isSelected()) {
				System.out.println(LivroDAO.consultarEdicao(Integer.parseInt(pesqUser.getCampoPesquisaField().getText())));
			}
			if(pesqUser.getExemplarRadio().isSelected()) {
				System.out.println(LivroDAO.consultarExemplar(Integer.parseInt(pesqUser.getCampoPesquisaField().getText())));
			}
			if(pesqUser.getAnoRadio().isSelected()) {
				System.out.println(LivroDAO.consultarPorAno(Integer.parseInt(pesqUser.getCampoPesquisaField().getText())));
			}
			if(pesqUser.getPalavraCahveRadio().isSelected()) {
				System.out.println(LivroDAO.consultarPorPalavra(pesqUser.getCampoPesquisaField().getText()));
			}
			if(pesqUser.getAutorRadio().isSelected()) {
				System.out.println(LivroDAO.consultarPorAutor(pesqUser.getCampoPesquisaField().getText()));
			}
			if(pesqUser.getEditoraRadio().isSelected()) {
				System.out.println(LivroDAO.consultarPorEditora(pesqUser.getCampoPesquisaField().getText()));
			}
		}
	  if(pesqUser.getComboBox().getSelectedIndex() == 1 && e.getSource() == pesqUser.getPesquisarButton()) {
		
	   }
	  if(pesqUser.getComboBox().getSelectedIndex() == 2 && e.getSource() == pesqUser.getPesquisarButton()) {
		  
	  }
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(pesqUser.getComboBox().getSelectedIndex() == 0 || pesqUser.getComboBox().getSelectedIndex() == 1 || pesqUser.getComboBox().getSelectedIndex() == 2) {
			boolean opcao0 = pesqUser.getComboBox().getSelectedIndex() == 0;
			boolean opcao1 = pesqUser.getComboBox().getSelectedIndex() == 1;
			boolean opcao2 = pesqUser.getComboBox().getSelectedIndex() == 2;
			
			pesqUser.getIdRadio().setVisible(opcao0);
			pesqUser.getTituloRadio().setVisible(opcao0);
			pesqUser.getNumEdicaoRadio().setVisible(opcao0);
			pesqUser.getExemplarRadio().setVisible(opcao0);
			pesqUser.getAnoRadio().setVisible(opcao0);
			pesqUser.getPalavraCahveRadio().setVisible(opcao0);
			pesqUser.getAutorRadio().setVisible(opcao0);
			pesqUser.getEditoraRadio().setVisible(opcao0);
			
		}
		
	}
}
