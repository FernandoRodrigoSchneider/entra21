package classes_e_objetos;

/*Utilizando a classe Mercado.
Atribua valores às variáveis da classe Mercado para cada um dos objetos de Mercado.
Sendo que o preço de compra dos produtos foi igual em todos os mercados.
Calcule:
a) Quem teve o maior lucro vendendo maçãs?
b) Quem teve o maior lucro vendendo laranjas?
c) Qual das lojas teve o maior lucro nesse ano específico?
d) Qual das lojas teve o menor lucro?
e) Qual das lojas ficou no "meio" em termos de lucro?
f) Juntando as 3 lojas, a franquia teve um lucro maior vendendo maçãs ou laranjas?*/
public class EX2_classes_objetos {

	public static void main(String[] args) {
		mercado unidadeDeBlumenau = new mercado(10, 5.50, 20, 1.5, "Blumenau");
		mercado unidadeDeJoinville = new mercado(15, 5.50, 10, 1.80, "Joinville");
		mercado unidadeDeFlorianopolis = new mercado(5, 6, 30, 1.9, "Florianopolis");
		double maiorLucroMacas;
		double maiorLucroLaranjas;
		double maiorLucro;
		double menorLucro;
		String cidade = "";
		double lucroTotal = 0;

		/*
		 * unidadeDeBlumenau.numMacas = 10; unidadeDeBlumenau.precoMacas = 5.50;
		 * unidadeDeBlumenau.numLaranja = 20; unidadeDeBlumenau.precoLaranja = 1.5;
		 * unidadeDeBlumenau.unidade = "Blumenau";
		 * 
		 * 
		 * unidadeDeJoinville.numMacas = 15; unidadeDeJoinville.precoMacas = 5.00;
		 * unidadeDeJoinville.numLaranja = 10; unidadeDeJoinville.precoLaranja = 1.8;
		 * unidadeDeJoinville.unidade = "Joinville";
		 * 
		 * unidadeDeFlorianopolis.numMacas = 5; unidadeDeFlorianopolis.precoMacas = 6;
		 * unidadeDeFlorianopolis.numLaranja = 30; unidadeDeFlorianopolis.precoLaranja =
		 * 1.9; unidadeDeFlorianopolis.unidade = "Florianopolis";
		 */
		// lucro maçãs
		if (unidadeDeBlumenau.lucroMacas() > unidadeDeJoinville.lucroMacas()
				&& unidadeDeBlumenau.lucroMacas() > unidadeDeFlorianopolis.lucroMacas()) {
			maiorLucroMacas = unidadeDeBlumenau.lucroMacas();
			// cidade = unidadeDeBlumenau.unidade();
			System.out.println(
					unidadeDeBlumenau.unidade + " teve lucro de " + unidadeDeBlumenau.lucroMacas() + " vendendo macãs");
		} else if (unidadeDeJoinville.lucroMacas() > unidadeDeFlorianopolis.lucroMacas()) {
			maiorLucroMacas = unidadeDeJoinville.lucroMacas();
			System.out.println(unidadeDeJoinville.unidade + " teve lucro de " + unidadeDeJoinville.lucroMacas()
					+ " vendendo macãs");
		} else {
			maiorLucroMacas = unidadeDeFlorianopolis.lucroMacas();
			System.out.println(unidadeDeFlorianopolis.unidade + " teve lucro de " + unidadeDeFlorianopolis.lucroMacas()
					+ " vendendo macãs");
		}
		// lucro laranja
		if (unidadeDeBlumenau.lucrolaranjas() > unidadeDeJoinville.lucrolaranjas()
				&& unidadeDeBlumenau.lucrolaranjas() > unidadeDeFlorianopolis.lucrolaranjas()) {
			maiorLucroLaranjas = unidadeDeBlumenau.lucrolaranjas();
			// cidade = unidadeDeBlumenau.unidade();
			System.out.println(unidadeDeBlumenau.unidade + " teve lucro de " + unidadeDeBlumenau.lucrolaranjas()
					+ " vendendo laranjas");
		} else if (unidadeDeJoinville.lucrolaranjas() > unidadeDeFlorianopolis.lucrolaranjas()) {
			maiorLucroLaranjas = unidadeDeJoinville.lucrolaranjas();
			System.out.println(unidadeDeJoinville.unidade + " teve lucro de " + unidadeDeJoinville.lucrolaranjas()
					+ " vendendo laranjas");
		} else {
			maiorLucroLaranjas = unidadeDeFlorianopolis.lucrolaranjas();
			System.out.println(unidadeDeFlorianopolis.unidade + " teve lucro de "
					+ unidadeDeFlorianopolis.lucrolaranjas() + " vendendo laranjas");
		}
		// maior lucro se blumenau
		if (unidadeDeBlumenau.lucroTotal() > unidadeDeJoinville.lucroTotal() && unidadeDeBlumenau.lucroTotal() > unidadeDeFlorianopolis.lucroTotal()) {
			maiorLucro = unidadeDeBlumenau.lucroTotal();
			System.out.println(unidadeDeBlumenau.unidade + " teve lucro de " + unidadeDeBlumenau.lucroTotal()
			+ " sendo o maior lucro");
			
			if (unidadeDeJoinville.lucroTotal() > unidadeDeFlorianopolis.lucroTotal()) {
				System.out.println(unidadeDeJoinville.unidade + " teve lucro de " + unidadeDeJoinville.lucroTotal()	+ " sendo o medio lucro");
				System.out.println(unidadeDeFlorianopolis.unidade + " teve lucro de "+ unidadeDeFlorianopolis.lucroTotal() + " sendo o menor lucro");
			} else {
				menorLucro = unidadeDeFlorianopolis.lucroTotal();
				System.out.println(unidadeDeFlorianopolis.unidade + " teve lucro de " + unidadeDeFlorianopolis.lucroTotal()
						+ " sendo o medio lucro");
				System.out.println(unidadeDeJoinville.unidade + " teve lucro de " + unidadeDeJoinville.lucroTotal()
						+ " sendo o menor lucro");
			}
		}
		// maior lucro se joinville
		else if (unidadeDeJoinville.lucroTotal() > unidadeDeFlorianopolis.lucroTotal()) {
			maiorLucro = unidadeDeJoinville.lucroTotal();
			System.out.println(unidadeDeJoinville.unidade + " teve lucro de " + unidadeDeJoinville.lucroTotal()	+ " sendo o maior lucro");
			if (unidadeDeFlorianopolis.lucroTotal() > unidadeDeBlumenau.lucroTotal()) {
				System.out.println(unidadeDeFlorianopolis.unidade + " teve lucro de " + unidadeDeFlorianopolis.lucroTotal()	+ " sendo o medio lucro");
				System.out.println(unidadeDeBlumenau.unidade + " teve lucro de " + unidadeDeBlumenau.lucroTotal()	+ " sendo o menor lucro");
				}
			else {
				System.out.println(unidadeDeBlumenau.unidade + " teve lucro de " + unidadeDeBlumenau.lucroTotal()	+ " sendo o medio lucro");
				System.out.println(unidadeDeFlorianopolis.unidade + " teve lucro de "+ unidadeDeFlorianopolis.lucroTotal() + " sendo o menor lucro");
			}
		}
		// maior lucro se florianopolis
		else {
			maiorLucro = unidadeDeFlorianopolis.lucroTotal();
			System.out.println(unidadeDeFlorianopolis.unidade + " teve lucro de " + unidadeDeFlorianopolis.lucroTotal()
					+ " sendo o maior lucro");
			if (unidadeDeBlumenau.lucroTotal() > unidadeDeJoinville.lucroTotal()){
				System.out.println(unidadeDeBlumenau.unidade + " teve lucro de " + unidadeDeBlumenau.lucroTotal() + " sendo o medio lucro");
				System.out.println(unidadeDeJoinville.unidade + " teve lucro de " + unidadeDeJoinville.lucroTotal()	+ " sendo o menor lucro");
				
			}
			else {
				System.out.println(unidadeDeJoinville.unidade + " teve lucro de " + unidadeDeJoinville.lucroTotal() + " sendo o medio lucro");
				System.out.println(unidadeDeBlumenau.unidade + " teve lucro de " + unidadeDeBlumenau.lucroTotal()	+ " sendo o menor lucro");
			}
		}
		if ((unidadeDeBlumenau.lucroMacas()+unidadeDeJoinville.lucroMacas()+unidadeDeFlorianopolis.lucroMacas()) > 
		(unidadeDeBlumenau.lucrolaranjas()+unidadeDeJoinville.lucrolaranjas()+unidadeDeFlorianopolis.lucrolaranjas())) {
			System.out.println("se obteve mais lucro vendendo macãs");
		} else {
			System.out.println("se obteve mais lucro vendendo laranjas");
		}
		// menor lucro
		/*if (unidadeDeBlumenau.lucroTotal() < unidadeDeJoinville.lucroTotal()
				&& unidadeDeBlumenau.lucroTotal() < unidadeDeFlorianopolis.lucroTotal()) {
			maiorLucro = unidadeDeBlumenau.lucroTotal();
			// cidade = unidadeDeBlumenau.unidade();
			System.out.println(unidadeDeBlumenau.unidade + " teve lucro de " + unidadeDeBlumenau.lucroTotal()
					+ " sendo o maior lucro");
		} else if (unidadeDeJoinville.lucroTotal() > unidadeDeFlorianopolis.lucroTotal()) {
			maiorLucro = unidadeDeJoinville.lucroTotal();
			System.out.println(unidadeDeJoinville.unidade + " teve lucro de " + unidadeDeJoinville.lucroTotal()
					+ " sendo o maior lucro");
		} else {
			maiorLucro = unidadeDeFlorianopolis.lucroTotal();
			System.out.println(unidadeDeFlorianopolis.unidade + " teve lucro de " + unidadeDeFlorianopolis.lucroTotal()
					+ " sendo o maior lucro");
		}*/
	}

}
