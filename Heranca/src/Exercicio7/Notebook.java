package Exercicio7;

public class Notebook extends Computador {

	private double peso;
	
	public Notebook(String modelo, double ram, double armazenamento, double peso) {
		super(modelo, ram, armazenamento);
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public boolean rodarAplicacao(String aux1) {

		if (aux1.endsWith(".exe")) {
			return true;
		}
		
		return false;
	}
	public void aumentarRam(double aux3) {
		
		this.setRam(this.getRam() + aux3);
		}

	
	
}
