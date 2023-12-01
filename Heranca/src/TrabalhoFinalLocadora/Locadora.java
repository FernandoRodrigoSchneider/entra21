package TrabalhoFinalLocadora;

public abstract class Locadora {
	private Cliente cliente;
	private Jogo jogo;
	public Locadora(Cliente cliente, Jogo jogo) {
		super();
		this.cliente = cliente;
		this.jogo = jogo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Jogo getJogo() {
		return jogo;
	}
	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
	public abstract void calcularValor();

}
