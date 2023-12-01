package Exercicio8;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<String>habilidades = new ArrayList<>();
		habilidades.add("Gerenciar");
		habilidades.add("Administrar");
		

		Endereço e1 = new Endereço("Brasil", "SC", "Blumenau", "Rua Imperatriz","599");
		Endereço e2 = new Endereço("Brasil", "SC", "Blumenau", "Rua nova vila","9");
		Gerente g1 = new Gerente("002", e2, LocalDate.of(1980, 04, 20), "Ana", 10000, LocalDate.of(2013, 01, 02), habilidades, "G1");
		Funcionario f1 = new Empregado("001",e1,LocalDate.of(1983, 04, 18), "Fernando", 8000.00, LocalDate.of(2015, 01, 02), habilidades, "S001", g1);
		//Funcionario g1 = new Gerente("002",( "Brasill"), 1984,11,26,"Ana", 9000.00, 2010,01,01, "gerente", "G001");
	}

}
//"brasil","SC","Blumanau","Rua FFFFFF","599"