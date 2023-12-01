package Array_list;

import java.util.ArrayList;
import java.util.List;

/*Faça um algoritmo que atribua valores à Array List de acordo com o quadrado do seu índice
Ex:
[0] = 0
[1] = 1
[2] = 4
[3] = 9
[4] = 16;*/
public class EX4_ {

	public static void main(String[] args) {

		
		
		List<Integer> listaNum = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			int num = i*i;
			listaNum.add(num);
			System.out.println("na posição "+i+" o numero vale "+num);

		}
		System.out.println(listaNum);
	}

}
