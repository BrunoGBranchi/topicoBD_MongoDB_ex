package xmlAula2019.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pessoa {
	
	@XmlAttribute
	private String nome;
	
	@XmlElement
	private Integer cpf;
	
	@XmlElement
	private Endereco endereco;
	
	public Pessoa() {
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public String getNome() {
		return nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public Pessoa(String nome, Integer cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	
}
