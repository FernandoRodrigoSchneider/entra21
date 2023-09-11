package Aula6_while;

import java.util.Scanner;

/*Faça um programa que receba um nome de uma fruta como entrada. 
Faça vários cases para as frutas que você conhece. 
Por exemplo: 
Case "banana": Eu gosto dessa fruta 
Case "pera": Eu não gosto dessa fruta  
Caso o usuário entre um valor desconhecido, escreva: Eu não conheço essa fruta e encerre o programa*/
public class Ex5_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("informe a fruta");
		String fruta = in.next();

		while (fruta.equals(fruta)) {
			//System.out.println("informe a fruta");
			//fruta = in.next();
			switch (fruta) {
			case "banana":
				System.out.println("eu gosto desta fruta");
				break;
			case "pera":
				System.out.println("eu gosto desta fruta");
				break;
			case "uva":
				System.out.println("eu gosto desta fruta");
				break;
			case "morango":
				System.out.println("eu gosto desta fruta");
				break;

			default:
				System.out.println("eu não gosto desta fruta");
				break;
			}
			System.out.println("informe a fruta");
			fruta = in.next();
		}
		
	}

}
