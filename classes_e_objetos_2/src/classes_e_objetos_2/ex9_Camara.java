package classes_e_objetos_2;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class ex9_Camara {//entidade ou objeto
	
//atributos
	private String nome;
	private String partido;
	private double projApresentado;
	private double projAprovado;
	public static List<ex9_Camara> listaCamara = new ArrayList<>();

	public ex9_Camara(String nome, String partido, int projApresentado, int projAprovado) {

		setNome(nome);
		setPartido(partido);
		setProjApresentado(projApresentado);
		setProjAprovado(projAprovado);
		listaCamara.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public double getProjApresentado() {
		return projApresentado;
	}

	public void setProjApresentado(int projApresentado) {
		this.projApresentado = projApresentado;
	}

	public double getProjAprovado() {
		return projAprovado;
	}

	public void setProjAprovado(int projAprovado) {
		this.projAprovado = projAprovado;
	}

	public double indiceTrabalho() {//função tem retorno metodo não
		if (this.projApresentado >= 17 ) {
			return 1.22;
			
		}
		else if (this.projApresentado >= 10 ) {
			return 1.08;
		}
		else if (this.projApresentado >= 5 ) {
			return 1.00;
		}
		else if (this.projApresentado >= 1 ) {
			return 0.80;

		} else {
			return 0.00;		}
	}

	public double desempenho() {
		return (this.projAprovado / this.projApresentado) * this.indiceTrabalho();

	}
	
	@Override
	public String toString() {
		return "O vereador "+this.getNome()+" do "
				+ "partido "+this.getPartido()+" teve um "
						+ "desempenho de "+this.desempenho();
	}
}
