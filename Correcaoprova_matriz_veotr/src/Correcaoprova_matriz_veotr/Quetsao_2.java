package Correcaoprova_matriz_veotr;

import java.util.Scanner;

public class Quetsao_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o tamanho do vetor: ");
		int tamanho = scanner.nextInt();

		int[] vetor = new int[tamanho];

		System.out.println("Informe os valores do vetor:");
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = scanner.nextInt();
		}

		scanner.close();

		int cont = 1;
		int maior = 1;
		int posicao = 0;

		for (int i = 0; i < tamanho - 1; i++) {
			if (vetor[i] + 1 == vetor[i + 1]) {
				cont++;
				if (cont > maior) {
					maior = cont;
					posicao = i + 1 - maior + 1;
				}
			} else {
				cont = 1;
			}
		}

		if (maior > 1) {
			System.out.print("Maior sequência encontrada: ");
			for (int i = posicao; i < posicao + maior; i++) {
				System.out.print(vetor[i] + " ");
			}
			System.out.println();
		} else {
			System.out.println("Não foi encontrada nenhuma sequência.");
		}
	}

}
