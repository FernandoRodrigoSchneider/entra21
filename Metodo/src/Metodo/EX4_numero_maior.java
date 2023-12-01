package Metodo;

import java.util.Scanner;

/*Faça um programa que receba 2 números do usuário.
Faça um método que descubra qual dos números é maior
Se os dois números forem iguais, informe: número iguais*/
public class EX4_numero_maior {

	public static void resultado(double maiorNum, Boolean iguais) {

		if (iguais) {
			System.out.println("os numeros são iguais");
		} else {
			System.out.println(maiorNum + " é o maior numero");
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("informe dois valores:");
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		double maiorNum = 0;
		Boolean iguais = false;

		if (num1 > num2) {
			maiorNum = num1;
		} else if (num1 < num2) {
			maiorNum = num2;
		} else {
			maiorNum = num1;
			iguais = true;
		}
		resultado(maiorNum, iguais);

	}

}
