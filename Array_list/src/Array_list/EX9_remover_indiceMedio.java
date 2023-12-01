package Array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Faça um algoritmo que remova o valor do meio da ArrayList.
Caso a array list tenha tamanho par, remova o valor da segunda metade.
Por exemplo:
Em uma ArrayList de tamanho 6, remova o valor no índice 4*/
public class EX9_remover_indiceMedio {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);

		List<Integer> listaNum = new ArrayList<>();
		
		listaNum.add(1);
		listaNum.add(6);
		listaNum.add(5);
		listaNum.add(4);
		listaNum.add(2);
		//listaNum.add(3);
		int num;
		System.out.println(listaNum);
		System.out.println(listaNum.size());
		
		//listaNum.size();
		if (listaNum.size() %2 == 0) {
			num = (listaNum.size() / 2);
			listaNum.remove(num);
		}else {
			num = ((listaNum.size() +1)/ 2);
			listaNum.remove(num-1);
		}
		
		
		
		System.out.println(listaNum);
		System.out.println(listaNum.size());
	}

}
