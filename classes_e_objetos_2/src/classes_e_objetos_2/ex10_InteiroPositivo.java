package classes_e_objetos_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ex10_InteiroPositivo {
	

	private int numeroX;
	public static List<ex10_InteiroPositivo> listaInteiro = new ArrayList<>();

	public ex10_InteiroPositivo(int numeroX) {

		setNumeroX(numeroX);
		listaInteiro.add(this);

	}

	public int getNumeroX() {
		return numeroX;
	}

	public void setNumeroX(int numeroX) {
		if (numeroX < 0) {
			throw new IllegalArgumentException("Número invalido");
		}

		this.numeroX = numeroX;
	}

	public int fatorial() {
		int aux = 1;
		for (int i = 0; i < numeroX; i++) {
			aux *= (numeroX - i);
		}
		return aux;
	}
	public Collection<Integer> divisor() {
		Collection<Integer> aux = new LinkedList<Integer>();
		for (int i = 1; i <= numeroX; i++) {
			if (numeroX % i == 0) {
				aux.add(i);	
			}
			
		}
		//System.out.println(aux);
		return aux;
	}
}