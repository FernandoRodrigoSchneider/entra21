package Exercicio4;
//classe pai abstrata
public  abstract class Animal {

	
	private String especie;
	private boolean estimacao;
	private double peso;
	
	public Animal(String especie, boolean estimacao, double peso) {
		
		setEspecie(especie);
		setEstimacao(estimacao);
		setPeso(peso);
		
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		if (especie != null && !especie.isBlank()) {
			this.especie = especie;
		}else {
			throw new IllegalArgumentException("especie invalida");
		}
	}

	public boolean isEstimacao() {
		return estimacao;
	}

	public void setEstimacao(boolean estimacao) {
		this.estimacao = estimacao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso>0) {
			this.peso = peso;

		}
		
	}
	//td que esta em italico é abstrato
	//metoso abstrato não tem corpo
	//
	public abstract String som(); 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Especie: "+this.especie+", Peso: "+this.getPeso()+
				", estimação: "+this.isEstimacao();
	}
	
	
}
