package Matrizes;
//6. Crie um programa onde o usuário define quantas linhas e colunas deve ter uma matriz, e 
//posteriormente imprima o total de elementos(posições) que está matriz tem
import java.util.Scanner;

public class EX5_define_linhas_colunas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("informe a quantidade de linhas da sua matriz");
		int l = in.nextInt();
		System.out.println("informe a quantidade de colunas da sua matriz");
		int c = in.nextInt();
		
		int[][] matriz = new int [l][c];
		
		System.out.println("A matriz tem o total de "+(l*c)+" elementos.");
		

	}

}
