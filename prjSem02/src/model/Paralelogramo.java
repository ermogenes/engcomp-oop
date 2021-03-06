package model;

public class Paralelogramo {
	
	private double a;
	private double h;
	private double theta;
	
	public Paralelogramo(double a, double h, double theta) {
		this.a = a;
		this.h = h;
		this.theta = theta;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getTheta() {
		return theta;
	}

	public void setTheta(double theta) {
		this.theta = theta;
	}
	
	public String toString() {
		return String.format(
				"Forma: base = %.1f; altura = %.1f; angulo = %.16f",
				this.getA(),
				this.getH(),
				this.getTheta()
			);
	}
	
	public double calcularArea() {
		return this.getA() * this.getH();
	}
	
	protected double calcularB() {
		return this.getH() / Math.cos(this.getTheta());  
	}
	
	public double calcularPerimetro() {
		return 2 * (this.getA() + calcularB());
	}
	
	public String getAngulo() {
		return String.format(
				"Angulo: %.16f radianos",
				this.getTheta()
			);
	}
}
