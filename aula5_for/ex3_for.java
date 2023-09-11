package aula5_for;

import java.util.Scanner;

public class ex3_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//7. Descreva um algoritmo que leia 5 números inteiros e escreva, para cada 
		// número lido, se o mesmo é par ou ímpar.
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("digite o " + (i + 1) + "º numero inteiros:");
			int num = in.nextInt();
			if (num % 2 == 0) {
				System.out.println(num + " é par");
			} else {
				System.out.println(num + " é impar");

			}

		}

	}
}
