package Revisao;

import java.text.DecimalFormat;
import java.util.Scanner;

//6. Descreva um algoritmo que leia 12 valores decimais e os coloque em um vetor de 12 posições. 
//Em seguida, modifique o vetor de modo que os valores das POSIÇÕES ímpares sejam aumentados em 5% e os das posições pares sejam aumentados em 2%. 
//Imprima o vetor resultante
public class rev_Ex6_Vetor_impar_par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.00");

		System.out.println("Informe o tamanho do vetor");
		int tamanho = in.nextInt();

		double[] vetor = new double[tamanho];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("informe o valor na posicao " + i);
			vetor[i] = in.nextDouble();
		}
		for (int i = 0; i < vetor.length; i++) {

			System.out.print(fmt.format(vetor[i]) + ", ");

		}
		System.out.println("\n");
		System.out.println("Vetor resultante: ");

		for (int i = 0; i < vetor.length; i++) {
			if (i % 2 == 0) {
				vetor[i] = vetor[i] + (vetor[i] * 0.02);//ou * 1.02

			} else {
				vetor[i] = vetor[i] + (vetor[i] * 0.05);

			}

			System.out.print(fmt.format(vetor[i]) + ", ");

		}
	}
}
