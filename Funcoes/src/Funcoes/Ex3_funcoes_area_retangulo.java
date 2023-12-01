package Funcoes;

import java.util.Scanner;

/*Faça um programa que calcule o perímetro e a área de um retângulo.
Retornar os valores calculados*/
public class Ex3_funcoes_area_retangulo {
	
	public static double result1 (double alt, double comp) {
		
		double area = alt * comp;
				
		return area;
	}
public static double result2 (double alt, double comp) {
		
		double perimetro = 2*(alt+comp);
		
		return perimetro;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("informe a altura e o comprimento do retangulo");
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		
		System.out.println(result1(num1, num2));
		System.out.println(result2(num1, num2));
		

	}

}
