package Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class ex4_principal {

	public static void main(String[] args) {

		
		List<Animal> listaAnimal = new ArrayList<>();
		
		listaAnimal.add(new Cachorro("cachorro", true, 20, "Pastor alemão") );
		listaAnimal.add(new Gato("Gato", true, 7, true) );
		
		for (Animal i : listaAnimal) {
			if (i.getEspecie().equals("cachorro")) {
				System.out.println(i.toString());
			}if (i.getEspecie().equals("Gato")) {
				System.out.println(i.toString());
			}
		}

	}

}
