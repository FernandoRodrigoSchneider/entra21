package Array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Faça um algoritmo em que o usuário insere um número em um índice específico que ele mesmo informou
public class EX6_numero_indice {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);

		List<Integer> listaNum = new ArrayList<>();
		
		listaNum.add(1);
		listaNum.add(5);
		listaNum.add(4);
		listaNum.add(2);
		listaNum.add(3);
		
		System.out.println("escolha um indice");
		int num = in.nextInt();
		System.out.println("escolha um número para este indice");
		int num1 = in.nextInt();
		listaNum.remove(num);
		listaNum.add(num, num1);
		System.out.println(listaNum);
	}

}
