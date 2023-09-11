package Aula6_while;

import java.util.Scanner;

//2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e 
//voltando a pedir as informações, caso seja certo, de os parabéns e encerre o programa.
public class Ex8_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("digite seu nome:");
		String nome = in.next();
		System.out.println("digite sua senha:");
		String senha = in.next();

		while (nome.equalsIgnoreCase(senha)) {
			System.out.println("a senha não pode ser seu nome");
			System.out.println("por favor, digite outra senha:");
			senha = in.next();

		}
		if (senha != nome) {
			System.out.println("parabens, senha cadastrada com sucesso");
		} /*else {
			System.out.println("reinicie o processo");
			System.out.println("digite seu nome:");
			nome = in.next();
			System.out.println("digite sua senha:");
			senha = in.next();
		}*/

	}

}
