package Funcoes;

import java.util.Scanner;

/*Faça um programa que diz se um número inserido está dentro de um limite imposto pelo usuário
Por exemplo:
Usuário inseriu o limite máximo como 100.
Usuário inseriu o limite mínimo como 70.
Depois ele inseriu o número 80.
A saída deve ser: 80 está nos limites impostos.*/
public class Ex1_funcoes {
	



	public static String limite(int limiteInf, int limiteSup, int num ) {
		String positivo = "está dentro dos limites";
		String negativo = "não esta dentro dos limites";

		if (num < limiteSup && num > limiteInf) {
			return positivo;
		} else {
			return negativo;
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Informe limite minimo");
		int limiteInf = in.nextInt();
		System.out.println("Informe limite maximo");
		int limiteSup = in.nextInt();
		System.out.println("Informe o numero a ser comparado");
		int num = in.nextInt();
		
		System.out.println(num + " " + limite(limiteInf, limiteSup, num));

	}

}
