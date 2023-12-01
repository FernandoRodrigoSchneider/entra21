package locadora;

public class cliente {
	private String nome;
	private String cpf;
	private endereco endereco;
	private boolean situacao;

	// Construtor da classe cliente
	public cliente(String nome, String cpf, endereco endereco, boolean situacao) {//construtor do cliente e seus atributos
		super();
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
		setSituacao(situacao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {// seta o nome do cliente inserido no construtor
		if (nome.isBlank() || nome.isEmpty()) {
			throw new IllegalArgumentException("O nome do cliente está vazio");//mensagem de erro caso a váriavel esteja vazia
		} else {
			this.nome = nome;//seta caso a váriavel não esteja vazia
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {// seta o cpf do cliente inserido no construtor
		if (cpf.isBlank() || cpf.isEmpty()) {//mensagem de erro caso a váriavel esteja vazia
			throw new IllegalArgumentException("O cpf do cliente está vazio");
		} else {
			this.cpf = cpf;//seta caso a váriavel não esteja vazia
		}
	}

	public endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(endereco endereco) {
		this.endereco = endereco;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {

		this.situacao = situacao;
	}

}
