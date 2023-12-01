package Metodo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EX5_retangulo {

public static void result(double alt, double larg) {
		DecimalFormat fmt = new DecimalFormat("0,00");
		System.out.println("o perimetro do retangulo é "+fmt.format((alt*2)+(larg*2)));
		System.out.println("A área do retangulo é "+fmt.format(alt*larg));
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("informe os 2 valores dos lados de um retangulo");
		double alt = in.nextDouble();
		double larg = in.nextDouble();
		
		result(alt , larg);
		
		

	}

}
