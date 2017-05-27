package model;

public class Bicicleta implements EmissorCarbono {

	private int nMarchas;
	
	public Bicicleta(int nMarchas) {
		this.nMarchas = nMarchas;
	}

	public int getnMarchas() {
		return nMarchas;
	}

	public void setnMarchas(int nMarchas) {
		this.nMarchas = nMarchas;
	}
	
	@Override
	public double getCarbonoEmitido() {
		return 0;
	}
	
	@Override
	public String toString(){
		return String.format("Bicicleta de %d marchas",  this.getnMarchas());
	}

}
