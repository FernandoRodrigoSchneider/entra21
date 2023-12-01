package classes_e_objetos_2;

import java.util.ArrayList;
import java.util.List;

public class ex8_Velocidade {

	private double velocidade;//atributo
	public static List<ex8_Velocidade> listaVelocidade = new ArrayList<>();

	public ex8_Velocidade(double velocidade) {

		setVelocidade(velocidade);
		listaVelocidade.add(this);
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
//metodos
	public void acelerar(double acel) {
		if (acel < 0 || acel >= 20) {
			System.out.println("Não foi possível acelerar");
			this.velocidade =this.getVelocidade();
		} else {
			this.velocidade =this.getVelocidade() + acel;
		}
	}
//metodos
	public void reduzir(double red) {
		if (red < 0 || red >= 30) {
			System.out.println("Não foi possível reduzir");
			this.velocidade = this.getVelocidade();
		} else {
			this.velocidade = this.getVelocidade() - red;
		}
	}

	@Override
	public String toString() {
		return "O carro está a " + this.getVelocidade() + "Km/h";
	}
}
