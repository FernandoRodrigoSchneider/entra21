package classes_e_objetos;

import java.util.Scanner;

public class EX4_classes_objetos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
				
		for (int i = 0; i < 5; i++) {
			ex4_circulo circulo = new ex4_circulo();// neste caso é necessário chamar a variavel dentro do for
			System.out.println("Digite o raio do circulo "+(i+1));
			circulo.raio = in.nextDouble(); 
			System.out.println("A area do circulo "+(i+1)+" é "+circulo.CalculaArea());
		}
	}

}
