package classes_e_objetos;

import java.util.Set;

public class ex6_aviao {

	private String nomeAeronave;
	private int passageiors;
	private int velMax;
	private int capComb;
	private int consumoMinuto;
	
	public ex6_aviao(String nomeAeronave, int passageiors, int velMax, int capComb, int consumoMinuto) {
		setNomeAeronave(nomeAeronave);
		setPassageiors(passageiors); 
		setVelMax(velMax);
		setCapComb(capComb);
		setConsumoMinuto(consumoMinuto);
		
	}

	public String getNomeAeronave() {
		return nomeAeronave;
	}

	public void setNomeAeronave(String nomeAeronave) {
		if (nomeAeronave.isBlank() || nomeAeronave.isEmpty() ||
				nomeAeronave == null) {
			System.out.println("erro, nome incalido");
		}else {
		this.nomeAeronave = nomeAeronave;
		}
	}

	public int getPassageiors() {
		return passageiors;
	}

	public void setPassageiors(int passageiors) {
		this.passageiors = passageiors;
	}

	public int getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	public int getCapComb() {
		return capComb;
	}

	public void setCapComb(int capComb) {
		this.capComb = capComb;
	}

	public int getConsumoMinuto() {
		return consumoMinuto;
	}

	public void setConsumoMinuto(int consumoMinuto) {
		this.consumoMinuto = consumoMinuto;
	}
	
	public double CalculaTempoVoo() {
		return (capComb / consumoMinuto);
	}

	public double MaximaDistancia() {
		return (CalculaTempoVoo() * velMax);
	}
	}
	

