package org.loteria.model;

import java.util.Date;
import java.util.List;

public class Concurso {
	
	private Long codigo;
	
	private Integer numeros;
	
	private Date Data;
	
	List<Ganhadores> ganhadores;

	
	public Concurso() {
	}


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public Integer getNumeros() {
		return numeros;
	}


	public void setNumeros(Integer numeros) {
		this.numeros = numeros;
	}


	public Date getData() {
		return Data;
	}


	public void setData(Date data) {
		Data = data;
	}


	public List<Ganhadores> getGanhadores() {
		return ganhadores;
	}


	public void setGanhadores(List<Ganhadores> ganhadores) {
		this.ganhadores = ganhadores;
	}


	public Concurso(Long codigo, Integer numeros, Date data, List<Ganhadores> ganhadores) {
		super();
		this.codigo = codigo;
		this.numeros = numeros;
		Data = data;
		this.ganhadores = ganhadores;
	}
	
	
	
}
