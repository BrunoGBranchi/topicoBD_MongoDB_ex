package org.loteria.dao;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;

import java.util.ArrayList;
import java.util.List;

import org.loteria.model.Ganhadores;

import com.mongodb.client.MongoCollection;

public class GanhadoresMongo implements GanhadoresDAO{
	
	
	private MongoCollection<Ganhadores> getCollection() {
		return ConexaoMongo.getDatabase().getCollection("Ganhadores", Ganhadores.class);
	}

	
	@Override
	public void inserir(Ganhadores ganhadores) {
		getCollection().insertOne(ganhadores);
		
	}

	@Override
	public void alterar(Ganhadores ganhadores) {
		getCollection()
		.updateOne(eq("codigo", ganhadores.getCodigo()), 
				combine(
						set("nome", ganhadores.getNome()),
						set("qtd_acertos", ganhadores.getQtd_acertos())
						));
	}
		
	

	@Override
	public void excluir(Long codigo) {
		getCollection().deleteOne(eq("codigo",codigo));	
	}

	@Override
	public Ganhadores buscar(Long codigo) {
		return getCollection().find(eq("codigo",codigo)).first();
	}

	@Override
	public List<Ganhadores> listar() {
		List<Ganhadores> Ganhadoress = new ArrayList<>();
		getCollection().find().iterator().forEachRemaining(Ganhadoress::add);
		return Ganhadoress;
	}

}
