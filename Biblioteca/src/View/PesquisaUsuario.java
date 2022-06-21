package View;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;


public class PesquisaUsuario extends JFrame{

	private JButton btnConsultarLivro, btnConsultarSitucao, btnConsultarEmprestimos, pesquisarButton;
	private JLabel consultarLabel;
	private JTextField campoPesquisaField;
	private JRadioButton idRadio, tituloRadio, anoRadio, exemplarRadio, numEdicaoRadio, palavraChaveRadio, autorRadio, editoraRadio;
	private JComboBox<String> comboBox;
	private ButtonGroup bg;
	private JTable table;
	
	public PesquisaUsuario(){
		String[] opcao = {"       Livro       ", "       Empréstimos       ","       Situação       "};
		comboBox = new JComboBox<>(opcao);
		
		idRadio = new JRadioButton("ID", true);
		tituloRadio = new JRadioButton("Titulo");
		anoRadio = new JRadioButton("Ano Publicação");
		exemplarRadio = new JRadioButton("Nº Exemplares");
		numEdicaoRadio = new JRadioButton("Nº Edição");
		palavraChaveRadio = new JRadioButton("Palavra Chave");
		autorRadio = new JRadioButton("Autor");
		editoraRadio = new JRadioButton("Editora");
		
		bg = new ButtonGroup();
		bg.add(idRadio);
		bg.add(tituloRadio);
		bg.add(anoRadio);
		bg.add(exemplarRadio);
		bg.add(numEdicaoRadio);
		bg.add(palavraChaveRadio);
		bg.add(autorRadio);
		bg.add(editoraRadio);
		
		btnConsultarLivro = new JButton("Livro");
		btnConsultarSitucao = new JButton("Situação");
		btnConsultarEmprestimos = new JButton("Empréstimos");
		pesquisarButton = new JButton("Pesquisar");
		
		consultarLabel = new JLabel("                                                                         Consultar:");
		consultarLabel.setFont(new Font("Batang", Font.BOLD, 15));
		
		campoPesquisaField = new JTextField(9);
//		campoComboFiedl = new JTextField(15);
//		
//		areaPesquisa = new JTextArea("Dados - Pesquisa", 27,33);
//		areaPesquisa.setEditable(false);
		
//		table = new JTable();
//		tabela = new Tabela();
//		
		
	//	table.setModel(tabela);
	//	table.setPreferredScrollableViewportSize(new Dimension(500,300));
	//	table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		
	//	JScrollPane scroll = new JScrollPane(table);
		
		add(consultarLabel);
		add(comboBox);
		add(idRadio);
		add(tituloRadio);
		add(anoRadio);
		add(exemplarRadio);
		add(numEdicaoRadio);
		add(palavraChaveRadio);
		add(autorRadio);
		add(editoraRadio);
		add(campoPesquisaField);
		add(pesquisarButton);

		
		setTitle("Pesquisa");
		setSize(550,520);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setVisible(false);
		setVisible(false);
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}
	

	public JRadioButton getEditoraRadio() {
		return editoraRadio;
	}

	public JRadioButton getAutorRadio() {
		return autorRadio;
	}

	public JTextField getCampoPesquisaField() {
		return campoPesquisaField;
	}

	public void setCampoPesquisaField(JTextField palavraChaveField) {
		this.campoPesquisaField = palavraChaveField;
	}

	public JButton getBtnConsultarLivro() {
		return btnConsultarLivro;
	}

	public JButton getBtnConsultarSitucao() {
		return btnConsultarSitucao;
	}

	public JRadioButton getTituloRadio() {
		return tituloRadio;
	}

	public JButton getPesquisarButton() {
		return pesquisarButton;
	}

	public JButton getBtnConsultarEmprestimos() {
		return btnConsultarEmprestimos;
	}

	public JRadioButton getIdRadio() {
		return idRadio;
	}

	public JRadioButton getAnoRadio() {
		return anoRadio;
	}

	public JRadioButton getExemplarRadio() {
		return exemplarRadio;
	}

	public JRadioButton getNumEdicaoRadio() {
		return numEdicaoRadio;
	}

	public JRadioButton getPalavraCahveRadio() {
		return palavraChaveRadio;
	}
}
