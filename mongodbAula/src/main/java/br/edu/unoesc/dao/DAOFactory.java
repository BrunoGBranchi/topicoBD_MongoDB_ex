package br.edu.unoesc.dao;

public interface DAOFactory {

	NoticiaDAO noticiaDao();
	
	ComentarioDAO comentarioDao();
}