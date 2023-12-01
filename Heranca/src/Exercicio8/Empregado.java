package Exercicio8;

import java.time.LocalDate;
import java.util.List;

public class Empregado extends Funcionario {
	
	private String idSindicato;
	private Gerente gerente;
	
	public Empregado(String id, Endereço endereco, LocalDate dataDeNascimento, String nome, double salario,
			LocalDate dataIngresso, List<String> habilidades, String idSindicato, Gerente gerente ) {
		super(id, endereco, dataDeNascimento, nome, salario, dataIngresso, habilidades);

		setIdSindicato(idSindicato);
		setGerente(gerente);
			
	}

	public String getIdSindicato() {
		return idSindicato;
	}

	public void setIdSindicato(String idSindicato) {
		this.idSindicato = idSindicato;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	public void sairDoSindicato() {
		this.idSindicato=null;
		
	}
	public void comissao(double aux2) {
		double aux3 = getSalario() + (aux2*0.05);
		this.setSalario(aux3);
	}
	
	

}
