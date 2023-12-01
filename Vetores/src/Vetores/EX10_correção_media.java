package Vetores;

import java.util.Scanner;

//8. Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
//Imprima quais valores desses informados são maiores que a média dos valores.
public class EX10_correção_media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		float[] vetor = {1,2,3,4,5,6,7,8,9,10,11,12};
		float soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
			
			
		}
		float media = soma / vetor.length;
		
		String maiorQueMedia = "";
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > media) {
				maiorQueMedia += vetor[i] + ", ";
			}
			
	}
		System.out.println("A media: "+ media);
		System.out.println("Valores maior que a media são: "+maiorQueMedia);
	}
}
