package Revisao;

/*questão revisão: Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes. 
 * Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor inteiro) e a idade. 
Baseado nisto faça um programa que informe: 
qual a nota média recebida pelo cinema; 
qual a nota média atribuída pelos homens; 
qual a nota atribuída pela mulher mais jovem; 
quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.*/
import java.util.Scanner;

public class rev_EX9_Pesquisa_cinema {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int clientes = 5; //Quantidade de clientes
		int sexo; //Variavel para somar os sexos certo
		int somaSexoM = 0; //Quantidade de pessoas do sexo masculino
		int somaSexoF = 0; //Quantidade de pessoas do sexo feminino
		int nota; //Nota para o cinema
		int idade; //Idade dos clientes
		double mediaCinema = 0; //Soma das notas do cinema / 30
		double notaH = 0; //Soma das notas dos homens / somaSexoM
		int notaM = 0; //Nota da mulher mais jovem
		int idadeM = Integer.MAX_VALUE; //Verificador de idade
		int superiorMedia = 0; //Nota dada por er maio que a média do cinema
		int [] vetor = new int [somaSexoF]; //Mulheres com mais de 50 anos
		int somaSexoFMaiorIdade = 0;

		for (int i = 0; i < clientes; i++) {
			System.out.print("Qual é o seu sexo : \n1 - Feminino\n2 - Masculino\n>>> ");
			sexo = in.nextInt();
			if (sexo == 2) {
				somaSexoM++;
			} else {
				somaSexoF++;
			}
			System.out.print("De uma nota de 0 até 10 para o cinema : ");
			nota = in.nextInt();
			mediaCinema += nota;
			if (sexo == 2) {
				notaH += nota;
			}
			System.out.print("Qual é a sua idade : ");
			idade = in.nextInt();
			if (idade < idadeM && sexo == 1) {
				idadeM = idade;
				notaM = nota;
			} else if (idade >= 50 && sexo == 1) {
				vetor[somaSexoFMaiorIdade] = nota;
				somaSexoFMaiorIdade++;
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > (mediaCinema/clientes)) {
				superiorMedia++;
			}
		}
		System.out.println("Sexo M = " + somaSexoM + "\nSexo F = " + somaSexoF
				+ "\nMédia Cinema = " + mediaCinema/clientes + "\nMédia dada pelos homens = " + notaH/somaSexoM
				+ "\nNota da mulher mais jovem = " + notaM + "\nMulheres com mais de 50 = " + somaSexoFMaiorIdade
				+ "\nMulheres com mais de 50 anos deram nota superior a média recebida pelo cinema = " + superiorMedia);
	}
}
