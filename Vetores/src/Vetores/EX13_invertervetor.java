package Vetores;

import java.util.Scanner;

//9.	Faça um algoritmo que inverta a ordem de uma array
//(o primeiro elemento vai se tornar o último elemento)
public class EX13_invertervetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("informe o tamanho do vetor");
		int tamanho = in.nextInt();

		int indice = 0;

		int[] vetor = new int[tamanho];
		int[] vetorInv = new int[tamanho];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("informe o valor para o vetor na posição " + i);
			vetor[i] = in.nextInt();
			vetorInv[tamanho - i] = in.nextInt();
			// for (int j = 0; j < vetorInv.length; j++) {
			// indice = tamanho - i;
			// vetorInv[indice] = vetor[i];
		}
		for (int i = 0; i < vetorInv.length; i++) {
			System.out.println(vetor[i]);

			System.out.println(vetorInv[i]);

		}
	}
}
