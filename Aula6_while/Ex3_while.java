package Aula6_while;

import java.util.Scanner;

// 3. Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa digitar um número diferente, mostrar a mensagem 
//"entrada inválida" e solicitar o número novamente. Se digitar correto mostrar o número digitado.
public class Ex3_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("informe um valor entre 12 e 20;");
		int num = in.nextInt();
		
		while (num < 12 || num >  20) {
			System.out.println("numero invalido, informe um numero entre 12 e 20:");
			num = in.nextInt();
		}
		System.out.println(num + " fim");
	}

}
