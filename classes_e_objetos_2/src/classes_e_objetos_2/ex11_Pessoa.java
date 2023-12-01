package classes_e_objetos_2;

import java.util.ArrayList;
import java.util.List;

public class ex11_Pessoa {

	private String nome;
	private String endereco;
	public static List<ex11_Pessoa> listapessoa = new ArrayList<>();
	
	public ex11_Pessoa(String nome, String endereco) {
		
		
		setNome(nome);
		setEndereco(endereco);
		listapessoa.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@ Override
	public String toString() {
		return "A pessoa de nome "+ this.getNome()+", mora no endereço "+this.getEndereco(); 
	} 
}
