package locadora;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class jogo {
	private String iDJogo;
	private String nomeJogo;
	private double valorLocacao;
	private LocalDate dataLanc;
	private int estoque;
	private String plataforma;
	
	
	public jogo(String iDJogo, String nomeJogo, double valorLocacao, LocalDate dataLanc, int estoque, String plataforma) {
		setiDJogo(iDJogo);;
		setNomeJogo(nomeJogo);;
		setValorLocacao(valorLocacao);;
		setDataLanc(dataLanc);;
		setEstoque(estoque);;
		setPlataforma(plataforma);
	}
	public String getiDJogo() {
		return iDJogo;
	}
	public void setiDJogo(String iDJogo) {
		this.iDJogo = iDJogo;
	}
	public String getNomeJogo() {
		return nomeJogo;
	}
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	public double getValorLocacao() {
		return valorLocacao;
	}
	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
	public LocalDate getDataLanc() {
		return dataLanc;
	}
	public void setDataLanc(LocalDate dataLanc) {
		this.dataLanc = dataLanc;
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
	

