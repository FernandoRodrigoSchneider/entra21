package Prova;

import java.util.Scanner;

public class questao4_fernando_rodrigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		/*
		 * Um aluno se vê com necessidade de ajuda na aula e logo tem a ideia de um
		 * algoritmo, pensando nisso, ele descreve como deve funcionar: o usuário
		 * seleciona a opção onde 1) Solicita 3 notas e calcula a média, 2) Retorna os
		 * dados do aluno em questão (informe seu nome e e-mail), 3) Solicita 5 valores,
		 * verifica e retorna qual é o maior e o menor. A opção 0 encerra o programa e
		 * qualquer outra é declarada como inválida, além disso, informe quantas vezes o
		 * usuário escolheu opções válidas antes de encerrar o programa e quantas
		 * inválidas.
		 * 
		 */

		// entrada
		System.out.println("Escolha uma opcao");
		int opcao = entrada.nextInt();
		// auxiliares
		int contValidas = 0;
		int contInvalidas = 0;
		
		while(opcao != 0) {
			switch (opcao) {
			case 1:
				contValidas++;
				double nota = 0;
				double soma = 0;
				// 1) Solicita 3 notas e calcula a média
				for (int i = 0; i < 3; i++) {
					System.out.println("Informe as notas");
					nota = entrada.nextDouble();
					soma = soma + nota;
				}
				System.out.println("A média é " + (soma / 3));

				break;
			case 2:
				contValidas++;
				// Retorna os dados do aluno em questão (informe seu nome e e-mail)
				System.out.println("Informe seu nome");
				String nome = entrada.next();
				System.out.println("Informe seu e-mail");
				String email = entrada.next();
				System.out.println("Nome: " + nome);
				System.out.println("Email: " + email);
				break;
			case 3:
				contValidas++;
				// Solicita 5 valores, verifica e retorna qual é o maior e o menor
				int maior = Integer.MIN_VALUE;
				int menor = Integer.MAX_VALUE;

				int valor = 0;
				for (int i = 0; i < 5; i++) {
					System.out.println("Informe um valor");
					valor = entrada.nextInt();

					if (valor > maior) {
						maior = valor;
					}
					if (valor < menor) {
						menor = valor;
					}
				}

				System.out.println("O menor valor é: " + menor);
				System.out.println("O maior valor é: " + maior);

				break;

			default:
				System.out.println("Inválido");
				contInvalidas++;
				break;
			}
			
			System.out.println("Escolha uma opcao");
			opcao = entrada.nextInt();
		}
		
		System.out.println("Opções inválidas " + contInvalidas);
		System.out.println("Opções válidas " + contValidas);

	}

}
