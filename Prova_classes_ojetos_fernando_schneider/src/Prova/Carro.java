package Prova;

import java.util.ArrayList;
import java.util.List;

public class Carro {

	private String modelo;
	private String marca;
	private String placa;
	private String cor;
	private int ano;
	private double preco;
	private int localizaçao;
	public static List<Carro> ListaCarro = new ArrayList<>();
	
	public Carro(String modelo, String marca, String placa, String cor, int ano, double preco, int localizaçao) {
		
		setModelo(modelo);
		setMarca(marca);
		setPlaca(placa);
		setCor(cor);
		setAno(ano);
		setPreco(preco);
		setLocalizaçao(localizaçao);
		ListaCarro.add(this);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank() || modelo.isEmpty()) {
			throw new IllegalArgumentException("Gerente inválido");
		}
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca == null || marca.isBlank() || marca.isEmpty()) {
			throw new IllegalArgumentException("Gerente inválido");
		}
		
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		if (placa == null || placa.isBlank() || placa.isEmpty()) {
			throw new IllegalArgumentException("Gerente inválido");
		}
		this.placa = placa;
	}

	public String getCor() {
		
		return cor;
	}

	public void setCor(String cor) {
		if (cor == null || cor.isBlank() || cor.isEmpty()) {
			throw new IllegalArgumentException("Gerente inválido");
		}
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
	
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		
		this.preco = preco;
	}

	public int getLocalizaçao() {
		return localizaçao;
	}

	public void setLocalizaçao(int localizaçao) {
		this.localizaçao = localizaçao;
	}
	public double depreciacao() {
		double retorno = getPreco();
		double tempoFab = 0;
		if (getAno() < 2010) {
			tempoFab = (2023-getAno());
			for (int i = 0; i < tempoFab; i++) {
				retorno -= retorno*0.07;
			}
			
			return retorno;
		}
		
		else {
			tempoFab = (2023-getAno());
			for (int i = 0; i < tempoFab; i++) {
				retorno -= retorno*0.05;
			}
			
			return retorno;
		}
		
	}
	
@Override
public String toString() {
	return "O carro modelo "+this.getModelo()+" da marca "+this.getMarca()+
			", placa "+this.getPlaca()+" de cor "+this.getCor()+" fabricado em "
			+this.getAno()+" no valor de R$"+this.getPreco()+" localizado na região "+
			this.getLocalizaçao();
}
	
}
