package Correcaoprova_matriz_veotr;

import java.util.Scanner;

public class questao2_corrigida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] vetor = new int[8];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("insira o valor do vetor");
			vetor[i] = in.nextInt();
		}
		int possivelInicio = 0;
		int inicioSequencia = 0;
		int tamanhoSequencia = 1;
		int tamanhoFinal = 1;
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] - 1 == vetor[i - 1]) {
				tamanhoSequencia++;
			} else {
				tamanhoSequencia = 1;
				possivelInicio = i;

			}
			if (tamanhoSequencia > tamanhoFinal) {
				tamanhoFinal = tamanhoSequencia;
				inicioSequencia = possivelInicio;
			}
		}
		for (int i = 0; i < tamanhoFinal; i++) {
			System.out.println(vetor[inicioSequencia + i]);

		}
	}
}
