package model;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Turma {
	
	private static final double MEDIA_MINIMA_APROVACAO = 5.0;

	private List<Estudante> estudantes;
	private double mediaNotaTurma;
	
	public Turma(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}

	public double getMediaNotaTurma() {
		return mediaNotaTurma;
	}

	public void setMediaNotaTurma(double mediaNotaTurma) {
		this.mediaNotaTurma = mediaNotaTurma;
	}

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		
		s.append("Turma [estudantes=[");
		
		boolean adicionaVirgula = false;
		for(Estudante e : this.estudantes) {
			s.append(adicionaVirgula ? ", " : "");
			s.append(e);
			adicionaVirgula = true;
		}

		s.append(String.format("], mediaNotaTurma=%.1f]", this.mediaNotaTurma));
		
		return s.toString();
	}
	
	public double calcularAtualizarMedia() {
		double soma = 0;
		for(Estudante e : this.estudantes) {
			soma += e.getNota();
		}
		
		this.mediaNotaTurma = (this.estudantes.size() == 0 ? 0 : soma / this.estudantes.size());
		
		return this.mediaNotaTurma;
	}
	
	public Estudante estudanteComMaiorNota() {
		return Collections.max(this.estudantes);
	}

	public List<Estudante> estudantesAprovados() {
		List<Estudante> estudantesAprovados = new ArrayList<Estudante>(); 

		for(Estudante e : this.estudantes) {
			if (e.getNota() >= Turma.MEDIA_MINIMA_APROVACAO){
				estudantesAprovados.add(e);
			}
		}
		
		return estudantesAprovados;
	}

	public void juntarTurma(Turma t) {
		this.estudantes.addAll(t.getEstudantes());
		t.setEstudantes(Collections.emptyList());
		t.calcularAtualizarMedia();
		this.calcularAtualizarMedia();
	}
}
