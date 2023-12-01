package Metodo;

import java.util.Scanner;

/*George Lucas utiliza  uma  fórmula  para  criar  os  nomes dos  personagens  em  suas  histórias  (Jar  Jar  Binks, ObiWan Kenobi, etc).
A fórmula, supostamente, é:
Seu primeiro nome na série Star Wars:
i.Pegue as três primeiras letras de seu sobrenome
ii.Adicione a ele as duas primeiras letras de seu nome
Seu sobrenome na série Star Wars:
i.Pegue as duas primeiras letras do sobrenome de solteira de sua mãe
ii.Adicione a ele as três primeiras letras do nome da cidade onde você nasceu
Crie um  método chamado generateStarWarsName que  gera  um  nome  completo  Star  Wars  conforme  descrito.
Printe o seu nome Star Wars
As entradas serão os nomes completos.*/
public class EX8_generateStarWarsName {

	public static void nameStarWar(String nome, String sobrenome, String nomeMae, String cidade) {
		int totalCharacters = 0;
		char l1 = ' ';
		char l2 = ' ';
		char l3 = ' ';
		char l4 = ' ';
		char l5 = ' ';
		char l6 = ' ';
		char l7 = ' ';
		char l8 = ' ';
		char l9 = ' ';
		char l10 = ' ';

		for (int i = 0; i < sobrenome.length(); i++) {
			l1 = sobrenome.charAt(0);
			l2 = sobrenome.charAt(1);
			l3 = sobrenome.charAt(2);
		}
		for (int i = 0; i < nome.length(); i++) {
			l4 = nome.charAt(0);
			l5 = nome.charAt(1);
		}

		for (int i = 0; i < nomeMae.length(); i++) {
			l6 = nomeMae.charAt(0);
			l7 = nomeMae.charAt(1);
		}
		for (int i = 0; i < cidade.length(); i++) {
			l8 = cidade.charAt(0);
			l9 = cidade.charAt(1);
			l10 = cidade.charAt(2);
		}
		System.out.print("O seu nome Star Wars é " + l1 + l2 + l3 + l4 + l5 + " " + l6 + l7 + l8 + l9 + l10);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("informe seu nome:");
		String nome = in.next();
		System.out.println("informe seu sobrenome:");
		String sobrenome = in.next();
		System.out.println("Informe o sobrenome de solteira da sua mãe:");
		String nomeMae = in.next();
		System.out.println("informe a cidade onde nasceu:");
		String cidade = in.next();

		nameStarWar(nome, sobrenome, nomeMae, cidade);

	}

}
/*
 * String exampleString = "This is just a sample string";
 * 
 * int totalCharacters = 0; char temp; for (int i = 0; i <
 * exampleString.length(); i++) {
 * 
 * temp = exampleString.charAt(i); if (temp == 'i') totalCharacters++; }
 * 
 * System.out.println("i appears " + totalCharacters +
 * " times in exampleString");
 */