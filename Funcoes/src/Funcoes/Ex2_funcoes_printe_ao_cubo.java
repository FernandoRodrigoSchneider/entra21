package Funcoes;

import java.util.Scanner;

/*Faça um código que receba duas entradas do usuário
Printe cada entrada ao cubo se:
Algum dos dois números for 5
A soma deles é 5
A diferença deles é 5
Se nenhuma dessas condições forem satisfeitas, printe cada entrada ao quadrado*/
public class Ex2_funcoes_printe_ao_cubo {

	public static String retorno (int num1, int num2) {
		
		int soma = num1 + num2;
		int subt = num2 - num1;
		int num1result = 0;
		int num2result = 0;
		
		if (num1 == 5 || num2 == 5 || soma == 5 || subt == 5 || subt == -5) {
			num1result = (num1*num1*num1);
			num2result = (num2*num2*num2);
			String verdadeiro= "o cubo do 1º numero é "+num1result+" e o cubo do 2º numero é "+num2result;
			return verdadeiro;
		} else {
			num1result = (num1*num1);
			num2result = (num2*num2);
			String falso= "o quadrado do 1º numero é "+num1result+" e o quadrado do 2º numero é "+num2result;
			return falso;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("informe dois numeros inteiros");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		System.out.println(retorno(num1, num2));
		
		
	}

}
