package Vetores;

import java.util.Scanner;

//6. Crie um array de elementos e depois peça ao usuário para informar um valor, 
//verifique se este valor está presente no array e printe o índice.
public class Ex8_vetores_verificar_valor_presente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int tamanhoVetor = 5;
		int[] vetor = new int[tamanhoVetor];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("informe o valor na posicao " + i);
			vetor[i] = in.nextInt();

		}
		System.out.println("digite um valor para ver se esta presente ");
		int valor = in.nextInt();
		boolean possui = false;
		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] == valor) {
				possui = true;
				System.out.println("o valor " + valor + " está dendro do vetor digitado no indice " + i);

			} //else {
				//System.out.println("o valor " + valor + " não consta no vetor digitado");
			//}

		}
		if(possui == false) {
			System.out.println("o valor " + valor + " não consta no vetor digitado");
		}
	}

}
