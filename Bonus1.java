package estruturaCondicional;

import java.util.Scanner;

public class Bonus1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anos;

		System.out.println("Informe a quantos anos você está na empresa");
		anos = ler.nextInt();

		String msg = (anos >= 4)? "Você receberá 7% de bônus." : "Você receberá 5% de bônus.";
		System.out.println(msg);
		ler.close();
	}

}
