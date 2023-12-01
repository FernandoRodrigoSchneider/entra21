package Exercicio2;

public class Aves extends Primatas {

	private String corPenas;
	private String tipoAlimentacao;
	
	public Aves(String raca, String nomeID, String porte, String habitat, String paisOrigem, String corPenas, String tipoAlimentacao) {
		super(raca, nomeID, porte, habitat, paisOrigem);
		setCorPenas(corPenas);
		setTipoAlimentacao(tipoAlimentacao);
		
		
	
	}

	public String getCorPenas() {
		return corPenas;
	}

	public void setCorPenas(String corPenas) {
		this.corPenas = corPenas;
	}

	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}

	public void setTipoAlimentacao(String tipoAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
	}
@Override
public String toString() {
	
	return super.toString()+", plumagem: "+this.getCorPenas()+", tipo de alimentação: "+this.getTipoAlimentacao();
}
	
}
