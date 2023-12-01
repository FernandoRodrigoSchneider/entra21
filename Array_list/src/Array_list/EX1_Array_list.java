package Array_list;

import java.util.ArrayList;
import java.util.List;

//Coloque 5 elementos em uma Array List e ordene-os
public class EX1_Array_list {

	public static void main(String[] args) {
		
		List<Integer> listaNum = new ArrayList<>();
		
		listaNum.add(1);
		listaNum.add(5);
		listaNum.add(4);
		listaNum.add(2);
		listaNum.add(3);
		listaNum.sort(null);
		
		for (int i = 0; i < listaNum.size(); i++) {
			System.out.println(listaNum.get(i));
		}
		

	}

}
