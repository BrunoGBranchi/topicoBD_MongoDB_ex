package xmlExercicio01042019.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Disciplina {
	
	@XmlAttribute
	private Long codigo;

	@XmlAttribute
	private String nome;

	@XmlElement
	private Double nota;

	private Double media;

	private Double somarNotas;

	private Integer qtd_Notas;

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Double getNota() {
		return nota;
	}

	public Double getMedia() {
		return media;
	}

	public Double getSomarNotas() {
		return somarNotas;
	}

	public Integer getQtd_Notas() {
		return qtd_Notas;
	}

	public Disciplina(Long codigo, String nome, Double nota, Double media, Double somarNotas, Integer qtd_Notas) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.nota = nota;
		this.media = media;
		this.somarNotas = somarNotas;
		this.qtd_Notas = qtd_Notas;
	}

	public Disciplina() {
	}
	
	
	
}
