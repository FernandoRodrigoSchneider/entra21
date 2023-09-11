package aula5_for;

import java.util.Scanner;

//3. Crie 4 variáveis fora do For onde define se é m(mulher) e h(homem) 
//e faça dois contador que verifique quantas mulheres e homens são
public class ex7_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("informe 4 valores, sendo M-mulher e H-homen");
		// String v1 = in.next();
		// String v2 = in.next();
		// String v3 = in.next();
		// String v4 = in.next();

		int contM = 0;
		int contH = 0;

		for (int i = 0; i < 4; i++) {
			String v1 = in.next();
			if (v1.equals("h")) {
				contH++;

			} else {
				contM++;
			}
		}
		System.out.println("mulheres " + contM + " e homens " + contH);
		/*
		 * String h = "", m = ""; int somaH = 0, somaM = 0; int n = 0;
		 * 
		 * for (int i = 0; i < n; i++) {
		 * System.out.println("digite se a pessoa é H-homen ou M-mulher"); //h += i; //m
		 * += i;
		 * 
		 * if ("h" += i ) { somaH += i } else {
		 * 
		 * } }
		 */
	}

}
