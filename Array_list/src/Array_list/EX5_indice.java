package Array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu
public class EX5_indice {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		List<Integer> listaNum = new ArrayList<>();
		
		listaNum.add(1);
		listaNum.add(5);
		listaNum.add(4);
		listaNum.add(2);
		listaNum.add(3);
		
		System.out.println("escolha um indice para zerar o valor");
		int num = in.nextInt();
		listaNum.add(num, 0);
		System.out.println(listaNum);
	}

}
