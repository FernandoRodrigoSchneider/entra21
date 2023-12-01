package classes_e_objetos_2;

/*Faça uma classe chamada OnibusEscolar, com os atributos estudantes e 
 * professor
Faça uma exceção no método setAlunos que se o número de alunos for 
maior do que 40, faça com que o número de alunos seja 40
Caso o número de professores for 0, o número de alunos também deve 
ser zerado
Faça também um método chamado remover alunos, que deverá remover os 
alunos de acordo com o valor passado como parâmetro*/
import java.util.List;
import java.util.Scanner;

public class EX2_classes_objetos {

	public static void main(String[] args) {
		int aux;
		Scanner in = new Scanner(System.in);
		
		ex2_onibusEscolar onibus1 = new ex2_onibusEscolar(50, 1);
		ex2_onibusEscolar onibus2 = new ex2_onibusEscolar(20, 1);
		
		System.out.println("Informe quantos alunos vão ser alterados : ");
		aux = in.nextInt();
		onibus2.alteraAluno(aux);
		
		
		System.out.println(onibus1.toString());
		System.out.println(onibus2.toString());

	}

}