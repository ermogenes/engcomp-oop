package S01;

import S01.Data;

public class Main {

	public static void main(String[] args) {
		Data d1 = new Data(7, 4, 2017);
		Data d2 = new Data(15, 5, 2017);
		
		System.out.println(String.format("Data 1: %s", d1.toString()));
		System.out.println(String.format("Data 2: %s", d2.toString()));
		
		d1.trocarCom(d2);
		
		System.out.println(String.format("Após a troca"));
		
		System.out.println(String.format("Data 1: %s", d1.toString()));
		System.out.println(String.format("Data 2: %s", d2.toString()));
	}

}
