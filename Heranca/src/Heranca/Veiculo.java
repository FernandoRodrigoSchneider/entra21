package Heranca;

//super class ou classe pai
public class Veiculo {
	// privat o filho precisa utilzar get e set
	private String modelo;
	// protected o filho ainda consegue usar sem estar encapsulado
	// protected double peso;
	private double peso;
	private double comprimento;
	private double velMax;
	private int passageiros;

	public Veiculo(String modelo, double peso, double comprimento, double velMax, int passageiros) {

		this.modelo = modelo;
		this.peso = peso;
		this.comprimento = comprimento;
		this.velMax = velMax;
		this.passageiros = passageiros;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getVelMax() {
		return velMax;
	}

	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
public String verificaLimite (int qutPassageiro) {
	if (qutPassageiro > passageiros) {
		return "passou do limite";
		
	} else {
	return "não passou do limite";
		
	}
}

}
/*
 * Crie um String metodo que recebe com parametro um quantidade de passageiros e
 * verifica se é mais ou menos que o limite, retorno se é mais ou menos que o
 * limite
 */
