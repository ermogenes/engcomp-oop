package S01;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString(){
		return Integer.toString(this.dia)
				+ "/" 
				+ Integer.toString(mes)
				+ "/" 
				+ Integer.toString(ano);
	}
	
	public void trocarCom(Data data){
		int tempDia = data.getDia();
		int tempMes = data.getMes();
		int tempAno = data.getAno();

		data.setDia(this.dia);
		data.setMes(this.mes);
		data.setAno(this.ano);

		this.dia = tempDia;
		this.mes = tempMes;
		this.ano = tempAno;
	}
	
}
