package aula4;

import java.util.Scanner;

/*7. Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as três 
cartas deste usuário em uma mão de jogo de truco (1= AS; 2=2; 3=3; 7=7; 11=Valete; 
12= Dama; 13= Rei).O algoritmo deve imprimir na tela a palavra 
“TRUCO” (se APENAS UMA das três cartas for AS, 2 ou 3), “SEIS” (se APENAS DUAS 
das três cartas for AS, 2 ou 3) ou “NOVE” (se AS TRÊS cartas forem AS, 2 ou 3). Se 
não houver AS, 2 ou 3 nas três cartas, não é impresso nada*/
public class ex7_cartas_de_truco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("digite o primeiro valor entre 1, 2, 3, 7, 11, 12 e 13");
		int v1 = in.nextInt();
		System.out.println("digite o segundo valor entre 1, 2, 3, 7, 11, 12 e 13");
		int v2 = in.nextInt();
		System.out.println("digite o terceiro valor entre 1, 2, 3, 7, 11, 12 e 13");
		int v3 = in.nextInt();

		if ((v1 == 1 || v1 == 2 || v1 == 3) && (v2 == 1 || v2 == 2 || v2 == 3) &&
				(v3 == 1 || v3 == 2 || v3 == 3)) {
			System.out.println("nove");
		} else {
			if (((v1 == 1 || v1 == 2 || v1 == 3) && (v2 == 1 || v2 == 2 || v2 == 3))
					|| ((v1 == 1 || v1 == 2 || v1 == 3) && (v3 == 1 || v3 == 2 || v3 == 3))
					|| (v2 == 1 || v2 == 2 || v2 == 3) && (v3 == 1 || v3 == 2 || v3 == 3)) {
				System.out.println("seis");
			} else {
				if ((v1 == 1 || v1 == 2 || v1 == 3) || (v2 == 1 || v2 == 2 || v2 == 3)
						|| (v3 == 1 || v3 == 2 || v3 == 3)) {
					System.out.println("truco");

				} else {

				}

			}
		}
	}

}
