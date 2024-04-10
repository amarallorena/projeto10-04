package estruturaCondicional;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		//Variaveis
		double primeira, segunda, terceira, quarta, media;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe sua primeira nota");
		primeira = ler.nextDouble();
		System.out.println("Informe sua segunda nota");
		segunda = ler.nextDouble();
		System.out.println ("Informe sua terceira nota");
		terceira = ler.nextDouble();
		System.out.println ("Informe sua quarta nota");
		quarta = ler.nextDouble();
		media = primeira + segunda + terceira + quarta;
		media/= 4;


		if (media >=6){
			System.out.println ("Aprovado " + media);
		}
		else {
			System.out.println ("Reprovado " + media);	
		}
		ler.close();
	}
}