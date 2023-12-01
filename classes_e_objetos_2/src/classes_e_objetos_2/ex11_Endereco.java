package classes_e_objetos_2;

import java.util.ArrayList;
import java.util.List;

public class ex11_Endereco {

	private String logradouro;
	private String complemento;
	private int numero;
	
	public static List<ex11_Endereco> listaEndereco = new ArrayList<>();
	
	public ex11_Endereco(String logradouro, String complemento, int numero) {
		
		setLogradouro(logradouro);
		setComplemento(complemento);
		setNumero(numero);
		listaEndereco.add(this);
		
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
