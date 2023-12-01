package Vetores;

import java.util.Scanner;

//3. Faça um algoritmo em que quem preenche os valores do vetor é o usuário, por fim printe o vetor (vetor de 5 posições).
public class Ex5_vetores_preenchevalor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int tamanhoVetor = 5;
		String[] vetor = new String[tamanhoVetor];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("informe o valor na posicao " + i);
			vetor[i] = in.next();
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);

		}
		for (int i = (vetor.length - 1); i >= 0 ; i++) {
			System.out.println(vetor[i]);

		}
	}

}
