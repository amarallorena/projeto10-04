package estruturaCondicional;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Digite o número do dia da semana (1-7): ");
		numero = ler.nextInt ();

		if (numero ==1) {
			System.out.println("Hoje é domingo");
		}
		else if (numero ==2) {
			System.out.println("Hoje é segunda");	
		}
		else if (numero ==3) {
			System.out.println("Hoje é terça");
		}
		else if (numero ==4) {
			System.out.println("Hoje é quarta");
		}
		else if (numero ==5) {
			System.out.println("Hoje é quinta");
		}
		else if (numero ==6) {
			System.out.println("Hoje é sexta");
		}
		else if (numero ==7) {
			System.out.println("Hoje é sábado");
		}
		ler.close();

	}

}
