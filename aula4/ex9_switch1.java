package aula4;

/*9. Escreva um algoritmo em que o usuário entra com um número. 
Depois ele escolhe a operação que vai ser feita com esse número 
Caso ele escolha a operação 1 
Modifique a variável do número entrado e some 10 ao número original 
Caso ele escolha a operação 2 
Modifique a variável do número entrado e subtraia 10 do número original 
Caso ele escolha a operação 3 
Modifique a variável do número entrado e multiplique 10 ao número 
original 
Caso ele escolha a operação 4 
Modifique a variável do número entrado e divida 10 do número original*/
import java.util.Scanner;

public class ex9_switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// entrada
		System.out.println("digite um numero e escolha a operação a ser feita: A+, B-, C* e D/.");
		double valor = in.nextDouble();
		String op = in.next();
		double aux = 0;
		op = op.toLowerCase();
		boolean valida = true;

		// processo
		switch (op) {
		case "a":
			aux = valor + 10;
			break;

		case "b":
			aux = valor - 10;
			break;
		case "c":
			aux = valor * 10;
			break;
		case "d":
			aux = valor / 10;
			break;
		default:
			valida = false;
			System.out.println("VAlor invalido");
			break;

		}
		if (valida == true) {
			// saida
			System.out.println("o resultado é " + aux);
		}

	}

}
