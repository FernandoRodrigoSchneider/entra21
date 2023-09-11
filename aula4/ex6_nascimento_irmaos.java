package aula4;

import java.util.Scanner;

//6. Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, 
//escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. 
//Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro 
//diferente dos demais, e apenas irmãos se todas as idades forem 
//diferentes.
public class ex6_nascimento_irmaos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("digite e idade da primeira pessoa:");
		int id1 = in.nextInt();
		System.out.println("digite e idade da segunda pessoa:");
		int id2 = in.nextInt();
		System.out.println("digite e idade da terceira pessoa:");
		int id3 = in.nextInt();

		if (id1 != id2 && id1 != id3 && id2 != id3) {
			System.out.println("apenas irmaos");
		} else if (id1 == id2 && id1 == id3) {
			System.out.println("trigemeos");
		} else if (id1 != id2 && id1 == id3) {
			System.out.println("primeira e terceira pessoa são gemeos");
		} else if (id1 != id3 && id1 == id2) {
			System.out.println("primeira e seguna pessoa são gemeos");
		} else {
			System.out.println("segunda e terceira pessoa são gemeos");
		}
	}

}
