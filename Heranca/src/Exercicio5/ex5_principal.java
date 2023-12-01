package Exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex5_principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Embarcacao> listaBarcos = new ArrayList<>();
		
		listaBarcos.add(new Transatlantico("T-001", "tur1", 1000, 5000, 200, 0, 100, 2010, 50));
		listaBarcos.add(new Lancha("L-002", "laz1", 5, 200, 50, 0, 150));
		
		System.out.println("informe o tempo de viagem em horas:");
		double aux1 = in.nextDouble();
		
		for (Embarcacao i : listaBarcos) {
			//i.planejarViagem(aux1);
			System.out.println(i.planejarViagem(aux1));
		}
		
		//listaBarcos.get(0).planejarViagem(aux1);
		//System.out.println(listaBarcos.get(0).planejarViagem(aux1));
		
	}

}
