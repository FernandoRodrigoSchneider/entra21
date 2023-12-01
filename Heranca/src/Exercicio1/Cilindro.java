package Exercicio1;

public class Cilindro extends Circulo {
	
	private double altura;

	public Cilindro(String cor, double raio, double altura) {
		super(cor, raio);
		setAltura (altura);
//setAltura(altura);
	
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;		}
		else {
			throw new IllegalArgumentException("altura invalida");
		}
		
	}
	public double volume() {
		return area() * altura;
	}
	@Override
	public String toString () {
	 return super.toString()+" com um volume de "+this.volume();
}
	
}
