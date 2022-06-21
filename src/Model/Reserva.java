package Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "reserva")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	@Temporal(TemporalType.DATE)
	private Date data_Realizada;
	@Column
	@Temporal(TemporalType.DATE)
	private Date data_Validacao;
	@Column
	@Temporal(TemporalType.DATE)
	private Date data_Limite;
	@OneToOne
	private Livro livro;
	@ManyToOne
	private Pessoa pessoa;
	
	public Reserva() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData_Realizada() {
		return data_Realizada;
	}

	public void setData_Realizada(Date data_Realizada) {
		this.data_Realizada = data_Realizada;
	}

	public Date getData_Validacao() {
		return data_Validacao;
	}

	public void setData_Validacao(Date data_Validacao) {
		this.data_Validacao = data_Validacao;
	}

	public Date getData_Limite() {
		return data_Limite;
	}

	public void setData_Limite(Date data_Limite) {
		this.data_Limite = data_Limite;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data_Limite == null) ? 0 : data_Limite.hashCode());
		result = prime * result + ((data_Realizada == null) ? 0 : data_Realizada.hashCode());
		result = prime * result + ((data_Validacao == null) ? 0 : data_Validacao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((livro == null) ? 0 : livro.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		if (data_Limite == null) {
			if (other.data_Limite != null)
				return false;
		} else if (!data_Limite.equals(other.data_Limite))
			return false;
		if (data_Realizada == null) {
			if (other.data_Realizada != null)
				return false;
		} else if (!data_Realizada.equals(other.data_Realizada))
			return false;
		if (data_Validacao == null) {
			if (other.data_Validacao != null)
				return false;
		} else if (!data_Validacao.equals(other.data_Validacao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (livro == null) {
			if (other.livro != null)
				return false;
		} else if (!livro.equals(other.livro))
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", data_Realizada=" + data_Realizada + ", data_Validacao=" + data_Validacao
				+ ", data_Limite=" + data_Limite + ", livro=" + livro + ", pessoa=" + pessoa + "]";
	}	
}
