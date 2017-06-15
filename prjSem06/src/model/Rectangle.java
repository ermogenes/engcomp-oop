package model;

public class Rectangle extends Shape {

	private double altura;
	private double largura;

	public Rectangle(double altura, double largura) {
		if (altura <=0 || largura <= 0) {
			throw new IllegalArgumentException("Os parâmetros devem ser positivos não nulos.");
		} else {
			this.altura = altura;
			this.largura = largura;
		}
	}
	
	public double getArea() {
		return this.altura * this.largura;
	}

}
