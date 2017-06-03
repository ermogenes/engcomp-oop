package test;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import model.*;

public class TesteUniversidade {

	public static void main(String[] args) {
		
		Estudante[] estudantes = new Estudante[5];
		
		estudantes[0] = new Estudante(1010, "Jo",   5.5);
		estudantes[1] = new Estudante(2020, "Ana",  6.5);
		estudantes[2] = new Estudante(3030, "Sara", 7.5);
		estudantes[3] = new Estudante(4040, "Luiz", 3.7);
		estudantes[4] = new Estudante(5050, "Leo",  3.8);
		
		List<Estudante> list1 = new LinkedList<Estudante>();
		list1.add(estudantes[0]);
		list1.add(estudantes[1]);
		
		List<Estudante> list2 = new ArrayList<Estudante>();
		list2.add(estudantes[2]);
		list2.add(estudantes[3]);
		list2.add(estudantes[4]);
		
		Turma t1 = new Turma(list1);
		Turma t2 = new Turma(list2);
		
		t1.calcularAtualizarMedia();
		t2.calcularAtualizarMedia();
		
		StringBuffer s = new StringBuffer();
		
		s.append(String.format("Turma 1: %s\n", t1));
		s.append(String.format("Turma 2: %s\n", t2));
		
		s.append(String.format("Aluno com maior nota da turma 1: %s\n", t1.estudanteComMaiorNota()));
		s.append(String.format("Aluno com maior nota da turma 2: %s\n", t2.estudanteComMaiorNota()));

		
		boolean adicionaVirgula;
		
		s.append("Estudantes aprovados da Turma 1: [");
		adicionaVirgula = false;
		for(Estudante e: t1.estudantesAprovados()) {
			s.append((adicionaVirgula ? "," : "") + e);
			adicionaVirgula = true;
		}
		s.append("]\n");
		
		s.append("Estudantes aprovados da Turma 2: [");
		adicionaVirgula = false;
		for(Estudante e: t2.estudantesAprovados()) {
			s.append((adicionaVirgula ? "," : "") + e);
			adicionaVirgula = true;
		}
		s.append("]\n");
		
		s.append("Após juntar as turmas na turma 1\n");
		
		t1.juntarTurma(t2);

		s.append(String.format("Turma 1: %s\n", t1));
		s.append(String.format("Turma 2: %s\n", t2));

		System.out.println(s);
		
	}

}
