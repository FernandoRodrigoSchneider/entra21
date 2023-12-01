package Metodo;

import java.util.Scanner;

public class EX6_Print_20_proximos {

public static void result(int num) {
		
		System.out.print(num+", ");
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//int num = 0;
		System.out.println("informe um valor");
		int num = in.nextInt();
		int num2 = num + 20;
		
		do {
			num ++;
			//System.out.println(num);
			result(num);
		} while (num != num2);
		
		//System.out.println(num);
		

	}

}