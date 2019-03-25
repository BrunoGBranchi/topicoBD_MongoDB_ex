package br.edu.unoesc.mongodbAula;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.edu.unoesc.dao.NoticiaDAO;
import br.edu.unoesc.dao.NoticiaMongo;
import br.edu.unoesc.mongodbAula.model.Comentario;
import br.edu.unoesc.mongodbAula.model.Noticia;

public class Main {

	public static void main(String[] args) {
		
		NoticiaDAO noticiaDao = new NoticiaMongo();
		
		Noticia noticiaInsert = new Noticia();
		Comentario comentarioInsert = new Comentario();
		noticiaInsert.setAutor("Bruno Ghilardi Branchi");
		noticiaInsert.setTitulo("Insert com DAO e com comentario");
		noticiaInsert.setDescricao("Estamos criando um DAO para manipular e adicionar um comentario");
		noticiaInsert.setData_publicacao(new Date());
		noticiaInsert.setCodigo(2L);
		
		List<Comentario> comment = new ArrayList<>();
		comentarioInsert.setAutor("Bruno Branchi");
		comentarioInsert.setCodigo(2L);
		comentarioInsert.setData(new Date());
		comentarioInsert.setDescricao("Comentario adicionado com sucesso");
		comment.add(comentarioInsert);
		noticiaInsert.setComentario(comment);
		
		noticiaDao.inserir(noticiaInsert);
		
		noticiaInsert.setAutor("Bruno G. Branchi");
		
		noticiaDao.alterar(noticiaInsert);
		
		
		noticiaDao.listar().forEach(noticia->{
			System.out.print(" Titulo: "+noticia.getTitulo());
			System.out.print(" Autor: "+noticia.getAutor());
			System.out.println(" Codigo: "+noticia.getCodigo());
			
			noticia.getComentario().forEach(comentario->{
				System.out.println(comentario.getAutor());
				System.out.println(comentario.getDescricao());
				System.out.println(comentario.getData());
			});
		});

	}

}
