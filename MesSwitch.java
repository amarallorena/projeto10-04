package estruturaCondicional;

import java.util.Scanner;

public class MesSwitch {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in) ;
		int mes;

		System.out.println("Informe o mês com o uso de algarismos: ");
		mes = ler.nextInt();

		switch (mes){
		case 1:
			System.out.println("O mês é Janeiro");
			break;

		case 2:
			System.out.println("O mês é Fevereiro");
			break;

		case 3:
			System.out.println("O mês é Março");
			break;

		case 4:
			System.out.println("O mês é Abril");
			break;

		case 5:
			System.out.println("O mês é Maio");
			break;

		case 6:
			System.out.println("O mês é Junho");
			break;

		case 7:
			System.out.println("O mês é Julho");
			break;

		case 8:
			System.out.println("O mês é Agosto");
			break;

		case 9:
			System.out.println("O mês é Setembro");
			break;

		case 10:
			System.out.println("O mês é Outubro");
			break;

		case 11:
			System.out.println("O mês é Novembro");
			break;

		case 12:
			System.out.println("O mês é Dezembro");
			break;

		default:
			System.out.println("Mês não encontrado, digite um número de 1 à 12");
			ler.close();
		}

	}

}
