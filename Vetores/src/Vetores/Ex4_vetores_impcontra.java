package Vetores;

import java.util.Scanner;

//2. Crie uma array de 5 elementos e no momento de imprimir, comece pelo último elemento até o primeiro elemento.
public class Ex4_vetores_impcontra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int[] vetor = new int[5];
		
		vetor[0] = 1;
		vetor[1] = 2;
		vetor[2] = 3;
		vetor[3] = 4;
		vetor[4] = 5;

		for (int i = 4 ; i >= 0; i--) {
			System.out.println(vetor[i]);

		}
	}

}
