package estruturaCondicional;

import java.util.Scanner;

public class ativ2703_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in) ;
		int mes;

		System.out.println("Informe o mês com o uso de algarismos (1-12): ");
		mes = ler.nextInt();

		if (mes ==1) {
			System.out.println("Estamos no mês de janeiro");
		}
		else if (mes==2) {
			System.out.println("Estamos no mês de Fevereiro");
		}
		else if (mes==3) {
			System.out.println("Estamos no mês de Março");
		}
		else if (mes==4) {
			System.out.println("Estamos no mês de Abril");
		}
		else if (mes==5) {
			System.out.println("Estamos no mês de Maio");
		}
		else if (mes==6) {
			System.out.println("Estamos no mês de Junho");
		}
		else if (mes==7) {
			System.out.println("Estamos no mês de Julho");
		}
		else if (mes==8) {
			System.out.println("Estamos no mês de Agosto");
		}
		else if (mes==9) {
			System.out.println("Estamos no mês de Setembro");
		}
		else if (mes==10) {
			System.out.println("Estamos no mês de Outubro");
		}
		else if (mes==11) {
			System.out.println("Estamos no mês de Novembro");
		}
		else if (mes==12) {
			System.out.println("Estamos no mês de Dezembro");
		}
			else {
				System.out.println("O mês informado é inválido");
		}
		ler.close();
	}

}
