package aula5_for;

import java.util.Scanner;

//2. Faça um programa, utilizando for, que peça para o usuário inserir um número N e mostre na tela todos os números ímpares até N
public class ex5_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("informe um número:");
		int num = in.nextInt();

		for (int i = 0; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}//ou
			for (int j = 1; j <= num; j += 2) {
				System.out.println(j);
				}
		
	}
	}
}
