package org.loteria.dao;

public interface DAOFactory {

	ConcursoDAO noticiaDao();
	
	GanhadoresDAO comentarioDao();
}