package Exercicio7;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex7_principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		List<Computador> ListaPC = new ArrayList<>();

		/*
		 * ListaPC.add(new Smartphone("001", 16, 120, 10, true)); ListaPC.add(new
		 * Notebook("002", 36, 1000, 2));
		 */
		Notebook pc1 = new Notebook("N001", 16, 500, 2);
		Smartphone sm1 = new Smartphone("S001", 8, 128, 15, false);

		System.out.println("em quanto voce quer aumentar a memoria ram");
		double aux1 = in.nextDouble();
		pc1.aumentarRam(aux1);
		System.out.println(pc1.getRam());

		System.out.println(pc1.onOff(false));
		System.out.println(pc1.onOff(true));

		System.out.println(pc1.rodarAplicacao("fffff.exe"));
		System.out.println(pc1.rodarAplicacao("fffff.xe"));
		
		System.out.println(sm1.rodarAplicacao("fffff.apk"));
		System.out.println(sm1.rodarAplicacao("fffff.exe"));
		
		System.out.println(sm1.tirarSelfie());
		
		System.out.println(sm1.ligar(15));
		System.out.println(sm1.ligar(20));

		



		// Notebook n1 = new Notebook(null, aux1, aux1, aux1);
		// n1.aumentarRam(aux1);

	}

}
