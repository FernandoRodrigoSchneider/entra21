package Metodo;

import java.util.Scanner;

//Faça um código que recebe uma palavra do usuário, se essa palavra tem tamanho par, printe o primeiro caracter dessa palavra
//Caso ela tenha tamanho ímpar, printe o segundo caracter dessa palavra
public class EX7_tamnho_string {
	
	public static void result(int stringLenght, String palavra) {
		if (stringLenght %2 == 0) {
			System.out.println(palavra.charAt(0));
		} else {
			System.out.println(palavra.charAt(1));
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("digite uma palavra");
		String palavra = in.next();
		int stringLenght = palavra.length();
		//palavra.charAt(0);
		//System.out.println(palavra.charAt(0));
		//System.out.println(palavra + stringLenght);
		result(stringLenght, palavra);
	}

}
