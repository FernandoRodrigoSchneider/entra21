package classes_e_objetos_2;

import java.util.ArrayList;
import java.util.List;

public class ex1_retangulo {

	private double altura;
	private double largura;
	public static List<ex1_retangulo> listaRetangulo = new ArrayList<>();

	public ex1_retangulo(double altura, double largura) {

		setAltura(altura);
		setLargura(largura);
		listaRetangulo.add(this);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura <= 0) {
			System.out.println("Altura inválida");
		} else {
			this.altura = altura;
		}
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if (largura <= 0) {
			System.out.println("Largura inválida");
		} else {
			this.largura = largura;
		}
	}

	public double area() {
		return (this.getAltura() * this.getLargura());
	}

	public double perimetro() {
		return ((2 * this.getAltura()) + (2 * this.getLargura()));
	}

	@Override
	public String toString() {
		return "o retangulo de altura " + this.getAltura() + " e largura " + this.getLargura() + " com " + "a area de "
				+ this.area() + " e perimetro de " + this.perimetro();
	}

}
