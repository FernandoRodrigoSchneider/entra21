package Funcoes;

public class funcao {
	
	public static String imprimirNome() {
		//dentro do escopo pasa a ter retorno
		//sempre crie uma variavel
		String nome = "Fernando";
		return nome;
	}
	public static double soma(double numUm, double numDois) {
		//fiz o processo, ou ,elhor, a função
		double soma = numUm + numDois;
		return soma;
	}

	public static void main(String[] args) {
		System.out.println(imprimirNome());
		
		System.out.println(soma(10.5, 25.5));
	}

}
