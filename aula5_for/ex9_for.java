package aula5_for;

import java.util.Scanner;

//5. Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.
public class ex9_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("informe um numero inteiro entre 1 e 10;");
		int num = in.nextInt();
		int aux = 0;
		int op = 0;
		
		
		for (int i = 0; i < 10; i++) {
			if (num < 1 || num > 10) {
				System.out.println("o numero esta errado");
			} else {
				
				aux = i + 1;
				op = num * aux;

			}
			System.out.println(op);
		}
	}

}
