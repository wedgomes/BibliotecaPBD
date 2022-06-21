package Model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private int ano_Publicacao;
	@Column
	private int numero_Edicao;
	@Column
	private String titulo;
	@Column
	private String editora;
	@Column
	private int numero_Exemplares;
	@OneToMany(mappedBy = "livro", targetEntity = Autor.class, cascade = CascadeType.PERSIST)
	private List<Autor> autores;
	
	
	
	public Livro() {
		
	}

	public Long getId() {
		return id;
	}
	
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public int getAno_Publicacao() {
		return ano_Publicacao;
	}

	public void setAno_Publicacao(int ano_Publicacao) {
		this.ano_Publicacao = ano_Publicacao;
	}

	public int getNumero_Edicao() {
		return numero_Edicao;
	}

	public void setNumero_Edicao(int numero_Edicao) {
		this.numero_Edicao = numero_Edicao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumero_Exemplares() {
		return numero_Exemplares;
	}

	public void setNumero_Exemplares(int numero_Exemplares) {
		this.numero_Exemplares = numero_Exemplares;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano_Publicacao;
		result = prime * result + ((autores == null) ? 0 : autores.hashCode());
		result = prime * result + numero_Edicao;
		result = prime * result + numero_Exemplares;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Livro other = (Livro) obj;
		if (ano_Publicacao != other.ano_Publicacao)
			return false;
		if (autores == null) {
			if (other.autores != null)
				return false;
		} else if (!autores.equals(other.autores))
			return false;
		if (numero_Edicao != other.numero_Edicao)
			return false;
		if (numero_Exemplares != other.numero_Exemplares)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", ano_Publicacao=" + ano_Publicacao + ", numero_Edicao=" + numero_Edicao
				+ ", titulo=" + titulo + ", numero_Exemplares=" + numero_Exemplares + ", autores=" + autores + "]";
	}
}
