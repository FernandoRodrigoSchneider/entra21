package Prova;

import java.util.Scanner;

public class questão1_fernando_rodrigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("informe um valor");
		double valor = in.nextDouble();

		System.out.println("digite 1-converter de dolar para real ou 2-converter real para dolar");
		int op = in.nextInt();
		if (op == 1) {
			System.out.println("o valor em dolar equivale a R$" + (valor / 4.97));
		} else if (op == 2) {
			System.out.println("o valor em reais equivale a $" + (valor * 4.97));
		} else {
			System.out.println("valor invalido");
		}

	}

}
