package estruturaCondicional;

import java.util.Scanner;

public class Comaprandotexto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Variável
		String palavra1, palavra2;

		System.out.println("Informe a primeira palavra: ");

		palavra1 = ler.nextLine();

		System.out.println ("Informe a segunda palavra: ");
		palavra2 = ler.nextLine();


		if (palavra1.equals(palavra2)) {
			System.out.println("As palavras são identicas");
		}
		else {
			System.out.println("As palavras são diferentes");

		}
		ler.close();
	}
}
