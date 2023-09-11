package Aula6_while;

import java.util.Scanner;

/*1. Faça uma calculadora. O usuário entra com dois números e depois com a operação desejada.  
Caso o número da operação seja 1: some os dois números.  
Caso seja 2: subtraia os dois números.  
Caso seja 3: multiplique os dois números.  
Caso seja 4: divida os dois números. 
Após realizada a operação, solicite ao usuário se deseja continuar realizando operações (sempre com dois novos valores) digite 
qualquer tecla e caso queira encerrar informe a letra ‘n’.*/
public class Ex7_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// System.out.println("digite dois valores e informe a operação: A+, B-, C* e
		// D/.");
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		String op = in.next();
		double resultado = 0;
		String rep = "";
		char controle = in.next().charAt(0);

		while (controle != 'n') {
			// System.out.println("informe a operação: A+, B-, C* e D/.");
			// op = in.next();
			System.out.println("digite dois valores e informe a operação: A+, B-, C* e D/.");
			num1 = in.nextDouble();
			num2 = in.nextDouble();
			op = in.next();
			switch (op) {
			case "a":
				resultado = num1 + num2;
				break;
			case "b":
				resultado = num1 - num2;
				break;
			case "c":
				resultado = num1 * num2;
				break;
			case "d":
				resultado = num1 / num2;
				break;

			default:
				System.out.println("operação não encontrada");
				break;

			}

			System.out.println("o resultado é " + resultado);
			System.out.println("digite n para sair ou qualquer tecla para continuar");
			controle = in.next().charAt(0);

		}

		/*
		 * System.out.println("operação não encontrada"); System.out.
		 * println("digite dois valores e informe a operação: A+, B-, C* e D/."); num1 =
		 * in.nextDouble(); num2 = in.nextDouble(); op = in.next();
		 */
	}

}
