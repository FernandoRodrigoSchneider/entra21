package aula5_for;
//8. Descreva um algoritmo que calcule e escreva a soma dos números 
//pares e a soma dos números ímpares entre 1 e 1000.
public class ex4_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int somaPar = 0, somaImpar = 0;
		
		for (int i = 0; i <=1000; i++) {
			if (i %2 == 0) {//verifica se é par
				somaPar += i;
			} else {
				somaImpar += i;
			}
		}
		System.out.println("A soma de todos os pares é: "+ somaPar+
				         "\nA soma de todos os impares é: "+ somaImpar);
	}

}
