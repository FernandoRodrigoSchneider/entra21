package Aula6_while;

import java.util.Scanner;

//4. Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar com o número 0 
//Calcule a média de altura das mesmas.
public class Ex4_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int aux = 0;
		double soma = 0;

		System.out.println("informe a altura da " + (1 + aux) + "ª pessoa: para sair digite o numero 0");
		double alt = in.nextDouble();
		while (alt != 0) {
			//if (alt != 0) {
				aux += 1;
				soma += alt;
				System.out.println("informe a altura da " + (1 + aux) + "ª pessoa: para sair digite o numero 0");
				alt = in.nextDouble();
			//}

		}
		System.out.println("a media das alturas é " + (soma / aux) + ", vc digitou 0, fim do programa");
	}

}
