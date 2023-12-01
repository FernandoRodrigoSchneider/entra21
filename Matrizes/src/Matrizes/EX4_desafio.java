package Matrizes;

public class EX4_desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int linha = 4;
		int coluna = 4;

		char[][] matriz = new char[linha][coluna];
		System.out.println("questao A:");

		for (int l = 0; l < linha; l++) {
			for (int c = 0; c < coluna; c++) {
				System.out.print(matriz[l][c] + "*");
			}
			System.out.println();
		}
		System.out.println("questao B:");

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < linha; j++) {
				if (i == 0 || i == linha - 1 || j == 0 || j == linha - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				System.out.print(matriz[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("questao C:");

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < linha; j++) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				System.out.print(matriz[i][j]);
			}
			System.out.print("\n");
		}
	}
}
