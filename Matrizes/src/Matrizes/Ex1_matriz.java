package Matrizes;

public class Ex1_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] matriz = new String[3][2];
		
		matriz[0][0] = "Doritos"; 
		matriz[0][1] = "3"; 
		matriz[1][0] = "Chocolate"; 
		matriz[1][1] = "9"; 
		matriz[2][0] = "Sushi"; 
		matriz[2][1] = "7"; 

		System.out.println(matriz[2][0]);
		System.out.println(matriz[2][1]);
		
		int[][] matriz1 = new int[4][3];
		
		matriz1[0][0] = 5; 
		matriz1[0][1] = 1; 
		matriz1[0][2] = 2; 
		matriz1[1][0] = 10; 
		matriz1[1][1] = 6; 
		matriz1[1][2] = 7;		
		matriz1[2][0] = 15; 
		matriz1[2][1] = 11; 
		matriz1[2][2] = 12; 
		matriz1[3][0] = 20; 
		matriz1[3][1] = 16; 
		matriz1[3][2] = 17; 
		
		System.out.println(matriz1[2][0]);
		
		double[][] matriz2 = new double[3][2];
		double media = 0;
		matriz2[0][0] = 1.5; 
		matriz2[0][1] = 22; 
		matriz2[1][0] = 1.76; 
		matriz2[1][1] = 5; 
		matriz2[2][0] = 1.85; 
		matriz2[2][1] = 4;
		
		media = (matriz2[0][0] + matriz2[1][0] + matriz2[2][0]) / 3;
		
		
		System.out.println(matriz2[2][0]);
		System.out.println("a média das alturas é "+media);


	}

}
