package Exercicio1;

public class Circulo {

	private String cor;
	private double raio;

	public Circulo(String cor, double raio) {
		
		setCor(cor);
		setRaio(raio);

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		if (cor != null && !cor.isBlank()) {
		this.cor = cor;
	}else {
		throw new IllegalArgumentException("Cor invalida");
	}
	}

	public double getRaio() {
		
		return raio;
	}

	public void setRaio(double raio) {
		if (raio > 0) {
			this.raio = raio;
		}
		else {
			throw new IllegalArgumentException("Raio invalido");
		}
		
	}
	public double area() {
		return 3.1416 *(raio*raio);
	}
@Override
	public String toString () {
	 return "cor "+this.getCor()+" com uma area de "+this.area();
}
	

}
