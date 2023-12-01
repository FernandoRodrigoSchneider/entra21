package Exercicio4;

public class Gato extends Animal {
	
	private boolean castrado;
	
	public Gato(String especie, boolean estimacao, double peso,boolean castrado ) {
		super(especie, estimacao, peso);
		setCastrado(castrado);
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	@Override
	public String som() {
		// TODO Auto-generated method stub
		return "miau";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", som: "+som();
	}

	
}
