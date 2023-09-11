package aula4;

import java.text.DecimalFormat;
import java.util.Scanner;

//10. Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres 
//(considere que a idade entre homens e mulheres sempre serão 
//diferentes). Calcule e escreva a soma das idades do homem mais velho 
//com a mulher mais nova, e o produto das idades 
//do homem mais novo com a mulher mais velha.
public class ex10_idade_dois_ho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("digite a idade de dois homens e duas mulheres");
		int h1 = in.nextInt();
		int h2 = in.nextInt();
		int m1 = in.nextInt();
		int m2 = in.nextInt();
		double varAux1 = 0;
		double varAux2 = 0;

		if (h1 > h2 && m1 > m2) {
			varAux1 = (h1 + m2);
			varAux2 = (h2 * m1);
			// int hv = h1;
			// int mv = m1;
			// System.out.println("a soma das idades do homen mais velho com a mulher mais
			// nova é " + (h1 + m2)
			// + "e a divisão da idade do homen mais novo com a mulher mais velha é " + (h2
			// / m1));
		} else if (h1 < h2 && m1 < m2) {
			varAux1 = (h2 + m1);
			varAux2 = (h1 * m2);
			// int hv = h1;
			// int mv = m1;
			// System.out.println("a soma das idades do homen mais velho com a mulher mais
			// nova é " + (h2 + m1)
			// + "e a divisão da idade do homen mais novo com a mulher mais velha é " + (h1
			// / m2));

		} else if (h1 > h2 && m1 < m2) {
			varAux1 = (h1 + m1);
			varAux2 = (h2 * m2);
			// System.out.println("a soma das idades do homen mais velho com a mulher mais
			// nova é " + (h1 + m1)
			// + "e a divisão da idade do homen mais novo com a mulher mais velha é " + (h2
			// / m2));
		} else if (h1 < h2 && m1 > m2) {
			varAux1 = (h2 + m2);
			varAux2 = (h1 * m1);
			// System.out.println("a soma das idades do homen mais velho com a mulher mais
			// nova é " + (h2 + m2)
			// + "e a divisão da idade do homen mais novo com a mulher mais velha é " + (h1
			// / m1));
		}
		System.out.println("a soma das idades do homen mais velho com a mulher mais nova é " + varAux1
				+ " e a divisão da idade do homen mais novo com a mulher mais velha é " + varAux2);
	}
}
