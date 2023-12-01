package Vetores;

import java.util.Scanner;

//9. Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. 
//Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. 
//Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela.
public class EX11_ler_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int tamanho = 3;
		int[] vetor1 = new int[tamanho];
		int[] vetor2 = new int[tamanho];
		int[] vetor3 = new int[tamanho];
		int soma = 0;
		
		vetor1[0] = 1;
		vetor1[1] = 2;
		vetor1[2] = 3;
		vetor2[0] = 1;
		vetor2[1] = 5;
		vetor2[2] = 6;

		//vetor3[0] = vetor1[0] + vetor2[0];
		//vetor3[1] = vetor1[1] + vetor2[1];
		//vetor3[2] = vetor1[2] + vetor2[2];
		
		for (int i = 0; i < vetor3.length; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
		}
		
		for (int i = 0; i < vetor3.length; i++) {
			System.out.println(vetor3[i]);
		}
	}

}
