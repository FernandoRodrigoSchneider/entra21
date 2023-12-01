package Array_list;

import java.util.ArrayList;
import java.util.List;

//Crie uma Array List e imprima os últimos elementos por primeiro
public class EX2_Array_list {

	public static void main(String[] args) {

List<Integer> listaNum = new ArrayList<>();
		
		listaNum.add(1);
		listaNum.add(5);
		listaNum.add(4);
		listaNum.add(2);
		listaNum.add(3);
		
		for (int i = 4; i >= 0; i--) {
			System.out.println(listaNum.get(i));
		}
	}

}
