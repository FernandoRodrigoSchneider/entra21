package Vetores;

import java.util.Scanner;

public class Ex1_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		/*
		 * int[] idades = new int[4]; idades[0] = 18; idades[1] = 20; idades[2] = 30;
		 * idades[3] = 40;
		 * 
		 * System.out.println("Idades "+idades[0]);
		 */

		int[] idades = new int[5];
		idades[0] = 16;
		idades[1] = 17;
		idades[2] = 22;
		idades[3] = 28;
		idades[4] = 40;
		System.out.println("valor " + idades[4]);

		int aux = idades[0] + idades[1] + idades[2] + idades[3] + idades[4];

		System.out.println("soma das idades é " + aux + " e a media é " + (aux / 5));

		for (int i = 0; i < 5; i++) {

			System.out.println(idades[i]);

		}

		String[] nomes = new String[5];
		nomes[0] = "Nicole";
		nomes[1] = "Maria";
		nomes[2] = "Eduardo";
		nomes[3] = "Ana";
		nomes[4] = "Fernando";

		System.out.println("nome; " + nomes[0]);

		for (int i = 0; i < 5; i++) {
			System.out.println(nomes[i]);

		}

		String[] nome = new String[21];
		for (int i = 0; i < 21; i++) {
			nome[i] = in.next();

		}
		for (int i = 0; i < 21; i++) {
			System.out.println(nome[i]);
		}

	}
}
