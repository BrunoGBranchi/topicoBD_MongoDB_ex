package xmlExercicio01042019.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aluno {
	
	@XmlElement
	private String nome;

	@XmlElement
	private Disciplinas disciplinas;

	private Double media;

	public void setMedia(Double media) {
		this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public Disciplinas getDisciplinas() {
		return disciplinas;
	}

	public Double getMedia() {
		return media;
	}

	public Aluno(String nome, Disciplinas disciplinas, Double media) {
		super();
		this.nome = nome;
		this.disciplinas = disciplinas;
		this.media = media;
	}

	public Aluno() {
	}
	
	
}
