package Array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Descreva um algoritmo que leia 5 valores decimais e os coloque em uma Array List.
Em seguida, modifique a Array List de modo que os valores das POSIÇÕES ímpares sejam aumentados em 5% e os das POSIÇÕES pares sejam aumentados em 2%.
Imprima a Array List resultante*/
public class EX7_impar_par {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);

		List<Double> listaNum = new ArrayList<>();
		List<Double> listaNumResult = new ArrayList<>();
	
		for (int i = 0; i < 5; i++) {
			System.out.println("informe um valor ");
			double num = in.nextInt();
			listaNum.add(num);
			if (i  %2 == 0 ) {
				num = (num * 1.02);
				listaNumResult.add(num);
			} else {
				num = (num * 1.05);
				listaNumResult.add(num);
			}
			
		}
		System.out.println(listaNum);
		System.out.println(listaNumResult);
	}

}
