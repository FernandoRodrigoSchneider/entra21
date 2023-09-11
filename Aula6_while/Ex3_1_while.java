package Aula6_while;

//Conforme a questão 3, construa um contador que comece com 0 onde ele precisa chegar ao numero 10, para o contador contar precisa-se que o valor seja valido
import java.util.Scanner;

public class Ex3_1_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int aux = 0;

		System.out.println("informe um " + (aux + 1) + "º valor entre 12 e 20;");
		int num = in.nextInt();

		// if (num < 12 || num > 20) {
		// System.out.println("valor invalido, informe um " + (aux + 1) + "º valor entre
		// 12 e 20;");
		// num = in.nextInt();
		// } else {

		while ( aux < 9) {
			
			//System.out.println("informe um " + (aux + 1) + "º valor entre 12 e 20;");
			//num = in.nextInt();
			if (num < 12 || num > 20) {
				//System.out.println("valor invalido, informe um " + (aux + 1) + "º valor entre 12 e 20;");
				//num = in.nextInt();
			}else {
				aux += 1;
			}
			System.out.println("informe um " + (aux + 1) + "º valor entre 12 e 20;");
			num = in.nextInt();

		}
		System.out.println(num + " fim " + aux);
	}

}
