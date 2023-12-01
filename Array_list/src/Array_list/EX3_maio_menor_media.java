package Array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Crie uma Array List
O usuário vai colocando valores decimais até ele colocar o número 0.
Calcular:
a) Qual o menor número
b) Qual o maior número
c) Calcular a média*/
public class EX3_maio_menor_media {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int maiorNum = Integer.MIN_VALUE;
		int menorNum = Integer.MAX_VALUE;
		int soma = 0;
		int num;

		List<Integer> listaNum = new ArrayList<>();
		System.out.println("informe um valor de 1 a 10 ou 0 para sair");
		num = in.nextInt();

		while (num != 0) {
			soma += num;

			listaNum.add(num);
			if (num > maiorNum) {
				maiorNum = num;
			}
			if (num < menorNum) {
				menorNum = num;
			}
			System.out.println("informe um valor de 1 a 10 ou 0 para sair");
			num = in.nextInt();
		}

		System.out.println("o maior numero é "+maiorNum);
		System.out.println("o menor numero é "+menorNum);
		System.out.println("A média dos numero digitados é "+soma / listaNum.size());

	}

}
