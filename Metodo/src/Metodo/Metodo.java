package Metodo;

public class Metodo {

	public static void main(String[] args) {
		String nome = "Fernando";
		printNome(nome);
		media();
	}

	public static void printNome(String nome) {
		System.out.println("Olá, meu primeiro nome é " + nome);
		System.out.println("Meu sobrenome é Schneider");

	}

	public static void media() {
		int num1 = 5;
		int num2 = 10;
		double media = (num1 + num2) / 2;
		System.out.println(media);
	}

}
