package Exercicio2;

public class Gatos_Selvagens extends Primatas {

	private String corPelagem;
	private String tiposManchas;
	
	public Gatos_Selvagens(String raca, String nomeID, String porte, String habitat, String paisOrigem, String corPelagem, String tiposManchas) {
		super(raca, nomeID, porte, habitat, paisOrigem);
		
		setCorPelagem(corPelagem);
		setTiposManchas(tiposManchas);
		
	}



	public String getCorPelagem() {
		return corPelagem;
	}

	public void setCorPelagem(String corPelagem) {
		this.corPelagem = corPelagem;
	}

	public String getTiposManchas() {
		return tiposManchas;
	}

	public void setTiposManchas(String tiposManchas) {
		this.tiposManchas = tiposManchas;
	}
	@Override
	public String toString() {

		return super.toString()+", cor da pelagem: "+this.getCorPelagem()+", tipos de manchas: "+this.getTiposManchas();
	}
}