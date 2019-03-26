package org.loteria.model;

public class Ganhadores {
	
	private Long codigo;
	
	private String nome;
	
	private int qtd_acertos;

	public Ganhadores() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtd_acertos() {
		return qtd_acertos;
	}

	public void setQtd_acertos(int qtd_acertos) {
		this.qtd_acertos = qtd_acertos;
	}

	public Ganhadores(Long codigo, String nome, int qtd_acertos) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.qtd_acertos = qtd_acertos;
	}
	
	
	
}
