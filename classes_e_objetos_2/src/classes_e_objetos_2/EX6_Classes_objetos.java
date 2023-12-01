package classes_e_objetos_2;

/*Uma pizzaria tem 5 pizzas em seu cardápio.
Cada pizza tem um nome, 3 ingredientes, um boolean referente à borda,
 diâmetro e preço.
Crie 5 objetos de pizza e os coloque em uma Array List.
Crie um método para mudar algum dos ingredientes da pizza, caso alguns 
dos ingredientes da pizza tenha sido iniciado como null, substitua esse 
ingrediente pelo novo, caso contrário, mude o terceiro ingrediente.
Qual é a pizza mais barata por área?*/
public class EX6_Classes_objetos {

	public static void main(String[] args) {

		ex6_Pizza p1 = new ex6_Pizza("Margarita", "mussarela", "Tomate", "Manjericão", true, 40, 100);
		ex6_Pizza p2 = new ex6_Pizza("Calabresa", "mussarela", "Calabresa", null, false, 50, 120);
		ex6_Pizza p3 = new ex6_Pizza("Frango c/ Catupiry", "mussarela", "Frango", "Catupiry", true, 30, 80);
		ex6_Pizza p4 = new ex6_Pizza("Prestigio", "Chocolate", "coco", null, false, 20, 50);
		ex6_Pizza p5 = new ex6_Pizza("Alho e óleo", "mussarela", "alho", "oleo", false, 60, 150);
		
		String aux1 = "gorgonzola";
		
		for (ex6_Pizza i : ex6_Pizza.ListaPizza) {
			if (i.ListaPizza == null) {
				null = aux1;
			}
		}
	}

}
