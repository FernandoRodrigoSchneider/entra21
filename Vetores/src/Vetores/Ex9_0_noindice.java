package Vetores;

import java.util.Scanner;

//7. Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu e por fim printe o vetor.
public class Ex9_0_noindice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int[] vetor = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 };
		System.out.println("informe um indice");
		int indice = in.nextInt();
		vetor[indice] = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
