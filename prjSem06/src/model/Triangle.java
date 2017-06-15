package model;

public class Triangle extends Shape {

	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		if (a <=0 || b <= 0 || c <=0) {
			throw new IllegalArgumentException("Os parâmetros devem ser positivos não nulos.");
		} else if (!ladosValidos(a, b, c)) {
			throw new IllegalArgumentException("Nenhum lado pode ser menos que a soma dos demais lados.");
		} else {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	
	private static boolean ladosValidos(double a, double b, double c) {
		return ((a < b + c)
			&&  (b < a + c)
			&&  (c < a + b));
	}
	
	public double getArea() {
		double p = (a + b + c) / 2; // semi-perímetro
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
}
