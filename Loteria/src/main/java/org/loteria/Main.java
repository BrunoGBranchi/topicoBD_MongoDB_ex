package org.loteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.loteria.dao.ConcursoDAO;
import org.loteria.dao.ConcursoMongo;
import org.loteria.model.Concurso;
import org.loteria.model.Ganhadores;

public class Main {

	public static void main(String[] args) {
		
		String nomeJogador = "Felisbino";
		int numerosJogados = 561287;
		
		ConcursoDAO concursoDao = new ConcursoMongo();
		
		Concurso concursoInsert = new Concurso();
		Ganhadores ganhadoresInsert = new Ganhadores();
		concursoInsert.setNumeros(561287);
		concursoInsert.setData(new Date());
		concursoInsert.setCodigo(1L);
		List<Ganhadores> winners = new ArrayList<>();
		if (numerosJogados == concursoInsert.getNumeros()) {
			ganhadoresInsert.setNome(nomeJogador);
			ganhadoresInsert.setQtd_acertos(6);
			ganhadoresInsert.setCodigo(1L);
			winners.add(ganhadoresInsert);
			concursoInsert.setGanhadores(winners);
			System.out.println(nomeJogador);
		}
		
		concursoDao.inserir(concursoInsert);
		
		concursoDao.listar().forEach(concurso -> {
			System.out.println(concurso.getCodigo());
			System.out.println(concurso.getData());
			System.out.println(concurso.getNumeros());
			concurso.getGanhadores().forEach(ganhador -> {
				System.out.println(ganhador.getNome());
				System.out.println(ganhador.getQtd_acertos());
			});
		});
		
	}

}
