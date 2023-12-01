package classes_e_objetos;

public class EX3_classes_objetos {

	public static void main(String[] args) {
		ex3_Produto produto1 = new ex3_Produto();
		ex3_Produto produto2 = new ex3_Produto();
		ex3_Produto produto3 = new ex3_Produto();
		
		produto1.nome = "caderno";
		produto1.descricao = "Caderno em espiral tamanho médio";
		produto1.precoUnitario = 4.50;
		produto1.desconto = 15;
				
		produto2.nome = "Caneta ESF";
		produto2.descricao = "Caneta esferográfica 5mm";
		produto2.precoUnitario = 1.20;
		produto2.desconto = 2;
		
		produto3.nome = "Esquadro";
		produto3.descricao = "Esquadro de acrílico 20 cm";
		produto3.precoUnitario = 2.35;
		produto3.desconto = 10;

	}

}
