package xmlExercicio01042019.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Alunos {
	@XmlElement(name = "aluno")
	private List<Aluno> alunos;

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public Alunos(List<Aluno> alunos) {
		super();
		this.alunos = alunos;
	}

	public Alunos() {
	
	}
	
	
}
