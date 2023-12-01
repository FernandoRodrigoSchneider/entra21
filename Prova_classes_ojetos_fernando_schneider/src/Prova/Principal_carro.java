package Prova;

import java.util.Scanner;

public class Principal_carro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Carro m1 = new Carro("Gol", "VW", "MMM001", "Preta", 2009, 25000, 1);
		Carro m2 = new Carro("Fox", "VW", "LML002", "Vermelha", 2010, 30000, 2);
		Carro m3 = new Carro("Uno", "Fiat", "MLM003", "Cinza", 2011, 32000, 3);
		Carro m4 = new Carro("Fiesta", "Ford", "LLL004", "Branca", 2009, 29000, 1);
		Carro m5 = new Carro("Palio", "Fiat", "KKK345", "Amarela", 2011, 26000, 1);

		double maisCaro1 = Integer.MIN_VALUE;
		double maisCaro2 = Integer.MIN_VALUE;
		double maisBarato1 = Integer.MAX_VALUE;

		Carro aux1 = null;
		Carro aux2 = null;
		Carro aux3 = null;

		System.out.println("a) Infomar um ano para ver o carro mais caro deste ano:");
		int ano = in.nextInt();
		System.out.println("b) Informe uma faixa de valores para pesquisa: menor valor 1");
		double val1 = in.nextInt();
		System.out.println("maior valor 2");
		double val2 = in.nextDouble();
		System.out.println("informe a marca para pesquisa;");
		String marca1 = in.next();
		System.out.println("c) Informe a localização da pesquisa: 1 ,2 ou 3");
		int local = in.nextInt();

		for (Carro i : Carro.ListaCarro) {
			if (i.getAno() == ano) {
				if (i.getPreco() > maisCaro1) {
					maisCaro1 = i.getPreco();
					aux1 = i;
				}
				

			}			
			if (i.getMarca().equals(marca1)) {
				if (i.getPreco() >= val1 && i.getPreco() <= val2) {
					System.out.println(i.toString());

				}
			}
			if (i.getLocalizaçao() == local) {
				if (i.getPreco() > maisCaro2) {
					maisCaro2 = i.getPreco();
					aux2 = i;
				}
			}
			if (i.getLocalizaçao() == local) {
				if (i.getPreco() < maisBarato1) {
					maisBarato1 = i.getPreco();
					aux3 = i;
				}
			}
		}
		System.out.println(aux1.toString() + " é o mais caro do determinado ano");
		System.out.println(aux2.toString());
		System.out.println(aux3.toString());

		for (Carro j : Carro.ListaCarro) {
			System.out.println(j.toString() + " com a depreciação passou a valer R$" + j.depreciacao());
		}

	}

}
