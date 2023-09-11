package aula4;

import java.util.Scanner;

//11. Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um 
//algoritmo para ler as idades dos filhos e exibir quem é o mais velho, o 
//irmão do meio e o caçula da família. Suponha que não haja empates.
public class ex11_posui_trs_filhos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("digite a idade de Marquinhos, Zezinho e luizinha:");
		int idMa = in.nextInt();
		int idZe = in.nextInt();
		int idLu = in.nextInt();
		String Mve = "";
		String Meio = "";
		String Mno = "";

		/*
		 * if (idMa > idZe && idMa > idLu && idZe > idLu ) { Mve = idMa; Meio = idZe;
		 * Mno = idLu;
		 * 
		 * } else if (idMa > idZe && idMa > idLu && idLu> idZe) { Mve = idMa; Meio =
		 * idLu; Mno = idZe;
		 * 
		 * } else if (idZe > idLu && idLu > idMa) { Mve = idZe; Meio = idLu; Mno = idMa;
		 * } else if (idZe > idLu && idMa > idLu) { Mve = idZe; Meio = idMa; Mno = idLu;
		 * } else {
		 * 
		 * }
		 */

		if (idMa > idZe && idMa > idLu) {
			Mve = "marquinhos";
			if (idZe > idLu) {
			Meio = "Zezinho";
			Mno = "Luluzinha";
		} else {
			Meio = "Luluzinha";
			Mno = "zezinho";
		}else if (idZe > idMa && idZe > idLu) {
			Mve = idZe;
			if (idMa > idLu)
				Meio = "marquinhos";
				Mno = "luluzinha";
		} else {
			Meio = "luluzinha";
			Mno = "Marquinhos";
		}
		
		System.out.println(
				"o irmão mais velho é " + Mve + ", o irmao do meio é " + Meio + " e o irmão mais novo é " + Mno);
	
	
		
	}
	}
