package aula5_for;

import java.util.Scanner;

//1. Faça um programa, utilizando for, que permita o usuário fazer três contas de subtração.
public class ex6_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("digite a " + (i + 1) + "ª conta de subtração: digite o 1º valor e o segundo valor");
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			int sub = num1 - num2;

			System.out.println("o reultado é " + sub);

		}
	}

}
