package xmlExercicio01042019;

import java.io.File;
import xmlExercicio01042019.conversor.ConverterXML;
import xmlExercicio01042019.model.Aluno;
import xmlExercicio01042019.model.Disciplina;
import xmlExercicio01042019.model.Turma;

public class Main {

	public static void main(String[] args) {

		ConverterXML<Turma> conversor = new ConverterXML<>(Turma.class);
		int n = 2;
		double[] v = new double[n];
		int i;
		Turma turma = conversor.gerarObj(new File("exercicio.xml"));
		Double soma = 0.0;
		for (Aluno aluno : turma.getAlunos().getAlunos()) {
			System.out.println(aluno.getNome());
			for (Disciplina disciplina : aluno.getDisciplinas().getDisciplina()) {
				for (i=0; i<n; i++) {
				      System.out.printf("", (i+1), n);
				      v[i] = disciplina.getNota();
				      soma = soma+v[i];
				      
				    }
				System.out.println(soma/2);
			}
			
			
		}
		
	}

}
