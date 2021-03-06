package model;

public class Quadrado extends Retangulo {

	public Quadrado(double a) {
		super(a, a);
	}
	
	@Override
	public void setA(double a) {
		this.setA(a);
		this.setB(a);
	}

	@Override
	public void setB(double b) {
		this.setA(b);
		this.setB(b);
	}

	@Override
	public String toString() {
		return String.format(
				"Forma: lado = %.1f",
				this.getA()
			); 		
	}
	
	@Override
	public double calcularArea() {
		return Math.pow(this.getA(), 2);
	}
	
	@Override
	public double calcularPerimetro() {
		return 4 * this.getA();
	}
	
}
