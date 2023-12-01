package Vetores;

import java.util.Scanner;

/*4. Crie uma array de 5 elementos e descubra: 
a) Qual o maior elemento 
b) Qual o menor elemento 
c) A média dos elementos*/
public class Ex6_vetores_maiormenormedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int soma = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int tamanhoVetor = 5;
		int[] vetor = new int[tamanhoVetor];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("informe o valor na posicao " + i);
			vetor[i] = in.nextInt();
			soma += vetor[i];
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		System.out.println("maior é " + maior);
		System.out.println("menor é " + menor);
		System.out.println("media é " + (soma / vetor.length));

		// for (int i = 0; i < vetor.length; i++) {
		// System.out.println(vetor[i]);
//
		// }

	}

}
