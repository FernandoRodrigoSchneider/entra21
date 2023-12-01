package classes_e_objetos_2;

import java.util.Scanner;

/*Crie uma classe Empregado que terá como atributos:
Identificação
Nome
Sobrenome
Salário

Crie métodos para:
Saber o salário anual do empregado
Saber o nome completo do empregado
Modificar o salário, o parâmetro do método deve ser o percentual de aumento
Imprima o toString do usuário que após o aumento ficou com o maior do salário*/
public class EX4_Classes_objetos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double aux;
		ex4_Empregados emp1 = new ex4_Empregados("Fernando", "Schneider", 5000);

		System.out.println("informe o percentual de almento do funcionario;");
		aux = in.nextDouble();
		emp1.aumentoSalario(aux);
		
		System.out.println(emp1.toString());
	}
	
}
