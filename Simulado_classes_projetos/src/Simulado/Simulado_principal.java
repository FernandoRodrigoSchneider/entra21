package Simulado;

import java.util.Scanner;
import java.util.Set;

public class Simulado_principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Simulado_conta c1 = new Simulado_conta("Jorge", "Private", 2012, 2500000, "Ana");
		Simulado_conta c2 = new Simulado_conta("Luiz", "Stilo", 2015, 500000, "Ana");
		Simulado_conta c3 = new Simulado_conta("Claudio", "Exclusive", 2017, 250000, "Mariana");
		Simulado_conta c4 = new Simulado_conta("Bruna", "Prime", 2005, 5500000, "Paulo");
		Simulado_conta c5 = new Simulado_conta("Ana", "Exclusive", 2023, 1000, "Paulo");

		double maiorSaldo = Integer.MIN_VALUE;
		double maisAntigo = Integer.MAX_VALUE;
		int cont = 0;
		
		Simulado_conta aux1 = null;
		Simulado_conta aux2 = null;
		Simulado_conta aux3 = null;
		Simulado_conta aux4 = null;

		System.out.println("informe o nome do gerente para saber as informações do cliente mais antigo");	
		String nomeGerente1 = in.next();
		System.out.println("informe o gerente para saber as informações de todos os clientes dele");
		String nomeGerente2 = in.next();
		System.out.println("informe o nome do gerente para saber quantos cliente ele tem");
		String nomeGerente3 = in.next();

		for (Simulado_conta i : Simulado_conta.ListaConta) {
			if (i.getSaldo() > maiorSaldo) {
				maiorSaldo = i.getSaldo();
				aux1 = i;
			}
		
			if (i.getGerente().equals(nomeGerente1)) {
				if (i.getAnoCadastro() < maisAntigo) {
					maisAntigo = i.getAnoCadastro();
					aux2 = i;
				}
			}
			if (i.getGerente().equals(nomeGerente2)) {
				System.out.println("c)"+i.toString());
			}
			if (i.getGerente().equals(nomeGerente3)) {
				cont += 1;
			}
		}
		System.out.println("a) o maior saldo e do(a)" + aux1.toString());
		System.out.println("b) o cliente mais atigo do gerente "+nomeGerente1+" é " + aux2.toString());
		System.out.println("d) o gerente "+nomeGerente3+" possui "+cont+" cliente(s)");
		System.out.println("informe o nome do clinte para criar uma aplicação");
		String clienteAplic = in.next();
		System.out.println("Informe a quantidade de meses da aplicação");
		int mesesAplic = in.nextInt();
		double aux5 = 0;
		for (Simulado_conta j : Simulado_conta.ListaConta) {
			if (j.getNome().equals(clienteAplic)) {
				aux5 = j.rendimento(mesesAplic);
				System.out.println(aux5);
			}
			
			
		}
		System.out.println(aux5);
	}

}
//a) informações do cliente com mais dinhiro no banco
//b) informações do cliente mais antigo de um dado gerente
//c) listar as informações de todos os cliente de um dado gerente
//d) informar quantos cliente um dado gerente tem