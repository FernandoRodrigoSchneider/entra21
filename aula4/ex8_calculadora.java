package aula4;

import java.util.Scanner;

//8. Faça uma calculadora. 
//O usuário entra com dois números e depois com a operaçao desejada. 
//Caso o número da operação seja 1: some os dois números. 
//Caso seja 2: subtraia os dois números. 
//Caso seja 3: multiplique os dois números. 
//Caso seja 4: divida os dois números.
public class ex8_calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("digite dois valore e: A para somalos, B para subtrailos, C para multiplicalos"
				+ " e D para dividilos");
		double v1 = in.nextDouble();
		double v2 = in.nextDouble();
		String op = in.next();
		op = op.toLowerCase();

		if (op.equals("a")) {
			System.out.println(v1 + v2);
		} else if (op.equals("b")) {
			System.out.println(v1 - v2);
		} else if (op.equals("c")) {
			System.out.println(v1 * v2);
		} else if (op.equals("d")) {
			System.out.println(v1 / v2);
		}
		switch (op) {
		case "a":
			System.out.println(v1 + v2);
			break;
		case "b":
			System.out.println(v1 - v2);
			break;
		case "c":
			System.out.println(v1 * v2);
			break;
		case "d":
			System.out.println(v1 / v2);
			break;
		default:
		System.out.println("valor invalido");
			break;
		}
	}

}
