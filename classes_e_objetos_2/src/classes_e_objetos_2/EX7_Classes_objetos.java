package classes_e_objetos_2;

import java.io.ObjectInputStream.GetField;
import java.util.Iterator;
import java.util.Scanner;

/*Faça uma classe chamada Conta, com os atributos nome 
 * e saldo.

Faça um método para sacar dinheiro
Outro método para depositar dinheiro
E outro método para transferir dinheiro de uma conta para
 outra*/
public class EX7_Classes_objetos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//para criar um objeto na classe main
//um objeto tem os atributos da identidade, mas os valores mudam		
		ex7_Conta c1 = new ex7_Conta("Fernando", 0.0);
		ex7_Conta c2 = new ex7_Conta("Lucas", 0);
		ex7_Conta c3 = new ex7_Conta("Gabriel", 0);

		String nome = "";
		System.out.println("digite o nome da conta que quer acessar:");
		nome = in.next();

		while (!nome.equals("sair")) {

			for (ex7_Conta i : ex7_Conta.listaConta) {
				if (nome.equals(i.getNome())) {
					System.out.println("digite A-pra deposito" + "B-para saque" + "c- para trnsferencia"
							+ "D-Voltar ao menu inicial");
					String aux1 = in.next();
					switch (aux1) {
					case "A":
						System.out.println("Olá " + i.getNome());
						System.out.println("seu saldo atual é R$" + i.getSaldo());
						System.out.println("qual o valor a ser depositado");
						Double dep = in.nextDouble();
						i.depConta(dep);
						System.out.println("seu novo saldo é R$" + i.getSaldo());
						break;
					case "B":
						System.out.println("Olá " + i.getNome());
						System.out.println("seu saldo atual é R$" + i.getSaldo());
						System.out.println("qual o valor do saque");
						Double saque = in.nextDouble();
						i.saqueConta(saque);
						System.out.println("seu novo saldo é R$" + i.getSaldo());
						break;
					case "C":
						System.out.println("Olá " + i.getNome());
						System.out.println("seu saldo atual é R$" + i.getSaldo());
						System.out.println("qual o valor da transferencia:");
						Double transf = in.nextDouble();
						System.out.println("para qual conta deseja transferir:");
						String nomeTransf = in.next();
						i.saqueConta(transf);
						for (ex7_Conta j : ex7_Conta.listaConta) {
							if (nomeTransf.equals(j.getNome())) {
								j.tranferencia(transf);
							}
						}
						System.out.println("seu novo saldo é R$" + i.getSaldo());
						break;
					case "D":
						System.out.println("digite o nome da conta que quer acessar ou digite sair:");
						nome = in.next();
						break;
					}
				}
			}

			/*
			 * for (ex7_conta i : ex7_conta.listaConta) {
			 * System.out.println("digite A-pra deposito" + "B-para saque" +
			 * "c- para trnsferencia"); String aux1 = in.next(); switch (aux1) { case "A":
			 * System.out.println("Olá "+i.getNome());
			 * System.out.println("seu saldo atual é R$"+i.getSaldo());
			 * System.out.println("qual o valor a ser depositado"); Double dep =
			 * in.nextDouble(); i.depConta(dep);
			 * System.out.println("seu novo saldo é R$"+i.getSaldo()); break; case "B":
			 * System.out.println("Olá "+i.getNome());
			 * System.out.println("seu saldo atual é R$"+i.getSaldo());
			 * System.out.println("qual o valor do saque"); Double saque = in.nextDouble();
			 * i.depConta(saque); System.out.println("seu novo saldo é R$"+i.getSaldo());
			 * break; default: break; } }
			 */
		}

	}
}