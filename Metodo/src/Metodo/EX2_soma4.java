package Metodo;

import java.util.Scanner;

//Faça um programa que some 4 números.
//passando esses 4 números como parâmetros para um método
public class EX2_soma4 {

	public static void resultado(int num1, int num2, int num3, int num4) {

		int soma = num1 + num2 + num3 + num4;

		System.out.println("soma: " + soma);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dado = 100;
		resultado(20, 10, 50, dado);
	}
}
