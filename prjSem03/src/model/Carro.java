package model;

public class Carro implements EmissorCarbono {
	
	private int cc;

	public Carro(int cc) {
		this.cc = cc;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	@Override
	public double getCarbonoEmitido() {
		if (this.cc <= 0){
			return 0;
		} else if (this.cc <= 2000) {
			return this.cc * 0.8;
		} else {
			return this.cc * 1.5;
		}
	}

	@Override
	public String toString(){
		return String.format("Carro de %d cilindradas",  this.getCc());
	}

}
