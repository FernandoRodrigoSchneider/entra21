package Aula6_while;

/*Escreva um programa onde caso o usuário digite a letra 's' peça para informar um número e caso digite 'n' encerre o programa e por fim
a) escreva o menor valor  

b) escreva o maior valor*/
import java.util.Scanner;

public class Ex6_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("digite S para informar um número ou N para sair");
		char op = in.next().charAt(0);
		int num = 0;
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		System.out.println(menor);
		System.out.println(maior);

		while (op == 's') {
			System.out.println("informe um numero");
			num = in.nextInt();
			if (num < menor) {
				menor = num;
			}
			if (num > maior) {
				maior = num;
			}
			// op = 'n';
			System.out.println("digite S para informar um número ou N para sair");
			op = in.next().charAt(0);

			while (op != 's' && op != 'n') {
				System.out.println("valor invalido");
				System.out.println("informe de novo");
				op = in.next().charAt(0);
			}

		}

		System.out.println("menor " + menor);
		System.out.println("menor " + maior);

	}

}
