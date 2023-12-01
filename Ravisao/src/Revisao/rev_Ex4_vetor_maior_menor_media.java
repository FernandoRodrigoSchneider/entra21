package Revisao;

import java.util.Scanner;

//4. Crie uma array de 5 elementos e descubra: 
//a) Qual o maior elemento 
//b) Qual o menor elemento 
//c) A média dos elementos
public class rev_Ex4_vetor_maior_menor_media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		double menorV = Integer.MAX_VALUE;
		double maiorV = Integer.MIN_VALUE;
		double soma = 0;
		double[] valor = new double[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("digite o " + (i + 1) + "º valor;");
			valor[i] = in.nextDouble();
			soma += valor[i];
			if (valor[i] < menorV) {
				menorV = valor[i];
			}
			if (valor[i] > maiorV) {
				maiorV = valor[i];
			}
		}
		System.out.println("amedia dos vslores é: " + (soma / 5));
		System.out.println("maior: " + maiorV);
		System.out.println("menor: " + menorV);
	}
}
