package Vetores;

//1. Faça um algoritmo que atribua valores ao vetor de acordo com o quadrado do seu índice e printe o vetor. 
import java.util.Scanner;

public class ex3_vetores_quadradoindice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int tamanhoVetor = 10;
		int[] vetor = new int[tamanhoVetor];
		// vetor [0] = 0;
		// vetor [1] = 1;
		// vetor [2] = 4;
		// vetor [3] = 9;
		for (int i = 0; i < 10; i++) {
			vetor[i] = i * i;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(vetor[i]);

		}
	}

}
