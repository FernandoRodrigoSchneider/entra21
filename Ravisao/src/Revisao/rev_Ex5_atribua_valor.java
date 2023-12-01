package Revisao;

/*5. Faça um algoritmo que atribua valores ao vetor de acordo com o quadrado do seu índice 
Ex: 
[0] = 0 
[1] = 1 
[2] = 4 
[3] = 9.*/
public class rev_Ex5_atribua_valor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamanhoVetor = 20;
		int[] vetor = new int[tamanhoVetor];

		for (int i = 0; i < 10; i++) {
			vetor[i] = i * i;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(vetor[i]);

		}
	}

}
