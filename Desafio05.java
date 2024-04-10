package estruturaCondicional;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {

		//Variável

		Scanner ler = new Scanner(System.in);
		int senha, cpf, valor,saldoFinal, saldo =1000;

		System.out.println("Digite seu CPF: ");
		cpf = ler.nextInt();

		if ( cpf == 584999678 ){
			System.out.println("Informe sua senha: ");
			senha = ler.nextInt ();

			if (senha == 1012){
				System.out.println("Seu saldo é igual a R$: " + saldo);


				System.out.println("Informe o valor que deseja sacar:");
				valor =ler.nextInt();

				if (valor > saldo) {
					System.out.println("O saldo é insuficiente.");
				}

				else if (valor < saldo) {
					saldoFinal= saldo-valor;
					System.out.println("Saque autorizado. Seu saldo final é igual a R$: " +saldoFinal);
				}
			}

			else {
				System.out.println("Senha incorreta");
			}
		}
		else { 
			System.out.println("CPF incorreto");
			ler.close();
		}
	}

}
