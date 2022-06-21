package View;

import java.awt.FlowLayout;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class CadastroUsuario extends JFrame{

	private JLabel matriculaLabel, nomeLabel, cpfLabel, emailLabel, telefoneLabel, 
					ruaLabel, numeroLabel, bairroLabel, ufLabel, paisLabel, nomeDptLabel,
					enderecoLabel, linhaLabel;
	private JTextField matriculaField, nomeField, cpfField, emailField, telefoneFiles,
						ruaField, numeroField, bairroField, ufField, paisField, nomeDptField;
	private JComboBox<String> comboBox;
	private JButton btnSalvar, btnVoltar;
	
	public CadastroUsuario(){
		String[] opcao = {"               Professor          ", "               Aluno          ","               Funcionário          "};
		comboBox = new JComboBox<>(opcao);
						//	x	y	L	A
	//	comboBox.setBounds(95, 18, 130, 20);
		nomeDptLabel = new JLabel("Departamento:");
	//	nomeDptLabel.setBounds(20, 40, 140, 20);
		nomeDptField = new JTextField(10);
	//	nomeDptField.setBounds(20, 60, 140, 20);
		linhaLabel = new JLabel("__________________________________________________");
		
		enderecoLabel = new JLabel("Endereço                                                                                   ");
		enderecoLabel.setFont(new Font("Dialog", Font.BOLD, 13));
		
		
		matriculaLabel = new JLabel("  Matrícula: ");
	//	matriculaLabel.setBounds(x, y, width, height);
		nomeLabel = new JLabel("Nome: ");
		cpfLabel = new JLabel("     CPF: ");
		emailLabel = new JLabel("E-mail: ");
		telefoneLabel = new JLabel("Telefone");
		
		//Endereço Label
		ruaLabel = new JLabel("Rua: ");
		numeroLabel = new JLabel("Numero: ");
		bairroLabel = new JLabel("Bairro: ");
		ufLabel = new JLabel("UF:");
		paisLabel = new JLabel("Pais: ");
		
		matriculaField = new JTextField(8);
		nomeField = new JTextField(31);
		cpfField = new JTextField(11);
		emailField = new JTextField(14);
		telefoneFiles = new JTextField(24);
		
		//Endereço Field
		ruaField = new JTextField(30);
		numeroField = new JTextField(2);
		bairroField = new JTextField(6);
		ufField = new JTextField(4);
		paisField = new JTextField(5);
		
		try {
			MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
			cpfField = new JFormattedTextField(mascaraCPF);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cpfField.setColumns(11);
		
		btnSalvar = new JButton("Salvar");
		btnVoltar = new JButton("Voltar");
	//	btnMais = new JButton("+");
		
		add(comboBox);
		add(linhaLabel);
		add(nomeDptLabel);
		add(nomeDptField);
		add(matriculaLabel);
		add(matriculaField);
		add(nomeLabel);
		add(nomeField);
		add(cpfLabel);
		add(cpfField);
		add(emailLabel);
		add(emailField);
		add(enderecoLabel);
		add(ruaLabel);
		add(ruaField);
		add(numeroLabel);
		add(numeroField);
		add(bairroLabel);
		add(bairroField);
		add(ufLabel);
		add(ufField);
		add(paisLabel);
		add(paisField);
//		add(telefoneLabel);
//		add(telefoneFiles);
	//	add(btnMais);
		add(btnSalvar);
		add(btnVoltar);
		
		setTitle("Cadastro");
		setSize(400,500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setVisible(false);
		setVisible(false);
	}
	
	public JTextField getMatriculaField() {
		return matriculaField;
	}



	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public void setMatriculaField(JTextField matriculaField) {
		this.matriculaField = matriculaField;
	}

	

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public void setNomeLabel(JLabel nomeLabel) {
		this.nomeLabel = nomeLabel;
	}

	public JTextField getNomeField() {
		return nomeField;
	}



	public void setNomeField(JTextField nomeField) {
		this.nomeField = nomeField;
	}



	public JTextField getCpfField() {
		return cpfField;
	}



	public void setCpfField(JTextField cpfField) {
		this.cpfField = cpfField;
	}



	public JTextField getEmailField() {
		return emailField;
	}



	public void setEmailField(JTextField emailField) {
		this.emailField = emailField;
	}



	public JTextField getTelefoneFiles() {
		return telefoneFiles;
	}



	public void setTelefoneFiles(JTextField telefoneFiles) {
		this.telefoneFiles = telefoneFiles;
	}



	public JTextField getRuaField() {
		return ruaField;
	}



	public void setRuaField(JTextField ruaField) {
		this.ruaField = ruaField;
	}



	public JTextField getNumeroField() {
		return numeroField;
	}



	public void setNumeroField(JTextField numeroField) {
		this.numeroField = numeroField;
	}



	public JTextField getBairroField() {
		return bairroField;
	}



	public void setBairroField(JTextField bairroField) {
		this.bairroField = bairroField;
	}



	public JTextField getUfField() {
		return ufField;
	}



	public void setUfField(JTextField ufField) {
		this.ufField = ufField;
	}



	public JTextField getPaisField() {
		return paisField;
	}



	public void setPaisField(JTextField paisField) {
		this.paisField = paisField;
	}



	public JTextField getNomeDptField() {
		return nomeDptField;
	}



	public void setNomeDptField(JTextField nomeDptField) {
		this.nomeDptField = nomeDptField;
	}



	public JLabel getMatriculaLabel() {
		return matriculaLabel;
	}



	public JLabel getCpfLabel() {
		return cpfLabel;
	}



	public JLabel getEmailLabel() {
		return emailLabel;
	}



	public JLabel getTelefoneLabel() {
		return telefoneLabel;
	}



	public JLabel getRuaLabel() {
		return ruaLabel;
	}



	public JLabel getNumeroLabel() {
		return numeroLabel;
	}



	public JLabel getUfLabel() {
		return ufLabel;
	}



	public JLabel getPaisLabel() {
		return paisLabel;
	}



	public JLabel getNomeDptLabel() {
		return nomeDptLabel;
	}



	public JLabel getEnderecoLabel() {
		return enderecoLabel;
	}



	public JButton getBtnSalvar() {
		return btnSalvar;
	}



	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	public JLabel getBairroLabel() {
		return bairroLabel;
	}
}
