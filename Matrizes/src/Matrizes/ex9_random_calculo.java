package Matrizes;

import java.util.Random;

/*10. Crie em Java uma matriz 3x5 de inteiros, preencha a matriz utilizando Randon e depois: 
a) Informe quantas vezes a matriz repete o número 0; 
b) A quantidade de números pares; 
c) A quantidade de números ímpares*/
public class ex9_random_calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();

		int quantZero = 0;
		int numPar = 0;
		int numImpar = 0;
		int[][] matriz = new int[3][5];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = generator.nextInt(10);
				System.out.print(" " + matriz[i][j] + " ");
				if (matriz[i][j] == 0) {
					quantZero += 1;
				}
				if (matriz[i][j] % 2 == 0) {
					numPar += 1;
				}
				if (matriz[i][j] % 2 != 0) {// ou pode usar else
					numImpar += 1;// pode usar ++ no lugar do += 1
				}

			}
			System.out.println("\n");
		}
		System.out.println("A quantidade de zeros na matriz é " + quantZero);
		System.out.println("A quantidade de números pares é " + numPar);
		System.out.println("A quantidade de números impares é " + numImpar);

	}

}
