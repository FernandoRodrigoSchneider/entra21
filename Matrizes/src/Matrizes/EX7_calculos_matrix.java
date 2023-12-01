package Matrizes;

import java.util.Scanner;

/*8. Dada a seguinte matriz, calcule: 
1	2	3	4 

5	6	7	8 

9	10	11	12 

13	14	15	16 
a) A soma dos elementos de primeira coluna; 
b) O produto dos elementos da primeira linha; 
c) A soma de todos os elementos; 
d) O produto da diagonal principal.*/
public class EX7_calculos_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int soma1 = 0;
		int produtoLinha0 = 1;
		int somaMatriz = 0;
		int produtoDiagonalP = 1;

		int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 0 ) {
					soma1 += matriz[i][j];
				}
				if (i == 0) {
					produtoLinha0 *= matriz[i][j]; 
				}
				if (i < 4) {
					somaMatriz += matriz[i][j]; 
				}
				if (i == j) {
					produtoDiagonalP *= matriz[i][j]; 
				}
				
				System.out.print(" "+matriz[i][j]+" ");
			}
			System.out.println("\n");
		}
		System.out.println("soma da primeira coluna é : "+soma1);
		System.out.println("produto da primeira linha é : "+produtoLinha0);
		System.out.println("soma dos elementos da matriz é: "+somaMatriz);
		System.out.println("o produto da diagonal principal é: "+produtoDiagonalP);

	}

}
