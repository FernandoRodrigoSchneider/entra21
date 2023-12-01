package Prova_1_fernando_schneider;

import java.util.Scanner;

/*Questão 1)
Crie um programa para encontrar o maior número que pode ser criado reordenando o
vetor.
Por exemplo:
{1, 2, 3, 0, 4, 6}
Deverá ter a saída: 643210*/
public class Quetao_1_Fernando_Rodrigo_Schneider {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int [] vetor = new int [6];
		int [] vetorReor = new int [6];
		int maiorValor = Integer.MIN_VALUE;
		int menorValor = Integer.MAX_VALUE;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("informe o valor na posicao " + i);
			vetor[i] = in.nextInt();
			if (vetor[i] > maiorValor ) {
				maiorValor = vetorReor[i];
				System.out.println(vetor[i]);
				System.out.println(vetorReor[i]);
			}
			System.out.println();
	}
		
	}
}