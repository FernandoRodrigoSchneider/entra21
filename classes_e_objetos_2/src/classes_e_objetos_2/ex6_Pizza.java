package classes_e_objetos_2;

import java.util.ArrayList;
import java.util.List;

public class ex6_Pizza {
	
	private String Nome;
	private String ing1;
	private String ing2;
	private String ing3;
	private boolean borda;
	private double diametro;
	private double preco;
	
	public static List<ex6_Pizza> ListaPizza = new ArrayList<>();
	
	public ex6_Pizza(String nome, String ing1, String ing2, String ing3, boolean borda,double diametro, double preco) {
		
		setNome(nome);
		setIng1(ing1);
		setIng2(ing2);
		setIng3(ing3);
		setBorda(borda);
		setDiametro(diametro);
		setPreco(preco);
		ListaPizza.add(this);
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getIng1() {
		return ing1;
	}

	public void setIng1(String ing1) {
		this.ing1 = ing1;
	}

	public String getIng2() {
		return ing2;
	}

	public void setIng2(String ing2) {
		this.ing2 = ing2;
	}

	public String getIng3() {
		return ing3;
	}

	public void setIng3(String ing3) {
		this.ing3 = ing3;
	}

	public boolean isBorda() {
		return borda;
	}

	public void setBorda(boolean borda) {
		this.borda = borda;
	}
	
}
