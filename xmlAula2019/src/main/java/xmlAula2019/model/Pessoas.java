package xmlAula2019.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pessoas {
	
	@XmlElementWrapper(name = "pessoa")
	private List<Pessoa> pessoas;

	public Pessoas(List<Pessoa> pessoas) {
		super();
		this.pessoas = pessoas;
	}

	public Pessoas() {
	
	}
	
	
}
