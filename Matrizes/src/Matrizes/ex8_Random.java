package Matrizes;

import java.util.Random;

public class ex8_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();

		int[][] matriz = new int[7][8];

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 8; j++) {
				matriz[i][j] = generator.nextInt(100);
				System.out.print(" "+matriz[i][j]+" ");

			}
			System.out.println("\n");
		}
	}

}
