package Revisao;

//2.Escreva um algoritmo printe o número 0, 2, 4, 6, 8 ...  até o número 5 mil
public class rev_Ex2_print_ate_5000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;

		for (int i = 0; i < 5001; i++) {
			if (i %2 == 0) {
				num = i;
				System.out.println(num);
			}
			
		}
		
	}

}
