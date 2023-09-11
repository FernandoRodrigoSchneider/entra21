package Aula6_while;

import java.util.Scanner;

//1. Escreva um algoritmo que leia um número do teclado até que encontre um número menor ou igual a 1.
public class Ex1_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		/*
		 * int num = 0;
		 * 
		 * while (num <= 1000) { System.out.println(""); num ++; }
		 */

		System.out.println("informe um numero inteiro:");
		int num = in.nextInt();
		while (num > 1) {
			System.out.println("informe um numero inteiro:");
			num = in.nextInt();
		}
		System.out.println("fim");
	}

}
