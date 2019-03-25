package br.edu.unoesc.dao;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.MongoCollection;

import br.edu.unoesc.mongodbAula.model.Comentario;

public class ComentarioMongo implements ComentarioDAO{
	
	private MongoCollection<Comentario> getCollection() {
		return ConexaoMongo.getDatabase().getCollection("comentario", Comentario.class);
	}

	
	@Override
	public void inserir(Comentario comentario) {
		getCollection().insertOne(comentario);
		
	}

	@Override
	public void alterar(Comentario comentario) {
		getCollection()
		.updateOne(eq("codigo", comentario.getCodigo()), 
				combine(
						set("titulo", comentario.getAutor()),
						set("descricao", comentario.getDescricao()),
						set("data_publicacao", comentario.getData())
						));
	}
		
	

	@Override
	public void excluir(Long codigo) {
		getCollection().deleteOne(eq("codigo",codigo));	
	}

	@Override
	public Comentario buscar(Long codigo) {
		return getCollection().find(eq("codigo",codigo)).first();
	}

	@Override
	public List<Comentario> listar() {
		List<Comentario> comentarios = new ArrayList<>();
		getCollection().find().iterator().forEachRemaining(comentarios::add);
		return comentarios;
	}

}
