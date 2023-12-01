package Exercicio5;

public class Transatlantico extends Embarcacao {

	private int anoBatismo;
	private int capBoteSalvaVidas;

	public Transatlantico(String id, String modelo, int qtdPessoas, double capCombustivel, double consumoCombustivel,
			int qtdBotesSalvaVidas, double velmax, int anoBatismo, int capBoteSalvaVidas) {
		super(id, modelo, qtdPessoas, capCombustivel, consumoCombustivel, qtdBotesSalvaVidas, velmax);

		setAnoBatismo(anoBatismo);
		setCapBoteSalvaVidas(capBoteSalvaVidas);

	}

	public int getAnoBatismo() {
		return anoBatismo;
	}

	public void setAnoBatismo(int anoBatismo) {
		this.anoBatismo = anoBatismo;
	}

	public int getCapBoteSalvaVidas() {
		return capBoteSalvaVidas;
	}

	public void setCapBoteSalvaVidas(int capBoteSalvaVidas) {
		this.capBoteSalvaVidas = capBoteSalvaVidas;
	}

	@Override
	public String varificaSeguranca() {
		int aux1 = getQtdBotesSalvaVidas() * getCapBoteSalvaVidas();

		if (aux1 >= getQtdPessoas()) {

			return "Botes ok";

		} else {
			return "Alerta, embarcação precisa de ais botes";

		}

	}

}
