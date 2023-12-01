package locadora;

public class endereco {
	private String pais;
	private String estado;
	private String cidade;
	private String lougradouro;
	private String numeroCasa;

	public endereco(String pais, String estado, String cidade, String lougradouro, String numeroCasa) {//construtor endereço e seus atributos
		super();
		setPais(pais);
		setEstado(estado);
		setCidade(cidade);
		setLougradouro(lougradouro);
		setNumeroCasa(numeroCasa);
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {// seta o atributo pais
		if (pais.isBlank() || pais.isEmpty()) {// mensagem de erro caso a váriavel esteja vazia
			throw new IllegalArgumentException("Pais está vazio");
		} else {
			this.pais = pais;// seta caso a váriavel não esteja vazia
		}
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {// seta o atributo estado
		if (estado.isBlank() || estado.isEmpty()) {
			throw new IllegalArgumentException("Estado está vazio");// mensagem de erro caso a váriavel esteja vazia
		} else {
			this.estado = estado;// seta caso a váriavel não esteja vazia
		}
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {// seta o atributo cidade
		if (cidade.isBlank() || cidade.isEmpty()) {// mensagem de erro caso a váriavel esteja vazia
			throw new IllegalArgumentException("cidade está vazio");
		} else {// seta caso a váriavel não esteja vazia
			this.cidade = cidade;
		}
	}

	public String getLougradouro() {
		return lougradouro;
	}

	public void setLougradouro(String lougradouro) {// seta o atributo lougradouro
		if (lougradouro.isBlank() || lougradouro.isEmpty()) {// mensagem de erro caso a váriavel esteja vazia
			throw new IllegalArgumentException("logradouro está vazio");
		} else {
			this.lougradouro = lougradouro;// seta caso a váriavel não esteja vazia
		}
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {// seta o atributo casa
		if(numeroCasa.isBlank()||numeroCasa.isBlank()) {// mensagem de erro caso a váriavel esteja vazia
			throw new IllegalArgumentException("casa está vazia");
		}else {
		this.numeroCasa = numeroCasa;// seta caso a váriavel não esteja vazia
		}
	}

}
