package Revisao;

import java.text.DecimalFormat;

/*7. Crie essa matriz: 
2104	3	399900 *
1600	3	329900 *
2400	3	369000 *
1416	2	232000 *
3000	4	539900 *
1985	4	299900 *
1534	3	314900 
1427	3	199000 
1380	3	212000 
1494	3	242500 
1940	4	240000 
2000	3	347000 
1890	3	330000 
4478	5	699900 
1268	3	259900 
A primeira coluna é o tamanho da casa 
A segunda coluna é a quantidade de quartos 
A terceira coluna é o preço 
Determinar: 
a) Qual é a média dos preços das casas? 
b) Quanto custa a menor casa? E quantos quartos tem a casa mais cara? 
c) Qual a diferença de tamanho da casa com o maior número de quartos   para a casa com o menor número de quartos?*/
public class rev_Ex7_crie_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double soma = 0;
		int aux = 0;
		double menorCasa = Integer.MAX_VALUE;
		double maiorCasa = Integer.MIN_VALUE;
		double menosQuartos = Integer.MAX_VALUE;
		double maisQuartos = Integer.MIN_VALUE;
		double casaCara = Integer.MIN_VALUE;
		double valorCasa = 0;
		double qtdQuartos = 0;
		double tmCasaMenosQt = 0;
		double tmCasaMaisQt = 0;
		

		DecimalFormat fmt = new DecimalFormat ("0.00");
		
		double[][] matriz = { { 2104, 3, 399900 }, { 1600, 3, 329900 }, { 2400, 3, 369000 }, { 1416, 2, 232000 },
				{ 3000, 4, 539900 }, { 1985, 4, 299900 }, { 1534, 3, 314900 }, { 1427, 3, 199000 }, { 1380, 3, 212000 },
				{ 1494, 3, 242500 }, { 1940, 4, 240000 }, { 2000, 3, 347000 }, { 1890, 3, 330000 }, { 4478, 5, 699900 },
				{ 1268, 3, 259900 } };

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
//questão A 
				if (j == 2) {
					soma += matriz[i][j];
					aux++;
					// questão B
					if (matriz[i][j] > casaCara) {
						casaCara = matriz[i][j];
						qtdQuartos = matriz[i][1];
					}
				}
//questão B
				if (j == 0) {
					if (matriz[i][j] < menorCasa) {
						menorCasa = matriz[i][j];
						valorCasa = matriz[i][2];
					}

				}
//questão C				
				if (j==1) {
					if (matriz[i][j] < menosQuartos) {
						menosQuartos = matriz[i][j];
						tmCasaMenosQt = matriz[i][0];
					}
					if (matriz[i][j] > maisQuartos) {
						maisQuartos = matriz[i][j];
						tmCasaMaisQt = matriz[i][0];
					}
				}

				System.out.print(matriz[i][j] + ": ");
			}
			System.out.println("\n");
		}

		System.out.println("Questão A: a média dos preços das casas é " + fmt.format(soma / aux));
		System.out.println("soma" + soma + ", aux" + aux);
		System.out.println("A menor casa custa R$" + valorCasa + " e o seu tamanho é " + menorCasa);
		System.out.println("A casa mais cara custa R$" + casaCara + " e possui " + qtdQuartos + " quartos.");
		System.out.println("A casa que possui maior numero de quartos tem "+maisQuartos+" quartos e a casa que possui menos tem "+menosQuartos);
		System.out.println("A casa com mais quartos mede "+tmCasaMaisQt+" e a com menos mede "+tmCasaMenosQt);
		System.out.println("A diferenca de tamanho delas é "+(tmCasaMaisQt - tmCasaMenosQt));
	}

}
