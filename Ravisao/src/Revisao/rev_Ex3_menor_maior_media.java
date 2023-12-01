package Revisao;

import java.util.Scanner;

/*3. Descreva um algoritmo que leia vá lendo números inteiros até o usuário entrar com o número 0 
a) Qual é o menor valor? 
b) Qual é o maior valor? 
c) Qual é a média dos valores?*/
public class rev_Ex3_menor_maior_media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int numAux = 0;
		int menorV = Integer.MAX_VALUE;
		int maiorV = Integer.MIN_VALUE;
		int soma = 0;

		System.out.println("informe um valor inteiro ou digite 0 para sair");
		int num = in.nextInt();

		while (num != 0) {
			soma += num;
			numAux++;

			if (num < menorV) {
				menorV = num;
			}
			if (num > maiorV) {
				maiorV = num;
			}

			System.out.println("informe um novo valor inteiro ou digite 0 para sair");
			num = in.nextInt();
		}
		System.out.println("Para efeitos de caulculo, a soma foi " + soma + ", e a quantidade de numeros digitados foi " + numAux);
		System.out.println("Resposta a)Menor valor: " + menorV);
		System.out.println("Resposta b)Maior valor: " + maiorV);
		System.out.println("Resposta c)Média: " + soma / numAux);

	}

}
