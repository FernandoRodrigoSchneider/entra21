package Vetores;

import java.util.Scanner;

public class Ex2_vetores_media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		double soma = 0;
		double[] nota = new double[3];

		for (int i = 0; i < 3; i++) {

			System.out.println("digite a " + (i + 1) + "ª nota;");

			nota[i] = in.nextDouble();

			soma += nota[i];

			System.out.println("as notas foram: " + (nota[i]));
		}

		System.out.println("amedia do aluno é: " + (soma / 3));
	}

}
