package classes_e_objetos;
/*Crie uma classe denominada Mercado.

Essa classe terá 4 atributos, as informações que deverão ser guardadas são:
Número de maçãs vendidas por ano.
Preço de venda das maçãs.
Número de laranjas vendidas por ano.
Preço de venda das laranjas.

Crie 3 objetos da classe Mercado chamados:

unidadeDeBlumenau
unidadeDeJoinville
unidadeDeFlorianopolis*/
public class mercado {

	int numMacas;
	double precoMacas;
	int numLaranja;
	double precoLaranja;
	String unidade;

	
	public mercado(int numMacas, double precoMacas, int numLaranja, double precoLaranja, String unidade) {
		super();
		this.numMacas = numMacas;
		this.precoMacas = precoMacas;
		this.numLaranja = numLaranja;
		this.precoLaranja = precoLaranja;
		this.unidade = unidade;
	}
	public double lucroMacas() {
		return numMacas * precoMacas;
	}
	public double lucrolaranjas() {
		return numLaranja * precoLaranja;
	}
	public double lucroTotal() {
		return lucroMacas() + lucrolaranjas();
	}
}
