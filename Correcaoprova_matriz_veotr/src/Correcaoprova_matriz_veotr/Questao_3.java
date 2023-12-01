package Correcaoprova_matriz_veotr;

import java.util.Scanner;

public class Questao_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		

		double[][] matriz = {
				{ 22.1, 23.5, 24.0, 23.8, 22.6, 21.9, 21.7, 22.2, 23.0, 24.1, 24.5, 24.0, 24.3, 24.4, 24.0, 24.5, 24.1,
						24.4, 24.8, 24.5, 24.3, 24.7, 24.9, 23.8 },
				{ 21.8, 22.7, 23.2, 23.9, 23.7, 22.8, 22.5, 22.1, 22.9, 24.0, 24.6, 25.1, 26.2, 27.5, 28.1, 28.6, 29.2,
						29.5, 28.9, 27.6, 26.4, 25.8, 25.1, 24.0 },
				{ 20.7, 21.0, 21.5, 22.1, 22.5, 22.7, 22.9, 23.1, 23.5, 23.9, 24.2, 24.6, 25.0, 25.3, 25.6, 25.9, 26.2,
						26.5, 26.8, 27.1, 27.4, 27.7, 27.9, 27.8 },
				{ 20.2, 20.5, 21.0, 21.4, 21.8, 22.2, 22.5, 22.8, 23.1, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4,
						25.7, 26.0, 26.3, 26.6, 26.9, 27.1, 27.2 },
				{ 19.8, 20.0, 20.3, 20.7, 21.1, 21.4, 21.8, 22.1, 22.4, 22.7, 23.0, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8,
						25.1, 25.4, 25.7, 26.0, 26.2, 26.3, 26.5 },
				{ 19.5, 19.8, 20.1, 23.5, 23.9, 24.3, 24.7, 25.1, 25.5, 26.8, 27.1, 28.4, 28.7, 29.0, 28.3, 28.6, 28.9,
						29.2, 28.5, 28.8, 28.1, 27.3, 27.5, 26.7 },
				{ 19.2, 19.5, 19.9, 20.3, 20.7, 21.1, 21.5, 21.9, 22.3, 22.7, 23.1, 23.4, 23.7, 24.0, 24.3, 24.6, 24.9,
						25.2, 25.5, 25.8, 26.1, 26.3, 26.5, 26.7 } };

		System.out.println("informe o dia da semana");
		String dia = in.next();
		double soma = 0;
		switch (dia) {
		case "domingo":
			for (int i = 0; i < matriz[0].length; i++) {
				soma += matriz[0][i];
			}
			System.out.println(soma / 24);
			break;
		case "segunda":
			for (int i = 0; i < matriz[1].length; i++) {
				soma += matriz[1][i];
			}
			System.out.println(soma / 24);
			break;
		case "terca":
			for (int i = 0; i < matriz[2].length; i++) {
				soma += matriz[2][i];
			}
			System.out.println(soma / 24);
			break;
		case "quarta":
			for (int i = 0; i < matriz[3].length; i++) {
				soma += matriz[3][i];
			}
			System.out.println(soma / 24);
			break;
		case "quinta":
			for (int i = 0; i < matriz[4].length; i++) {
				soma += matriz[4][i];
			}
			System.out.println(soma / 24);
			break;
		case "sexta":
			for (int i = 0; i < matriz[5].length; i++) {
				soma += matriz[5][i];
			}
			System.out.println(soma / 24);
			break;
		case "sabado":
			for (int i = 0; i < matriz[6].length; i++) {
				soma += matriz[6][i];
			}
			System.out.println(soma / 24);
			break;

		default:
			break;
		}
		System.out.println("digite a hora para ver a media");
		int hora = in.nextInt();
		double somaHora = 0;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < hora; j++) {
				if (j == hora - 1) {
					somaHora += matriz[i][j];
				}
			}
		}
		System.out.println("A média da hora escolhida foi " + somaHora / 7);
		double maiorTemp = Integer.MIN_VALUE;
		int linha=0;
		int coluna=0;
		String diaSemana = "";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > maiorTemp) {
					maiorTemp = matriz[i][j];
					linha = i;
					coluna = j;
					if (linha == 0) {
						diaSemana = "domingo";
					}
					else if(linha == 1) {
						diaSemana = "segunda";
					}
					else if(linha == 2) {
						diaSemana = "terca";
					}
					else if(linha == 3) {
						diaSemana = "quarta";
					}
					else if(linha == 4) {
						diaSemana = "quinta";
					}
					else if(linha == 5) {
						diaSemana = "sexta";
					}
					else if(linha == 6) {
						diaSemana = "sabado";
					}
				}

			}

		}
		System.out.println("A maior temperatura foi de "+maiorTemp+" e aconteceu em uma "+diaSemana);
		System.out.println(linha +" "+coluna);
	}

}
