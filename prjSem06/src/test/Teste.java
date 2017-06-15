package test;

import model.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

	public static void main(String args[]) {
		double a, b, c;
		double altura, largura;
		double raio;

		boolean concluido = false;

		Scanner leitorConsole = new Scanner(System.in);
		
		while (!concluido) {
		
			try {

				System.out.println("--- Entre com os objetos solicitados ---");
			
				System.out.println("-- C�rculo --");
				System.out.print("raio: ");
				raio = leitorConsole.nextDouble();
				
				System.out.println("-- Ret�ngulo --");
				System.out.print("altura: ");
				altura = leitorConsole.nextDouble();
				System.out.print("\nlargura: ");
				largura = leitorConsole.nextDouble();

				System.out.println("-- Tri�ngulo --");
				System.out.print("a: ");
				a = leitorConsole.nextDouble();
				System.out.print("\nb: ");
				b = leitorConsole.nextDouble();
				System.out.print("\nc: ");
				c = leitorConsole.nextDouble();

				Circle ci = new Circle(raio);
				Rectangle re = new Rectangle(altura, largura);
				Triangle tr = new Triangle(a, b, c);
				
				System.out.println(String.format("-- �rea do c�rculo: %s", ci.getArea()));
				System.out.println(String.format("-- �rea do ret�ngulo: %s", re.getArea()));
				System.out.println(String.format("-- �rea do tri�ngulo: %s", tr.getArea()));
			
				concluido = true;
				
			} catch (InputMismatchException ime) {
				System.out.println("Entre somente com valores num�ricos.");
			} catch (IllegalArgumentException iae) {
				System.out.println("Valores inv�lidos: " + iae.getMessage());
			} finally {
				System.out.println("Entrou no finally");
			}
		
		}

		leitorConsole.close();
		System.out.println("Fim do programa.");
	}

}
