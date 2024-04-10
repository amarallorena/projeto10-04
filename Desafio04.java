package estruturaCondicional;

import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {
		//Variável

		Scanner ler = new Scanner(System.in);
		int a, b, c;

		System.out.println("Informe o primeiro valor: ");
		a = ler.nextInt();

		System.out.println("Informe o segundo valor: ");
		b = ler.nextInt();

		System.out.println("Informe o terceiro valor: ");
		c = ler.nextInt();

		if (a== b && a == c) {
			System.out.println("O triângulo é classificado como equilátero.");
		}
		else if (a ==b && a != c) {
			System.out.println("O triângulo é classificado como isóceles.");
		}
		else if ( a != b && a != c);
		else {
			System.out.println("Informação não encontrada.");
		}
		ler.close();
	}

}
