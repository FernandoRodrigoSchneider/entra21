package Exercicio5;

public class Lancha extends Embarcacao {

	public Lancha(String id, String modelo, int qtdPessoas, double capCombustivel, double consumoCombustivel,
			int qtdBotesSalvaVidas, double velMax) {
		super(id, modelo, qtdPessoas, capCombustivel, consumoCombustivel, qtdBotesSalvaVidas, velMax);

	}

	@Override
	public String varificaSeguranca() {

		return "Alerta, embarcação precisa de mais botes";

	}

}
