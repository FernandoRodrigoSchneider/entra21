package TrabalhoFinalLocadora;

import java.time.LocalDate;

public class fichaLocacao extends Locadora{
	private LocalDate dataLoc;
	private int totDias;
	private double valorTotal;

	public fichaLocacao(Cliente cliente,Jogo jogo, LocalDate dataLoc,int totDias, double valorTotal) {
		super(cliente, jogo);
		setDataLoc(dataLoc);
		settotDias(totDias);
		setValorTotal(valorTotal);
	}
	public LocalDate getDataLoc() {
		return dataLoc;
	}
	public void setDataLoc(LocalDate dataLoc) {
		this.dataLoc = dataLoc;
	}
	public int gettotDias() {
		return totDias;
	}
	public void settotDias(int totDias) {
		LocalDate aux=LocalDate.now();
		this.totDias =aux.getDayOfMonth()+totDias;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	@Override
	public void calcularValor() {
		double aux=super.getJogo().getValorLocacao();
		aux=aux*gettotDias();
		setValorTotal(aux);
		
	}

}
