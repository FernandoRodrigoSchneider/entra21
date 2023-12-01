package Revisao;
/*8. Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano. 

Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.*/
public class rev_Ex8_prospecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double altChico = 1.50;
		double altZe = 1.10;
		int anos = 0;
		do {
			altChico += 0.02;
			altZe += 0.03;
			anos ++;
			
		} while (altChico > altZe);

		System.out.println("a quantidade de anos é "+anos);
		System.out.println("atualmente chico mede "+altChico);
		System.out.println("atualmente Zé mede "+altZe);
	}

}
