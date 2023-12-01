package Simulado;

import java.util.ArrayList;
import java.util.List;

public class Simulado_conta {

	private String nome;
	private String categoria;
	private int anoCadastro;
	private double saldo;
	private String gerente;
	public static List<Simulado_conta> ListaConta = new ArrayList<>();
	
	public Simulado_conta(String nome, String categoria, int anoCadastro, double saldo, String gerente) {
		
		setNome(nome);
		setCategoria(categoria);
		setAnoCadastro(anoCadastro);
		setSaldo(saldo);
		setGerente(gerente);
		ListaConta.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isBlank() || nome.isEmpty()) {
			throw new IllegalArgumentException("nome inválido");
		}
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		if (categoria == null || categoria.isBlank() || categoria.isEmpty()) {
			throw new IllegalArgumentException("Categoria inválida");
		}
		this.categoria = categoria;
	}

	public int getAnoCadastro() {
		return anoCadastro;
	}

	public void setAnoCadastro(int anoCadastro) {
		this.anoCadastro = anoCadastro;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		if (gerente == null || gerente.isBlank() || gerente.isEmpty()) {
			throw new IllegalArgumentException("Gerente inválido");
		}
		this.gerente = gerente;
	}
	public double rendimento(int meses) {
		double retorno = this.getSaldo();
		for (int i = 0; i < meses; i++) {
			retorno *=  1.07;
		}
		return retorno;
	}
	
@Override
public String toString() {
	return "Cliente "+this.getNome()+" com conta aberta em "+this.getAnoCadastro()+""
			+ " com a categoria de conta "+this.getCategoria()+
			", tem como seu gerente "+ this.getGerente()+" possui saldo de R$"+this.getSaldo();
}
	
}
