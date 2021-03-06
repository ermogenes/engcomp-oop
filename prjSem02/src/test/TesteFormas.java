package test;

import model.*;

public class TesteFormas {

	public static void main(String[] args) {
		Paralelogramo[] formas = new Paralelogramo[3];
		formas[0] = new Paralelogramo(4, 1, 0.7853981633974483);
		formas[1] = new Retangulo(3, 2);
		formas[2] = new Quadrado(1);
	
		for(int i = 0; i < formas.length; i++){
			System.out.println(formas[i]);
			System.out.println(formas[i].getAngulo());
			System.out.println(String.format("Area: %.1f", formas[i].calcularArea()));
			System.out.println(String.format("Perimetro: %.16f\n", formas[i].calcularPerimetro()));
		}

	}

}
