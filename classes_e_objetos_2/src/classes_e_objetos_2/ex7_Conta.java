package classes_e_objetos_2;

import java.util.ArrayList;
import java.util.List;

public class ex7_Conta {// objeto(correto seria chamar de entidade) - sempre com letra maiuscula
	//toda entidade é uma classe, mas nem toda classe é uma identidade
	//qualquer tipo de classe tem metodos
	//toda entidade tem metodos e pode ter metodos especificos
	
//sempre private - priva para proteger os atributos - encapsular
	private String nome;// atributos
	private double saldo;// atributos
	public static List<ex7_Conta> listaConta = new ArrayList<>();

	public ex7_Conta(String nome, double saldo) { // construtor - vai executar quando o objeto é criado
//tudo que não pode ser vazio entra no construtor //passo os dados que vão preencher os atributos nos parametros
//usar o set para previnir os erros		
		setNome(nome);
		setSaldo(saldo);
		listaConta.add(this);
	}

//get para mostrar o valor do atributo
	public String getNome() {
		return nome;
	}

//set define o valor para um atributo - validação tratamento
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
		else {
			throw new IllegalArgumentException("Nome invalido");
		}

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depConta(double dep) {//metodo para depositar
		this.saldo = this.getSaldo() + dep;

	}

	public void saqueConta(double saque) {// metodo para sacar
		this.saldo = this.getSaldo() - saque;

	}

	public void tranferencia(double transf) {// metodo para transferencia

		this.saldo = this.getSaldo() + transf;
		// if (this.saldo < 0) {
		// this.saldo=this.saldo*(-1);
		// }
	}
}
