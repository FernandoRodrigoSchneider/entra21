//PADRÃO DE CRIAÇÃO DE ARQUIVO - JAVA
//1 - package
package Metodo;
//2 - classe (nome do arquivo)
public class aula1_metodo {
	// 3 - sempre criar nossos metodos apos a classe
	public static void corFavorita() {
		// obrigatoriamente parenteses
		// possui escopo

		System.out.println("azul");
	}

	public static void nome() {
		System.out.println("Meu nome é Fernando, tenho 40 anos");
		System.out.println("minha cor favorita é Azul");

	}

	public static void conta() {
		int num1 = 10;
		int num2 = 100;
		System.out.println("a multiplicação é " + (num1 * num2));
		
	}
	public static void conta2() {
		int num1 = 10;
		int num2 = 100;
		System.out.println("a soma é " + (num1 + num2));

	}
	public static void mediaAltura() {
		double altFernando = 1.85;
		double altEduardo = 1.76;
		double altmaria = 1.55; 
		double altNicole = 1.68;
		double altsara = 1.65;
		System.out.println("a altura do fernando é "+ altFernando
					 +"\n"+"a altura do Eduardo é "+altEduardo
					 +"\n"+"a altura da Maria é "+altmaria
					 +"\n"+"a altura da Nicole é "+altNicole
					 +"\n"+"a altura da Sara é "+altsara );
		System.out.println("a média das alturas é " + (altEduardo+altFernando+altmaria+altNicole+altsara)/5);

	}
	public static void metodoComParametro(String nome) {
		System.out.println("meu nome: "+ nome);
		
	}
	public static void maisParametros(int idd1, int idd2, String texto) {
		System.out.println("a soma das idades: "+(idd1+idd2));
		System.out.println("e o texto: "+texto);
	}
	public static void soma(int num1, int num2) {

		System.out.println("a soma é " + (num1 + num2));

	}
	
	// 4 - cria o metodo main
	public static void main(String[] args) {
		// para chamar um metodo: vou escrever o nome dele
		// sem esquecer dos parenteses
		corFavorita();
		nome();
		conta();
		conta2();
		mediaAltura();
		String nome = "Fernando";
		metodoComParametro(nome);
		metodoComParametro("Fernando");
		maisParametros(15, 20, "oi");
		soma(10, 100);


		
	}

}
