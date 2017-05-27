package test;

import model.*;

public class TesteCarbono {

	public static void main(String[] args) {

		EmissorCarbono[] e = new EmissorCarbono[3];
		e[0] = new Casa(3, 500);
		e[1] = new Carro(1600);
		e[2] = new Bicicleta(16);
		
		for(int i = 0; i < e.length; i++){
			System.out.print(e[i]);
			System.out.print(": ");
			System.out.println(e[i].getCarbonoEmitido());
		}
	}

}
