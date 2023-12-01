package Metodo;

import java.util.Scanner;

//Faça um programa em que o usuário entre com um número de 1 a 4
//om o número 1 sendo verão, 2 sendo outono...
//Dependendo de o que o usuário informa, printe:
//É verão
//E o tempo está quente
//Ou
//É inverno
//E está frio
public class EX1_estacoes {

	public static void estacoes(String verao, String outono, String inverno, String primavera) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("informe uma estação:");
		String aux = in.next();
		if (aux.equals("verao")) {
			System.out.println(verao);
		}
		if (aux.equals("outono")) {
			System.out.println(outono);
		}
		if (aux.equals("inverno")) {
			System.out.println(inverno);
		}
		if (aux.equals("primavera")) {
			System.out.println(primavera);
		}
	}

	public static void main(String[] args) {

		estacoes("è verão, o tempo está mais quente"
				,"é outono, asfolhas estao caindo"
				,"è inverno, o frio tá pegando"
				,"è primavera, o frio passou" );

	}

}
