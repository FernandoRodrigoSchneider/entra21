package Exercicio8;

import java.time.LocalDate;
import java.util.List;

public class Gerente extends Funcionario {
	private String idGerente;
	
	public Gerente(String id, Endereço endereco, LocalDate dataDeNascimento, String nome, double salario,
			LocalDate dataIngresso, List<String> habilidades, String idGerente) {
		super(id, endereco, dataDeNascimento, nome, salario, dataIngresso, habilidades);
		
		
		setIdGerente(idGerente);
				
	}

	public String getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(String idGerente) {
		this.idGerente = idGerente;
	}
	public void demitirEmpregado(Empregado empregado) {
		if(idGerente.equals(empregado.getGerente().getIdGerente())) {
		this.setId("Demitido");
	}
	

	}
	

}
