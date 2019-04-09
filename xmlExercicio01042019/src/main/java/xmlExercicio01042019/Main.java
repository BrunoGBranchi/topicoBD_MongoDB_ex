package xmlExercicio01042019;

import java.io.File;
import xmlExercicio01042019.conversor.ConverterXML;
import xmlExercicio01042019.model.Aluno;
import xmlExercicio01042019.model.Disciplina;
import xmlExercicio01042019.model.Turma;

public class Main {

	public static void main(String[] args) {

		ConverterXML<Turma> conversor = new ConverterXML<>(Turma.class);
		Turma turma = conversor.gerarObj(new File("exercicio.xml"));
		System.out.println(turma.getMedia());
		System.out.println();
		for (Aluno aluno : turma.getAlunos().getAlunos()) {
				System.out.println("Media do aluno "+ aluno.getNome() +": "+aluno.getMedia());
			}
			
		}
	
	public static Double mediaDisciplina(Turma turma, Long Codigo) {
		Double soma = 0.0;
		int contador = 0;
		for(Aluno aluno : turma.getAlunos().getAlunos()) {
			for(Disciplina disciplina : aluno.getDisciplinas().getDisciplina()) {
				if(disciplina.getCodigo().equals(Codigo)) {
					soma += disciplina.getNota();
					contador ++;
				}
			}
		}
		return soma/contador;
		
	}
		
	}


