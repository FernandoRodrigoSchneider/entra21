package Matrizes;

//4. Crie uma matriz 3 linhas e 3 colunas, preencha a mesma de A até I, posteriormente imprima a matriz.
public class EX3_3_3_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int quantidadeDeLinhas = 3;
		int quantidadeDeColunas = 3;
		String[][] matriz = new String[quantidadeDeLinhas][quantidadeDeColunas];

		matriz[0][0] = "a";
		matriz[0][1] = "b";
		matriz[0][2] = "c";
		matriz[1][0] = "d";
		matriz[1][1] = "e";
		matriz[1][2] = "f";
		matriz[2][0] = "g";
		matriz[2][1] = "h";
		matriz[2][2] = "i";

		for (int linha = 0; linha < quantidadeDeLinhas; linha++) {
			for (int coluna = 0; coluna < quantidadeDeColunas; coluna++) {
				// System.out.println("linha "+linha+" , posição "+coluna);
					System.out.print(matriz[linha][coluna]);
			}
			System.out.println();
		}
	}
}
