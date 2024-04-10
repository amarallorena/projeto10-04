package estruturaCondicional;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Informe o número: ");
		numero=ler.nextInt ();

		if (numero >0) {
			System.out.println ("O número é posirtivo.");
		}
		else if (numero < 0 ) {
			System.out.println ("O número é negativo.");
		}
		else if (numero == 0) {
			System.out.println ("O número é igual a zero");
		}
		ler.close();
	}

}
