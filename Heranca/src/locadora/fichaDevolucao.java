package locadora;

import java.time.LocalDate;

public class fichaDevolucao extends fichaLocacao{//estende a classe fichadelocacao
	private LocalDate datadevolucao;
	
	public fichaDevolucao(cliente cliente,jogo jogo,LocalDate dataLoc,int totDias,LocalDate datadevolucao) {//construtor fichaDevolucao e seus atributos
		super(cliente, jogo, dataLoc,totDias);//super ele herda o construtor e os atributos da classe ficha locacao
		setDatadevolucao(datadevolucao);//data de devolução
		// TODO Auto-generated constructor stub
	}
	public LocalDate getDatadevolucao() {
		return datadevolucao;
	}

	public void setDatadevolucao(LocalDate datadevolucao) {//seta a data de devolucao
		this.datadevolucao = datadevolucao;
	}


	@Override
	public double calcularValor() {//Metodo herdado da classe fichalocacao 
		LocalDate aux10 = getDatadevolucao();//salva na váriavel auxiliar puxando os dados do getDatadevolucao
		if(aux10.minusDays(this.gettotDias()) != getDataLoc()) {//diminui o total de dias com o dia da devoluçaão e compara com a data de locação, se os dias não forem iguais há multa
			return aux10.compareTo(diaRetorno())*super.getJogo().getValorLocacao();
		}
		
		return 0;//retorna 0 se não houver atraso
		
	}
	public void devolverJogo() {//metodo para devolver jogo no estoque
		int aux=1+super.getJogo().getEstoque();//add o jogo somando 1 para o estoque da classe jogo, utilizando váriavel aux
		super.getJogo().setEstoque(aux);//seta o estoque com a quantidade atualizada
	}
	public String toString() {
		devolverJogo();//chama o metodo devolver jogo
		return super.toString()+" devolvido dia "+getDatadevolucao();
	}
	
}
