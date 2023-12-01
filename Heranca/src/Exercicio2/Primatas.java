package Exercicio2;

public class Primatas {

	private String raca; 
	private String nomeID;
	private String porte;
	private String habitat;
	private String paisOrigem;
	
	public Primatas(String raca, String nomeID, String porte, String habitat, String paisOrigem) {
		
		setRaca(raca);
		setNomeID(nomeID);
		setPorte(porte);
		setHabitat(habitat);
		setPaisOrigem(paisOrigem);
		}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		if (raca != null && !raca.isBlank()) {
			this.raca = raca;
		}else {
			throw new IllegalArgumentException("Raça invalida");
		}
	}

	public String getNomeID() {
		return nomeID;
	}

	public void setNomeID(String nomeID) {
		if (nomeID != null && !nomeID.isBlank()) {
			this.nomeID = nomeID;
		}else {
			throw new IllegalArgumentException("nome invalido");
		}
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		if (porte != null && !porte.isBlank()) {
			this.porte = porte;
		}else {
			throw new IllegalArgumentException("porte invalido");
		}
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		if (habitat != null && !habitat.isBlank()) {
			this.habitat = habitat;
		}else {
			throw new IllegalArgumentException("habitat invalido");
		}
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		if (paisOrigem != null && !paisOrigem.isBlank()) {
			this.paisOrigem = paisOrigem;
		}else {
			throw new IllegalArgumentException("Origem invalida");
		}
	}
	@Override
	public String toString() {

		return "raça: "+this.raca+ ", nome: "+this.getNomeID()+", porte: "+this.porte+", habitat: "+this.getHabitat()+", origem: "+this.getPaisOrigem();
	}
}
