package View;

import java.awt.FlowLayout;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class LoginUser extends JFrame{

	private JLabel usuarioLabel, cpfLabel, senhaLabel, labelInicail;
	private JTextField loginField;
	private JPasswordField senhaField;
	private JButton btnOk;
	private JRadioButton funciRadio, UserRadio;
	private ButtonGroup bg;
	
	public LoginUser(){
		usuarioLabel = new JLabel("         Usuário                 ");
		usuarioLabel.setFont(new Font("Dialog", Font.CENTER_BASELINE, 15));
		labelInicail = new JLabel("Selecione o Ator");
		labelInicail.setFont(new Font("Dialog", Font.BOLD, 14));
		
		funciRadio = new JRadioButton("Funcionário", true);
		UserRadio = new JRadioButton("Usuário");
		bg = new ButtonGroup();
		bg.add(funciRadio);
		bg.add(UserRadio);
		
		cpfLabel = new JLabel("CPF:");
		senhaLabel = new JLabel("Senha:");
		
		loginField = new JTextField(10);
	//	senhaField = new JPasswordField(10);
		
		try {
			MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
			loginField = new JFormattedTextField(mascaraCPF);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		loginField.setColumns(11);
		
		btnOk = new JButton("Ok");
	//	btnVoltar = new JButton("Voltar");

		add(labelInicail);
		add(funciRadio);
		add(UserRadio);
		add(cpfLabel);
		add(loginField);
//		add(senhaLabel);
//		add(senhaField);
		add(btnOk);
	//	add(btnVoltar);
		
		setSize(180,180);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setVisible(false);
		setVisible(true);
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public JButton getBtnOk() {
		return btnOk;
	}

	public JRadioButton getFunciRadio() {
		return funciRadio;
	}

	public JRadioButton getUserRadio() {
		return UserRadio;
	}
}
