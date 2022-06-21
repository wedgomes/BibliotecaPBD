package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.CadastroLivro;

public class ControleCadastroLivro implements ActionListener{

	private CadastroLivro cadastroLivro;
	
	public ControleCadastroLivro(CadastroLivro caLivro) {
		cadastroLivro = caLivro;
		
		cadastroLivro.getSalvarButton().addActionListener(this);
		cadastroLivro.getVoltarButton().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
