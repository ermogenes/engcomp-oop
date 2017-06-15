package model;

public class Circle extends Shape {

	private double raio;

	public Circle(double raio) {
		if (raio <=0) {
			throw new IllegalArgumentException("Os par�metros devem ser positivos n�o nulos.");
		} else {
			this.raio = raio;
		}
	}
	
	public double getArea() {
		return this.raio * Math.PI;
	}
	
}