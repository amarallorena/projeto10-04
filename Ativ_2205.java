package estruturaCondicional;

import java.util.Scanner;

public class Ativ_2205 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int soma=0;
		int a[]= new int[5];

		for(int i=0;i<=4;i++) {
			System.out.println("Digite um valor:");
			a[i] = ler.nextInt();

			soma = soma + a[i];
		}
		if(soma>30) {
			System.out.println("O valor é maior que 30, a soma é igual à: " + soma);
		}
		else {
			System.out.println("O valor é menor que 30, a soma é igual à: " + soma);
		}

		ler.close();
	}
}
