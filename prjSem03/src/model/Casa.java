package model;

public class Casa implements EmissorCarbono {

	private int numMoradores;
	private double carbonoEmitidoPorPessoa;
	
	public Casa(int numMoradores, double carbonoEmitidoPorPessoa) {
		this.numMoradores = numMoradores;
		this.carbonoEmitidoPorPessoa = carbonoEmitidoPorPessoa;
	}

	public int getNumMoradores() {
		return numMoradores;
	}

	public void setNumMoradores(int numMoradores) {
		this.numMoradores = numMoradores;
	}

	public double getCarbonoEmitidoPorPessoa() {
		return carbonoEmitidoPorPessoa;
	}

	public void setCarbonoEmitidoPorPessoa(double carbonoEmitidoPorPessoa) {
		this.carbonoEmitidoPorPessoa = carbonoEmitidoPorPessoa;
	}

	@Override
	public double getCarbonoEmitido() {
		return this.carbonoEmitidoPorPessoa * this.numMoradores;
	}

	@Override
	public String toString(){
		return String.format(
				"Casa com %d moradores, emitindo %.2f por pessoa", 
				this.getNumMoradores(), this.getCarbonoEmitidoPorPessoa()
			);
	}

}
