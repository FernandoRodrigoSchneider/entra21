package Aula6_while;

import java.util.Scanner;

//2. Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.
public class Ex2_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int aux = 0;
		// int soma = 0;

		System.out.println("informe um numero inteiro:");
		int num = in.nextInt();
		while (num != 0) {
			//if (num != 0) {
				aux += num;
				System.out.println("informe um numero inteiro:");
				num = in.nextInt();
			//}

		}
		System.out.println("a soma dos numeros digitados é " + aux + ", fim");
	}

}
