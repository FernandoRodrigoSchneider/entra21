package Array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Descreva um algoritmo que leia 6 valores reais e os coloque em uma Array List.
//Imprima quais valores desses informados são maiores que a média dos valores.
public class EX10_media {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<Integer> listaNum = new ArrayList<>();
		List<Integer> listaNum1 = new ArrayList<>();
		int num;
		int soma = 0;

		for (int i = 0; i < 6; i++) {
			System.out.println("informe o valor no indice " + i + ";");
			num = in.nextInt();
			listaNum.add(num);
			soma += num;
		}
		System.out.println(listaNum);
		double media = soma / listaNum.size();
		for (int i = 0; i < listaNum.size(); i++) {

			if (listaNum.get(i)> media) {
				listaNum1.add(listaNum.get(i));
			}
			
		}
		System.out.println(listaNum1);
	}

}
