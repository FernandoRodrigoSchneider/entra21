package Exercicio4;

public class Cachorro extends Animal {

	private String raca;
	
	public Cachorro(String especie, boolean estimacao, double peso, String raca) {
		super(especie, estimacao, peso);

		setRaca(raca);
	}
//metodos abstratos seram obrigatoriamente impletmentados nos filhos
	//aqui eles passam a terum corpo
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		if (raca != null && !raca.isBlank()) {
			this.raca = raca;
		}else {
			throw new IllegalArgumentException("raça invalida");
		}
	}

	
	@Override
	public String som() {
		// TODO Auto-generated method stub
		return "auau";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", som: "+som();
	}
	
}
