package model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import util.DateUtils;

@Entity
@Table(name="alunos")
public class Aluno {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false, unique=true, length=45)
	private String matricula;
	
	@Column(nullable=false, length=100)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Column(nullable=false, length=10)
	private String rg;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Responsavel responsavel;
	
	@ManyToMany(mappedBy="alunos")
	private List<Curso> cursos;
	
	public Aluno(){
		
	}

	
	
	public Aluno(String matricula, String nome, Date dataNascimento,
			String rg, Responsavel responsavel) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.responsavel = responsavel;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}



	public Responsavel getResponsavel() {
		return responsavel;
	}



	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	
	public List<Curso> getCursos() {
		return cursos;
	}



	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}



	public String toString(){
		return "[" + id + "] " + nome + " (Resp.:" + responsavel + ")"
				+ " Matrícula: " + matricula
				+ " RG: " + rg
				+ " Data de Nascimento: " +  DateUtils.formataData(dataNascimento);
	}
	
	
}
