package classes_e_objetos_2;

import java.util.Scanner;

/*Deseja-se criar uma classe para controlar a velocidade do carro.

Implemente os métodos:
acelerar(double): void, que deve modificar o conteúdo do atributo velocidade para velocidade + 
parâmetro recebido (usar setVelocidade), mas desde que o valor do parâmetro 
seja maior ou igual a zero e menor que 20. Senão, imprime a mensagem “Não 
foi possível acelerar” e mantém o valor atual do atributo velocidade.

reduzir(double): void, quem odifica o conteúdo do atributo velocidade para velocidade - 
parâmetro recebido (usar setVelocidade), mas desde que o valor do parâmetro 
seja maior ou igual a zero e menor que 30. Senão, imprime a mensagem “Não 
foi possível reduzir” e mantém o valor atual do atributo velocidade.*/
public class EX8_Classes_objetos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("informe a velocidade do veiculo");
		double vel = in.nextDouble();

		ex8_Velocidade vel1 = new ex8_Velocidade(vel);

		System.out.println("Digite A - Acelerar, R - Reduzir ou sair");
		String cond = in.next();
		while (!cond.equals("sair")) {
			if (cond.equals("sair")) {
				System.out.println("fim do programa");
			}
			for (ex8_Velocidade i : ex8_Velocidade.listaVelocidade) {
				if (cond.equals("A")) {
					System.out.println("o quanto vc quer acelerar");
					double velAcel = in.nextDouble();
					i.acelerar(velAcel);
					System.out.println(i.toString());

				}
				if (cond.equals("R")) {
					System.out.println("o quanto vc quer reduzir");
					double velRed = in.nextDouble();
					i.reduzir(velRed);
					System.out.println(i.toString());
				}
				System.out.println("Digite A - Acelerar, R - Reduzir ou sair");
				cond = in.next();
			}

		}
		System.out.println("fim do programa");
	}
}
