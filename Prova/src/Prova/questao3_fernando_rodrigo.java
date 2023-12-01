package Prova;

import java.util.Scanner;

public class questao3_fernando_rodrigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		double alt = 0;
		double soma = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("informe a altura da " + (i + 1) + "ª pessoa:");
			alt = in.nextDouble();
			soma += alt;

		}
		System.out.println("a media das alturas é " + (soma / 10));
	}

}
