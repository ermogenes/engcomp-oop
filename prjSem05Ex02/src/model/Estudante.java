package model;

public class Estudante implements Comparable<Estudante> {

	private int id;
	private String nome;
	private double nota;
	
	public Estudante(int id, String nome, double nota) {
		this.id = id;
		this.nome = nome;
		this.nota = nota;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return String.format("Estudante [id=%1$d, nome=%2$s, nota=%3$.1f]", this.id, this.nome, this.nota);
	}

	@Override
	public int compareTo(Estudante e) {
		return (int)(this.nota - e.getNota());
	}
	
	public static <T extends Comparable<T>> void ordenarSelecao(T[] estudantes){
		int i, j, min;
		T aux;
		for (i = 0; i < (estudantes.length -1); i++) {
			min = i;
			for (j = (i+1); j < estudantes.length; j++) {
				if(estudantes[j].compareTo(estudantes[min]) < 0) 
					min = j;
			}
			if (i != min) {
				aux = estudantes[i];
				estudantes[i] = estudantes[min];
				estudantes[min] = aux;
			}
		}
	}

}
