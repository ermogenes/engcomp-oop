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

}
