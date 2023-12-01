package Matrizes;

//7. Crie uma matriz 3x3 do tipo, onde o usuário irá preencher os valores utilizando o scanner, ao fim imprima a matriz
import java.util.Scanner;

public class ex6_preencher_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("informe a quantidade de linhas da sua matriz");
		int linha = in.nextInt();
		System.out.println("informe a quantidade de colunas da sua matriz");
		int coluna = in.nextInt();

		int[][] matriz = new int[linha][coluna];

		for (int l = 0; l < linha; l++) {
			for (int c = 0; c < coluna; c++) {
				System.out.println("informe um valor para a matriz");
				int aux = in.nextInt();
				matriz[l][c] = aux;

			}
			// System.out.println();
		}
		for (int l = 0; l < linha; l++) {
			for (int c = 0; c < coluna; c++) {
				System.out.print(matriz[l][c]+" ");
			}
			System.out.println();
		}
	}

}
