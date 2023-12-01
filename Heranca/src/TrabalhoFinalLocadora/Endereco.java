package TrabalhoFinalLocadora;

public class Endereco {
	private String pais;
	private String estado;
	private String cidade;
	private String logradouro;
	private String numeroCasa;
	public Endereco(String pais, String estado, String cidade, String logradouro, String numeroCasa) {
		
		setPais(pais);
		setEstado(estado);
		setCidade(cidade);
		setLogradouro(logradouro);
		setNumeroCasa(numeroCasa);
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	

}
