package prjSem05Ex01;

import java.util.Scanner;
import java.util.TreeSet;

public class Tokenizer {

	public static void main(String[] args) {
		String entrada;
		
		Scanner leitorConsole = new Scanner(System.in);
		
		entrada = leitorConsole.nextLine();
		leitorConsole.close();
		
		String[] tokens = entrada.split(" ");
		
		TreeSet<String> ts = new TreeSet<String>();
		
		for(int i = 0; i < tokens.length; i++){
			ts.add(tokens[i]);
		}
		
		for(String s : ts){
			System.out.print(String.format("(%s) ", s));
		}
		

	}

}
