package aula5_for;

import java.util.Scanner;

//4. Crie um programa para ler 3 notas e mostrar a 
//média delas.
public class ex8_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int nt = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("digite a "+ (i+1) + "ª nota;");
			double nota = in.nextDouble();
			nt +=  nota;
			
			
		}
		System.out.println("a media é " + (nt/3));
		
	}
	

}
