package estruturaCondicional;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Digite um número");
		numero = ler.nextInt();

		if (numero %2 == 0) {
			System.out.println("O número é par.");
		}
		else {
			System.out.println("O número é impar");
		}
		ler.close();
	}

}
