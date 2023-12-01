package Metodo;

/*Faça um método para cada um dos seus seus colegas
O método deve printar:
O nome dele(a) é [nome]
Ele(a) tem [idade] anos
Ele(a) é estudante do Entra 21
(Em prints separados)
Os dados devem ser passados como parametros, e o metodo pode ser chamado mais de uma vez*/
public class EX3_printar_coleg {

	public static void colega(String nome, int idade, Boolean estudante) {

		System.out.println(nome);
		System.out.println(idade + " anos");
		//mesma coisa que estudante == true ,
		//se for comparar a falso estudante == false || !estudante
		if (estudante) {
			System.out.println("Estudante do Entra21");

		} else {
			System.out.println("não é estudante");
		}
	}

	public static void main(String[] args) {
		

		colega("Fernando", 40, true);

	}

}
