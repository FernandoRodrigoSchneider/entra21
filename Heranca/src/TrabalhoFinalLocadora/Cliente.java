package TrabalhoFinalLocadora;

public class Cliente {
	private String nome;
	private String cpf;
	private Endereco endereco;
	private boolean situacao;
	public Cliente(String nome, String cpf, Endereco endereco, boolean situacao) {
		
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
		setSituacao(situacao);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

}
