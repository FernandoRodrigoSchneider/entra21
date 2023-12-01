package Correcaoprova_matriz_veotr;

import java.util.Scanner;

public class questao1_corrigida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [] vetor = new int [6];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("insira o valor do vetor");
			vetor[i] = in.nextInt();
		}
		String resultado = "";
		
		for (int i = 0; i < vetor.length; i++) {
			int maiorValor = Integer.MIN_VALUE;
			int indiceMaior = 0;
			
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[j] > maiorValor) {
					maiorValor = vetor[j];
					indiceMaior = j;
				}
			}
			resultado += maiorValor + "";
			vetor[indiceMaior] = -1;
		}
		System.out.println(resultado);
	}

}
