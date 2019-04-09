package xmlExercicio01042019.model;

import java.util.Set;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Turma {

	@XmlAttribute
	private String nome;

	@XmlElement
	private Alunos alunos;

	private Double media;

	private Set<Disciplina> disciplinas;

	public String getNome() {
		return nome;
	}
	
	public Double getMedia() {
		return alunos.getMedia();
	}
	
	public Alunos getAlunos() {
		return alunos;
	}
	
	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public Turma(String nome, Alunos alunos, Double media, Set<Disciplina> disciplinas) {
		super();
		this.nome = nome;
		this.alunos = alunos;
		this.media = media;
		this.disciplinas = disciplinas;
	}

	public Turma() {
	
	}
	
	
	
}
