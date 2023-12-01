package Vetores;

import java.util.Scanner;

/*5. Crie um array de 10 elementos e depois peça ao usuário para informar um índice, imprima o
 *  o valor que está no vetor conforme indice informado pelo usuario*/
public class Ex7_vetores_imprima_valorindice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int[] vetor = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 };
		System.out.println("informe um indice");
		int indice = in.nextInt();

		System.out.println(vetor[indice]);

		/*
		 * int tamanhoVetor = 10; int[] vetor = new int[tamanhoVetor];
		 * 
		 * for (int i = 0; i < vetor.length; i++) {
		 * System.out.println("informe o valor na posicao " + i); vetor[i] =
		 * in.nextInt();
		 * 
		 * } for (int i = 0; i < vetor.length; i++) { System.out.println(vetor[i]);
		 * 
		 * }
		 */
	}

}
