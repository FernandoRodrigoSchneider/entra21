package Exercicio8;

import java.time.LocalDate;

import java.util.List;

public  abstract class Funcionario {
	
	private String id;
	private Endereço endereco;
	private LocalDate dataDeNascimento;
	private String nome;
	private double salario;
	private LocalDate dataIngresso;
	private List<String> habilidades;
	
	
	public Funcionario(String id, Endereço endereco, LocalDate dataDeNascimento, String nome, double salario,
			LocalDate dataIngresso, List<String> habilidades) {
		super();
		setId(id);
		setEndereco(endereco);
		setDataDeNascimento(dataDeNascimento);
		setNome(nome);
		setSalario(salario);
		setDataIngresso(dataIngresso);
		setHabilidades(habilidades);
	}
	
	public Endereço getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereço endereco) {
		this.endereco = endereco;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public LocalDate getDataIngresso() {
		return dataIngresso;
	}
	public void setDataIngresso(LocalDate dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	public List<String> getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}
	public int getIdade() {
		getDataDeNascimento().compareTo(LocalDate.now());
		//para achar a idade
		return getDataDeNascimento().compareTo(LocalDate.now());
	}
	public double calcularSalarioAnual() {
		 return getSalario() * 12;
		
	}
	public void adicionarHabilidades(String aux1) {
		this.habilidades.add(aux1);
		 
		
	}
	public int calcularAnosDeEmpresa() {
		getDataIngresso().compareTo(LocalDate.now());
		return getDataIngresso().compareTo(LocalDate.now());
	} 

}
