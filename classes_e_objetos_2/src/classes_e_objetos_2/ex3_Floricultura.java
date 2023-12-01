package classes_e_objetos_2;

import java.util.ArrayList;
import java.util.List;

public class ex3_Floricultura {

	private String nomeFlor;
	private double preco;
	private String nomeCliente;
	private char presente;
	public static List<ex3_Floricultura> ListaFloricultura = new ArrayList<>();

	public ex3_Floricultura(String nomeFlor, double preco, String nomeCliente, char presente) {

		setNomeFlor(nomeFlor);
		setPreco(preco);
		setNomeCliente(nomeCliente);
		setPresente(presente);
		ListaFloricultura.add(this);
	}

	public String getNomeFlor() {
		return nomeFlor;
	}

	public void setNomeFlor(String nomeFlor) {
		this.nomeFlor = nomeFlor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public char getPresente() {
		return presente;
	}

	public void setPresente(char presente) {
		this.presente = presente;
	}
	@Override
	public String toString() {
		return "quem comprou foi "+this.getNomeCliente()+" e"
				+ " o nome da flor é "+this.getNomeFlor();
				
	}
	
	
	
}
