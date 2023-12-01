package Matrizes;

import java.util.Scanner;

//usuario informa a matriz
public class Apr_usuario_informa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("informe a quantidade de linhas da sua matriz");
		int l = in.nextInt();
		System.out.println("informe a quantidade de colunas da sua matriz");
		int c = in.nextInt();
		
		int[][] matriz = new int [l][c];
		
		for (int i = 0; i < matriz[l].length; i++) {
			for (int j = 0; j < matriz[c].length; j++) {
				System.out.println("informe o valor da linha "+i+" na coluna "+j);
				int[][] matriz = in.nextInt[i][j];
			}
		}
		
	}

}
