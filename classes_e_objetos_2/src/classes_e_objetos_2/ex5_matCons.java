package classes_e_objetos_2;

import java.util.ArrayList;
import java.util.List;
/*1 -definir o nome do meu objeto
 * possui atributos - caracteristicas- os tipos (string, int ,boolean)
 * possui metodos - cada objeto tem suas funções (ideia de trabalho)
 */
//isto é um objeto(não possui metodo main
public class ex5_matCons {//nome do objeto - iniciar o nome com letra maiuscula
//atributos = nome , tipo = string.....
//todo atributo deve ser private
	private String nome;
	private String descricao;
	private double preco;
	private double peso;
	private int estoque;
	public static List<ex5_matCons> listaMatCons = new ArrayList<>();

	public ex5_matCons(String nome, String descricao, double preco, double peso, int estoque) {

		setNome(nome);
		setDescricao(descricao);
		setPreco(preco);
		setPeso(peso);
		setEstoque(estoque);
		listaMatCons.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	// auterar o estoque
	public void auteraEstoque(int autEst) {
		setEstoque(getEstoque() + autEst);
	}

	public void venda(int qtdVenda) {
		if (qtdVenda > getEstoque()) {
			System.out.println("Estoque insuficiente.");
		} else {
			setEstoque(qtdVenda - getEstoque());
		}
	}
	public double pesoTotal() {
		return this.getPeso() * this.getEstoque();
	}
	
	public double promocao(double desc) {
		return this.getPreco() * (1+(desc/100));
	}
	@Override
	public String toString() {
		return this.getNome() + " de valor R$"+ this.getPreco()+", de peso "+this.getPeso()+"Kg";
		
	}

}
