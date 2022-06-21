package Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	@Temporal(TemporalType.DATE)
	private Date data_Emprestimo;
	@Column
	@Temporal(TemporalType.DATE)
	private Date data_Devolucao;
	@JoinColumn(name = "matricula_pessoa", nullable = false)
	@ManyToOne
	private Pessoa pessoa;
	@OneToOne
	private Livro livro;
	
	
	public Emprestimo(){
		
	}

	public Long getId() {
		return id;
	}

	public Date getData_Emprestimo() {
		return data_Emprestimo;
	}

	public void setData_Emprestimo(Date data_Emprestimo) {
		this.data_Emprestimo = data_Emprestimo;
	}

	public Date getData_Devolucao() {
		return data_Devolucao;
	}

	public void setData_Devolucao(Date data_Devolucao) {
		this.data_Devolucao = data_Devolucao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	



	
}
