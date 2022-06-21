package Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, unique = true, length= 30)
	private int matricula;
	@Column(nullable = false, length = 50)
	private String nome;
	@Column(nullable = false, unique = true, length = 11)
	private String cpf;
	@Column(nullable = false, length = 1)
	private int tipo;
	@Column(nullable = false)
	private boolean isProfessor;
	@Column(unique = true, length = 20)
	private String email;
//	@Column(nullable = false)
	@OneToOne(cascade = CascadeType.PERSIST)
	private Endereco end;
	@Column(nullable = false, length = 9)
	@OneToMany(mappedBy = "pessoa", targetEntity = Telefone.class)
	private List<Telefone> telefones;
	@JoinColumn(name = "id_departamento", nullable = true)
	@ManyToOne
	private Departamento departamento;
	@OneToMany(mappedBy = "pessoa", targetEntity = Emprestimo.class)
	private List<Emprestimo> emprestimos;
	@OneToMany(mappedBy = "pessoa", targetEntity = Reserva.class)
	private List<Reserva> reservas;
	@Column
	private String situcao;
	
	public Pessoa() {
		
	}

	public String getSitucao() {
		return situcao;
	}


	public void setSitucao(String situcao) {
		this.situcao = situcao;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}


	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}


	public List<Reserva> getReservas() {
		return reservas;
	}


	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}


	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public boolean isProfessor() {
		return isProfessor;
	}
	public void setProfessor(boolean isProfessor) {
		this.isProfessor = isProfessor;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public Long getId() {
		return id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + (isProfessor ? 1231 : 1237);
		result = prime * result + matricula;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefones == null) ? 0 : telefones.hashCode());
		result = prime * result + tipo;
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
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (isProfessor != other.isProfessor)
			return false;
		if (matricula != other.matricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefones == null) {
			if (other.telefones != null)
				return false;
		} else if (!telefones.equals(other.telefones))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", matricula=" + matricula + ", nome=" + nome + ", cpf=" + cpf + ", tipo=" + tipo
				+ ", isProfessor=" + isProfessor + ", email=" + email + ", end=" + end + ", telefones=" + telefones
				+ ", departamento=" + departamento + "]";
	}
}
