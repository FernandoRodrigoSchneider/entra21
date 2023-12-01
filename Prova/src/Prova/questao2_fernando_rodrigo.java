package Prova;

import java.util.Scanner;

public class questao2_fernando_rodrigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("informe 3 medidas dos lados do triangulo:");
		double med1 = in.nextDouble();
		double med2 = in.nextDouble();
		double med3 = in.nextDouble();

		if (med1 == med2 && med1 == med3) {
			System.out.println("Este triangulo é equilatero");
		} else if (med1 == med2 || med1 == med3 || med2 == med3) {
			System.out.println("Este triangulo é escaleno");//correto é isoscele
		} else {
			System.out.println("Este triangulo é isoscele");//correto é escaleno

		}

	}

}
