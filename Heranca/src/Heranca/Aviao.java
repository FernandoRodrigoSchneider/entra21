package Heranca;

//td o que eu tenho a classe pai eu consigo utilizar na classe filho
//classe filho, que herda
//abrasileirando , o objeto filho extende do objeto pai
public class Aviao extends Veiculo {

	private int numMotores;
	private int numAsas;

	public Aviao(String modelo, double peso, double comprimento, double velMax, int passageiros, int numMotores,
			int numAsas) {
		super(modelo, peso, comprimento, velMax, passageiros);
		this.numMotores = numMotores;
		this.numAsas = numAsas;
	}

	public int getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}

	public int getNumAsas() {
		return numAsas;
	}

	public void setNumAsas(int numAsas) {
		this.numAsas = numAsas;
	}

}
