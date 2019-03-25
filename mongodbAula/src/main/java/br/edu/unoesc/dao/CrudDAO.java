package br.edu.unoesc.dao;

import java.util.List;

public interface CrudDAO<T> {

	void inserir(T dado);

	void alterar(T dado);

	void excluir(Long codigo);
	
	T buscar(Long codigo);
	
	List<T> listar();

}