package classes_e_objetos_2;

/*Crie um sistema para uma loja de materiais de construção
Os objetos terão os atributos:
Nome, descrição, preço, peso e estoque

Crie um método para adicionar mais unidades da peça ao estoque.
Crie um método para a venda desse produto, podendo ser vendidos até o 
mesmo número de peças que tem no estoque.
Crie um método para colocar o produto em promoção, o parâmetro do método 
deve ser a porcentagem do desconto.

Calcule:
a) Qual o nome do material mais caro
b) Qual o nome do material mais leve
c) Quanto que pesa a quantidade total do produto mais caro, ou seja, a 
quantidade multiplicado pelo peso*/
public class EX5_Classes_objetos {

	public static void main(String[] args) {

		ex5_matCons p1 = new ex5_matCons("Cimento", "cimento votoran", 38.50, 50, 100);
		ex5_matCons p2 = new ex5_matCons("Cal", "Cal Hidratada", 13.50, 20, 100);
		ex5_matCons p3 = new ex5_matCons("Tijolo", "tijolo 6 furos", 1.50, 0.20, 10000);

		double maisCaro = Integer.MIN_VALUE;
		ex5_matCons auxCaro = null;
		double pesoTotal = 0;
		double maisLeve = Integer.MAX_VALUE;
		ex5_matCons auxLeve = null;
		
		for (ex5_matCons i : ex5_matCons.listaMatCons) {
			if (i.getPreco() > maisCaro) {
				maisCaro = i.getPreco();
				pesoTotal = i.pesoTotal();
				auxCaro = i;
			}
			if (i.getPeso() < maisLeve) {
				maisLeve = i.getPeso();
				auxLeve = i;
			}
			
			
		}
		System.out.println("o material mais caro é "+auxCaro.toString()+"e "
				+ "o peso total do estoque é "+pesoTotal+"Kg");
		System.out.println("O material mais leve é "+auxLeve.toString());
	}

}
