package test;

import model.Estudante;

public class TesteOrdenacao {

	public static void main(String[] args) {
		Estudante[] vec = new Estudante[4];
		
		vec[0] = new Estudante(1010, "Jo",   5.5);
		vec[1] = new Estudante(2020, "Ana",  6.5);
		vec[2] = new Estudante(3030, "Sara", 7.5);
		vec[3] = new Estudante(4040, "Luiz", 3.7);
		
		Estudante.ordenarSelecao(vec);
		
		for(Estudante e: vec){
			System.out.println(e);
		}

	}

}
