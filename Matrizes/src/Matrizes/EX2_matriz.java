package Matrizes;

//1. Criar uma matriz com 1 linha e 10 colunas, na mesma verifique quantos valores são par e quantos valores são impar e calcule a média dos valores
public class EX2_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[4][2];
		int soma = 0;
		double soma1 = 0;
		double soma2 = 0;
		double soma3 = 0;

		int numPar = 0;
		int numImpar = 0;

		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[1][0] = 3;
		matriz[1][1] = 4;
		matriz[2][0] = 5;
		matriz[2][1] = 6;
		matriz[3][0] = 7;
		matriz[3][1] = 8;

		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			System.out.println(matriz[0][coluna]);
			soma += matriz[0][coluna];

		}
//inicio da resolução do exercício
		System.out.println(soma);

		int[][] matriz1 = new int[1][10];
		matriz1[0][0] = 1;
		matriz1[0][1] = 2;
		matriz1[0][2] = 3;
		matriz1[0][3] = 4;
		matriz1[0][4] = 5;
		matriz1[0][5] = 6;
		matriz1[0][6] = 7;
		matriz1[0][7] = 8;
		matriz1[0][8] = 9;
		matriz1[0][9] = 10;

		for (int c = 0; c < matriz1[0].length; c++) {
			System.out.println(matriz1[0][c]);
			soma1 += matriz1[0][c];
			if (matriz1[0][c] % 2 == 0) {
				numPar += 1; // matriz1[0][c];
				// System.out.println("numeros par : " + numPar);

			} else {
				numImpar += 1; // matriz1[0][c];
				// System.out.println("numeros impar : " + numImpar);

			}

		}
		System.out.println("numeros par : " + numPar);
		System.out.println("numeros impar : " + numImpar);
		System.out.println("a média é : " + soma1 /matriz1[0].length);
//Agora criem uma segunda linha e novamente somem todas as colunas, por fim somem os valores da linho 0 e da linha 1
		
		int[][] matriz2 = new int[2][10];
		matriz2[0][0] = 1;
		matriz2[0][1] = 2;
		matriz2[0][2] = 3;
		matriz2[0][3] = 4;
		matriz2[0][4] = 5;
		matriz2[0][5] = 6;
		matriz2[0][6] = 7;
		matriz2[0][7] = 8;
		matriz2[0][8] = 9;
		matriz2[0][9] = 10;
		matriz2[1][0] = 11;
		matriz2[1][1] = 21;
		matriz2[1][2] = 31;
		matriz2[1][3] = 41;
		matriz2[1][4] = 51;
		matriz2[1][5] = 61;
		matriz2[1][6] = 71;
		matriz2[1][7] = 81;
		matriz2[1][8] = 91;
		matriz2[1][9] = 101;
		for (int c = 0; c < matriz2[1].length; c++) {
			System.out.println(matriz2[1][c]);
			soma2 += matriz2[1][c];
		
	}
		System.out.println("soma da primeira linha: "+soma1);
		System.out.println("soma da segunda linha: "+soma2);
		System.out.println("soma das duas linhas: "+(soma1+soma2));
//3. Criem uma matriz de 5 linhas e 1 coluna, somem todos os valores
//Posteriormente verifique a média e imprima somente os valores que estão acima dela		
		int[][] matriz3 = new int[5][1];
		matriz3[0][0] = 1;
		matriz3[1][0] = 2;
		matriz3[2][0] = 3;
		matriz3[3][0] = 4;
		matriz3[4][0] = 5;
		for (int l = 0; l < 5; l++) {
			System.out.println(matriz3[l][0]);
			soma3 += matriz3[l][0];
	
			
		}
		System.out.println("soma: "+soma3);
		double media1= (soma3/5);
		
		System.out.println("media: "+media1);
		for (int l = 0; l < 5; l++) {
			if (matriz3[l][0] > media1) {
				System.out.println(matriz3[l][0]);
			}
	
			
		}
	

	}
}
	
