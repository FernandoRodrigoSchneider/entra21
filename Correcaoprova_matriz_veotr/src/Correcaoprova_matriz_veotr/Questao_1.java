package Correcaoprova_matriz_veotr;

public class Questao_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetor = { 4, 9, 6, 3, 2, 1, 4 };
		int[] vetorOrdenado = new int[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			vetorOrdenado[i] = vetor[i];
			for (int j = 1; j < vetor.length; j++) {
				if (vetor[j] > vetorOrdenado[i]) {
					int temp = vetor[j];
					vetor[j] = vetorOrdenado[i];
					vetorOrdenado[i] = temp;

					// System.out.println(vetorOrdenado.length);

				} else {
					vetorOrdenado[j] = vetor[i];
				}
				// System.out.println(vetorOrdenado.length);
			}
			System.out.print(vetorOrdenado[i]);
		}

	}

}
