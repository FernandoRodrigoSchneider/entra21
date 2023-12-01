package classes_e_objetos_2;

import java.lang.invoke.StringConcatException;
import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.List;

public class ex4_Empregados {

	
	private String nome;
	private String sobrenome;
	private double salario;
	public static List<ex4_Empregados> LitaEmpregados = new ArrayList<>();
	
	public ex4_Empregados(String nome, String sobrenome, double salario) {
		
		setNome(nome);
		setSobrenome(sobrenome);
		setSalario(salario);
		LitaEmpregados.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		if (sobrenome == null || sobrenome.isBlank() || sobrenome.isEmpty()) {
			throw new IllegalArgumentException("sobrenome inválido");
		}
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if(salario <=0) {
			throw new IllegalArgumentException("Salário inválido");
		}
		this.salario = salario;
	}
	public String nomeCompleto() {
		return 	nome+" "+sobrenome;
	}
	public double salarioanual() {
	 return	this.getSalario() * 12;
	}
	
	public void aumentoSalario(double aux) {
		setSalario(getSalario()*(1+(aux/100))); 
	}
	
	@Override
	public String toString() {
		return "O funcionario "+nomeCompleto()+" recebe atualmente "
				+ "R$"+this.getSalario()+", passara a receber R$"+this.salario;
	}
}
