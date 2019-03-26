package org.loteria.dao;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.MongoCollection;

import org.loteria.model.Concurso;

public class ConcursoMongo implements ConcursoDAO {
	
	private MongoCollection<Concurso> getCollection() {
		return ConexaoMongo.getDatabase().getCollection("Concurso", Concurso.class);
	}

	
	@Override
	public void inserir(Concurso concurso) {
		getCollection().insertOne(concurso);
		
	}

	@Override
	public void alterar(Concurso concurso) {
		getCollection()
		.updateOne(eq("codigo", concurso.getCodigo()), 
				combine(
						set("numeros", concurso.getNumeros()),
						set("data", concurso.getData())
						));
	}
		
	

	@Override
	public void excluir(Long codigo) {
		getCollection().deleteOne(eq("codigo",codigo));	
	}

	@Override
	public Concurso buscar(Long codigo) {
		return getCollection().find(eq("codigo",codigo)).first();
	}

	@Override
	public List<Concurso> listar() {
		List<Concurso> Concursos = new ArrayList<>();
		getCollection().find().iterator().forEachRemaining(Concursos::add);
		return Concursos;
	}

}
