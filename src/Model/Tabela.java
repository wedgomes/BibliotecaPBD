package Model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class Tabela extends AbstractTableModel{

	private final int ID=0;
	private final int PUBLICACAO=1;
	private final int EDICAO=2;
	private final int EXEMPLARES=3;
	private final int TITULO=4;
	
	private final String colunas[] = {"ID","PUBLICAÇÃO","EDIÇÃO","EXEMPLARES","TITULO"};
	private List<Livro> livros;
	
	public Tabela() {
	//	this.livros = livros;
		
	}
	
	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getID() {
		return ID;
	}

	public int getPUBLICACAO() {
		return PUBLICACAO;
	}

	public int getEDICAO() {
		return EDICAO;
	}

	public int getEXEMPLARES() {
		return EXEMPLARES;
	}

	public int getTITULO() {
		return TITULO;
	}

	public String[] getColunas() {
		return colunas;
	}

}
