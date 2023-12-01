package classes_e_objetos_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça uma classe chamada Retangulo, com os atributos altura e 
 * largura.
Faça um método para descobrir a área e outro para descobrir o 
perímetro.Crie 10 objetos de Retangulo.
Imprima o toString do retângulo com a maior área e o toString 
do retângulo com o maior perímetro*/
public class EX1_Classes_objetos {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		List<Double> listaRetangulo = new ArrayList<>();

		
		ex1_retangulo Ret1 = new ex1_retangulo(10, 20);
		ex1_retangulo Ret2 = new ex1_retangulo(20, 3.5);
		ex1_retangulo Ret3 = new ex1_retangulo(15, 10);
		ex1_retangulo Ret4 = new ex1_retangulo(12, 10.3);
		ex1_retangulo Ret5 = new ex1_retangulo(12.5, 10.8);
		ex1_retangulo Ret6 = new ex1_retangulo(50, 60);
		ex1_retangulo Ret7 = new ex1_retangulo(100, 20);
		ex1_retangulo Ret8 = new ex1_retangulo(30.4, 18.6);
		ex1_retangulo Ret9 = new ex1_retangulo(40.6, 80.5);
		ex1_retangulo Ret10 = new ex1_retangulo(20, 120);
		
		
		double maiorArea=Integer.MIN_VALUE;
		double maiorPerimetro=Integer.MIN_VALUE;
		int indice;
		ex1_retangulo RetMaiorArea = null;
		ex1_retangulo RetMaiorPerimetro = null;
		//ex1_retangulo[] vetorRetangulo = new ex1_retangulo[10];
		for (ex1_retangulo i : ex1_retangulo.listaRetangulo) {
			if (i.area() > maiorArea) {
				maiorArea = i.area();
				RetMaiorArea = i;
				
			}if (i.perimetro() > maiorPerimetro) {
				maiorPerimetro = i.perimetro();
				RetMaiorPerimetro = i;
			}
			
			
		}
		System.out.println(RetMaiorArea.toString());
		System.out.println(RetMaiorPerimetro.toString());
	}
}
