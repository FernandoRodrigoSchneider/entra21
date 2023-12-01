package classes_e_objetos;

public class ex7_imposto_renda {

	private String nome;
	private String cpf;
	private String uf;
	private double renda;

	public ex7_imposto_renda(String nome, String cpf, String uf, double renda) {
		
		setNome(nome);
		setCpf(cpf);
		setUf(uf);
		setRenda(renda);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isBlank() || nome.isEmpty() || nome == null) {
			System.out.println("erro");
		} else {
			this.nome = nome;
		}
	}

	public String getCpf() {

		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf.isBlank() || cpf.isEmpty() || cpf == null) {
			System.out.println("erro");

		} else {
			this.cpf = cpf;
		}
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf.isBlank()||uf.isEmpty()||uf == null) {
			System.out.println("erro");

		} else {
			this.uf = uf;
		}
		
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}
	public double ImpostoPagar() {
		if (renda > 35000) {
			return (renda * 0.3);
		}else if (renda > 25001) {
			return (renda * 0.275);
		}else if (renda > 9001) {
			return (renda * 0.15);
		}else if (renda >4001) {
			return (renda * 0.058);
		}else {
		return renda * 0;
		}
	}
	@Override
	public String toString() {
		return "a pessoa de nome "+this.getNome()+" de cpf "+
	this.getCpf()+" do estado de "+this.getUf()+" com a renda"
			+ " de "+this.getRenda();
	}

}










