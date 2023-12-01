package classes_e_objetos_2;

/*Em um sistema de uma floricultura deve se guardar o nome da flor,
 *  o preço, nome do cliente que comprou a flor e se a flor é para 
 *  presente ou não.
Crie 5 objetos de flor e as coloque em uma Array List
Responda:
a) Quem comprou a flor mais cara?
b) Qual o nome da flor mais cara?*/
public class EX3_Classes_objetos {

	public static void main(String[] args) {

		ex3_Floricultura f1 = new ex3_Floricultura("Rosa", 5, "Fernando", 's');
		ex3_Floricultura f2 = new ex3_Floricultura("Margarida", 7, "Ana", 'n');
		ex3_Floricultura f3 = new ex3_Floricultura("Bromelia", 3, "Lucas", 's');
		ex3_Floricultura f4 = new ex3_Floricultura("Margarida", 10, "Gabriel", 's');
		ex3_Floricultura f5 = new ex3_Floricultura("Hortencia", 8, "Vilma", 'n');

		double maiorPreco = Integer.MIN_VALUE;
		ex3_Floricultura ind = null;

		for (ex3_Floricultura i : ex3_Floricultura.ListaFloricultura) {
			if (i.getPreco() > maiorPreco) {
				maiorPreco = i.getPreco();
				ind = i;
			}

		}

		System.out.println("A flor mais cara " + ind.toString() + " por R$" + maiorPreco);

	}
}