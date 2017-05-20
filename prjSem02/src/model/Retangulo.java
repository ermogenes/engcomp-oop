package model;

public class Retangulo extends Paralelogramo {
	
	public Retangulo(double a, double b) {
		super(a, b, Math.toRadians(90));
	}
	
	public double getB() {
		return this.getH();
	}
	
	public void setB(double b) {
		this.setH(b);
		this.setTheta(Math.toRadians(90));
	}

	@Override
	public void setTheta(double theta) {
		if (theta == Math.toRadians(90)) {
			this.setTheta(theta);
		} else {
			throw new UnsupportedOperationException("Ret�ngulos devem ter [theta = 90 graus]");
		}
	}
	
	@Override
	public String toString() {
		return String.format(
				"Forma: lado1 = %.1f; lado2 = %.1f",
				this.getA(),
				this.getB()
			); 
	}

	@Override
	public double calcularArea() {
		return this.getA() * this.getB();
	}
	
	@Override
	public double calcularPerimetro() {
		return 2 * (this.getA() + this.getB());
	}
	
}