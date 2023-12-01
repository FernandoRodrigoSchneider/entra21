package locadora;

import java.time.LocalDate;

public class fichaLocacao extends locadora {// estende da classe abstrata locadora
	private LocalDate dataLoc;
	private int totDias;
	private double valorTotal;
	private int num;

	public fichaLocacao(cliente cliente, jogo jogo, LocalDate dataLoc, int totDias) {// construtor fichadeLocaçao e seus
																						// atributos
		super(cliente, jogo);// super ele herda o construtor e os atributos da classe locadora
		setDataLoc(dataLoc);// data da locação
		settotDias(totDias);// total de dias da locação
		// TODO Auto-generated constructor stub
	}

	public LocalDate getDataLoc() {
		return dataLoc;
	}

	public void setDataLoc(LocalDate dataLoc) {
	//	if (dataLoc == null || dataLoc == LocalDate.of(0, 0, 0)) {
		//	throw new IllegalArgumentException("Data inválida");
		//} else {
			this.dataLoc = dataLoc;
		//}
	}

	public int gettotDias() {
		return totDias;
	}

	public void settotDias(int totDias) {
		this.totDias = totDias;
	}

	public LocalDate diaRetorno() {
		LocalDate aux = LocalDate.now();
		return aux.plusDays(this.totDias);

	}

	public double getValorTotal() {
		return valorTotal;

	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public double calcularValor() {

		if (super.getJogo().getEstoque() > 0) {//compara para verificar se tem jogo no estoque, chama o get estoque da classe jogo
			// int aux=super.getJogo().getEstoque()-1;
			// super.getJogo().setEstoque(aux);
			retiraEstoque();//chamar o metodo retirar estoque
			double aux1 = super.getJogo().getValorLocacao();//variavel auxiliar  que chama o valor da locação da classe jogo
			aux1 = aux1 * gettotDias();//multiplica o valor da locaçao do jogo com o total de dias
			return aux1;//retorna o aux1 com o valor total da locação

		} else {//caso não tenha no estoque, retorna 0 e não executa nenhum calculo
			return 0;
		}
	}

	public void retiraEstoque() {//metodo para retirar do estoque
		int aux = super.getJogo().getEstoque() - 1;
		super.getJogo().setEstoque(aux);
	}

	// }
	public String toString() {
		if (super.getJogo().getEstoque() > 0 && super.getCliente().isSituacao()) {
			
				return super.toString() + " com previsão de retorno para dia " + diaRetorno() + " total a pagar "
						+ calcularValor();
			}
		if(!super.getCliente().isSituacao()) {
			return super.getCliente().getNome()+" está com pendências, locação não liberada.";
		} 
		else {
			return "Não é possível alugar";
		}
		
	}
}
