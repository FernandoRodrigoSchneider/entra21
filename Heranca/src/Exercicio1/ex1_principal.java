package Exercicio1;

public class ex1_principal {

	public static void main(String[] args) {

		Cilindro cld1 = new Cilindro("azul", 5, 10);
		Circulo cl1 = new Circulo("verde", 3);
		
		System.out.println("cilindro de cor "+cld1.getCor()+" de area "+cld1.area()+" e volume "+ cld1.volume());
		System.out.println(cl1.toString());
		System.out.println(cld1.toString());
	}

}
