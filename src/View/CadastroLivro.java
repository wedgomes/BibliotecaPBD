package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroLivro extends JFrame{

	private JLabel tituloLabel, numEdicaoLabel, anoLabel, numeroExemLabel, editoraLabel, autorLabel;
	private JTextField tituloField, edicaoField, anoField, numeroExempField;
	private JButton salvarButton, voltarButton;
	
	public CadastroLivro() {
		tituloLabel = new JLabel("Titulo: ");
		numEdicaoLabel = new JLabel("Nº Edição: ");
		anoLabel = new JLabel("Ano Publicação: ");
		numeroExemLabel = new JLabel("Nº de Emplares: ");
		
		tituloField = new JTextField(25);
		edicaoField = new JTextField(5);
		anoField = new JTextField(8);
		numeroExempField = new JTextField(3);
		
		salvarButton = new JButton("Salvar");
		voltarButton = new JButton("Voltar");
		
		add(tituloLabel);
		add(tituloField);
		add(numEdicaoLabel);
		add(edicaoField);
		add(anoLabel);
		add(anoField);
		add(numeroExemLabel);
		add(numeroExempField);
		add(salvarButton);
		add(voltarButton);
		
		setTitle("Cadastro Livro");
		setSize(365,200);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setVisible(false);
		setVisible(true);
	}

	public JTextField getTituloField() {
		return tituloField;
	}

	public void setTituloField(JTextField tituloField) {
		this.tituloField = tituloField;
	}

	public JTextField getEdicaoField() {
		return edicaoField;
	}

	public void setEdicaoField(JTextField edicaoField) {
		this.edicaoField = edicaoField;
	}

	public JTextField getAnoField() {
		return anoField;
	}

	public void setAnoField(JTextField anoField) {
		this.anoField = anoField;
	}

	public JTextField getNumeroExempField() {
		return numeroExempField;
	}

	public void setNumeroExempField(JTextField numeroExempField) {
		this.numeroExempField = numeroExempField;
	}

	public JButton getSalvarButton() {
		return salvarButton;
	}

	public JButton getVoltarButton() {
		return voltarButton;
	}
	
	public static void main(String[] args) {
		new CadastroLivro();
	}
}
