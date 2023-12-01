package TrabalhoFinalLocadora;

import java.time.LocalDate;

public class Jogo {
	private String id;
	private String nomeDoJogo;
	private double valorLocacao;
	private LocalDate dataLancamento;
	private int estoque;
	private String plataforma;
	public Jogo(String id, String nomeDoJogo, double valorLocacao, LocalDate dataLancamento, int estoque,
			String plataforma) {
		
		setId(id);
		setNomeDoJogo(nomeDoJogo);
		setValorLocacao(valorLocacao);
		setDataLancamento(dataLancamento);
		setEstoque(estoque);
		setPlataforma(plataforma);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomeDoJogo() {
		return nomeDoJogo;
	}
	public void setNomeDoJogo(String nomeDoJogo) {
		this.nomeDoJogo = nomeDoJogo;
	}
	public double getValorLocacao() {
		return valorLocacao;
	}
	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
	public LocalDate getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	} 

}
