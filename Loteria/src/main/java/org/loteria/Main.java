package org.loteria;

import org.loteria.dao.ConcursoDAO;
import org.loteria.dao.ConcursoMongo;

public class Main {

	public static void main(String[] args) {
		ConcursoDAO concursoDao = new ConcursoMongo();
	}

}
