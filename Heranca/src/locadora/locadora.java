package locadora;

import java.util.ArrayList;
import java.util.List;

public abstract class locadora {
	private cliente cliente;
	private jogo jogo;
	
	public locadora(cliente cliente,jogo jogo) {
		setCliente(cliente);
		setJogo(jogo);
	}
	public cliente getCliente() {
		return cliente;
	}
	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}
	public jogo getJogo() {
		return jogo;
	}
	public void setJogo(jogo jogo) {
		this.jogo = jogo;
	}
	public abstract double calcularValor();
	
	public String toString() {
		return cliente.getNome()+" alugou o jogo "+jogo.getNomeJogo();
	}
}
