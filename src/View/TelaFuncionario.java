package View;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaFuncionario extends JFrame{

	private JLabel cadastroLbel, registroLabel, linhaLabel, consultaLabel;
	private JButton btnCadastrarUser, btnCadastrarLivro, btnEmprestimo, btnDevolucao;
//	private JCheckBox checkAluno, checkProfessor;
//	private ButtonGroup bg;
//	private JTextField matriculaField, nomeFiled, cpfField, emailField, ruaField, bairroField,
//						paisField, ufField, nomeDptField, telefoneField;
	
	public TelaFuncionario(){
		cadastroLbel = new JLabel("Cadastrar			");
		cadastroLbel.setFont(new Font("Dialog", Font.BOLD, 15));
		registroLabel = new JLabel("   Registrar			");
		registroLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		linhaLabel = new JLabel("--------------------------------------------------------");
		linhaLabel.setFont(new Font("Dialog", Font.CENTER_BASELINE, 15));		
		
//		nomeDptField = new JTextField(40);
//		matriculaField = new JTextField(35);
//		nomeFiled = new JTextField(18);
//		cpfField = new JTextField(20);
//		emailField = new JTextField(20);
//		telefoneField = new JTextField(15);
		
		btnCadastrarUser = new JButton("	Usuário	");
		btnCadastrarLivro = new JButton("	Livro	");
		btnEmprestimo = new JButton("Empréstimo");
		btnDevolucao = new JButton("Devolução");		
		
//		checkAluno = new JCheckBox("Aluno");
//		checkProfessor = new JCheckBox("Professor", true);
//		
//		bg = new ButtonGroup();
//		bg.add(checkAluno);
//		bg.add(checkProfessor);
		
		add(cadastroLbel);
		add(btnCadastrarUser);
		add(btnCadastrarLivro);
		add(linhaLabel);
		add(registroLabel);
		add(btnEmprestimo);
		add(btnDevolucao);
//		add(checkAluno);
//		add(checkProfessor);
//		add(departamentoLabel);
//		add(nomeDptLabel);
//		add(nomeDptField);
//		add(dadosLabel);
//		add(matriculaLabel);
//		add(matriculaField);
//		add(nomeLabel);
//		add(nomeFiled);
//		add(cpfLabel);
//		add(cpfField);
//		add(emailLabel);
//		add(emailField);
//		add(telefoneLabel);
//		add(telefoneField);
//		add(enderecoLabel);
//		add(ruaLabel);
//		add(ruaField);
		
		setTitle("Tela Funcionario");
		setSize(315,150);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setVisible(false);
		setVisible(false);
	}
	
	public JButton getBtnCadastrarUser() {
		return btnCadastrarUser;
	}

	public JButton getBtnCadastrarLivro() {
		return btnCadastrarLivro;
	}

	public JButton getBtnEmprestimo() {
		return btnEmprestimo;
	}

	public JButton getBtnDevolucao() {
		return btnDevolucao;
	}
}
