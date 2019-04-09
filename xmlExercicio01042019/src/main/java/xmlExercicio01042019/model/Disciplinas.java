package xmlExercicio01042019.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Disciplinas {
	
	@XmlElement
	private List<Disciplina> disciplina;
	
	public Double getMedia() {
		return disciplina.stream().mapToDouble(Disciplina::getNota).average().orElse(0.0);
	}
	
	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public Disciplinas(List<Disciplina> disciplina) {
		super();
		this.disciplina = disciplina;
	}

	public Disciplinas() {
	}

	
}
