package Array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Faça um algoritmo que descubra se uma Array List possui o número que o usuário entrou.
//Imprima também o seu índice
public class EX8_descobrir_valor {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);

		List<Integer> listaNum = new ArrayList<>();
		
		listaNum.add(1);
		listaNum.add(5);
		listaNum.add(4);
		listaNum.add(2);
		listaNum.add(3);
		
		System.out.println("digite o valor a ser verificado;");
		int num = in.nextInt();
		
		
		int indice = listaNum.indexOf(num);
		if (indice !=-1) {
			System.out.println("o numero "+num+" esta no vetor no indice "+listaNum.indexOf(num));
		}
	
		if (indice < 0) {
			System.out.println("o numero nao consta na lista");		}
	}

}
