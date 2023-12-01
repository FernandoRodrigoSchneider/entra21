package Exercicio5;
//classe pai abstrata
public abstract class Embarcacao {

	private String id;
	private String modelo;
	private int qtdPessoas;
	private double capCombustivel;
	private double consumoCombustivel;
	private int qtdBotesSalvaVidas;
	private double velmax;

	public Embarcacao(String id, String modelo, int qtdPessoas, double capCombustivel, double consumoCombustivel,
			int qtdBotesSalvaVidas, double velmax) {
		setId(id);
		setModelo(modelo);
		setQtdPessoas(qtdPessoas);
		setCapCombustivel(capCombustivel);
		setConsumoCombustivel(consumoCombustivel);
		setQtdBotesSalvaVidas(qtdBotesSalvaVidas);
		setVelmax(velmax);
	}

	public double getVelmax() {
		return velmax;
	}

	public void setVelmax(double velmax) {
		this.velmax = velmax;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

	public int getQtdBotesSalvaVidas() {
		return qtdBotesSalvaVidas;
	}

	public void setQtdBotesSalvaVidas(int qtdBotesSalvaVidas) {
		this.qtdBotesSalvaVidas = qtdBotesSalvaVidas;
	}

	public boolean planejarViagem(double aux1) {
		double aux2 = capCombustivel / consumoCombustivel;
		boolean aux3 = true;
		String aux4 = "";
		if (aux1 < aux2) {
			if(aux3 == true)
				aux4 = "combuetivel suficiente para a viagem";
			return aux3;
		} else {
			return false;
		}

	}
	public abstract String varificaSeguranca();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
