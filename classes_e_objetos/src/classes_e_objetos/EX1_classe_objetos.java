package classes_e_objetos;

/*Em uma classe denominada Pessoa, deseja-se manter o nome, sexo, data de nascimento e estado civil de uma pessoa.
O sexo deve ser definido como um caracter.
A data deve ser definida como String.
Crie 2 objetos de Pessoa.*/
public class EX1_classe_objetos {

	public static void main(String[] args) {
		Pessoa fernando = new Pessoa();

		fernando.nome = "Fernando";
		fernando.sexo = 'M';
		fernando.estadoCivil = "Casado";

		System.out.println(fernando.nome + " do sexo " + fernando.sexo + " é " + fernando.estadoCivil);
		Pessoa Ana = new Pessoa();

		Ana.nome = "Ana";
		Ana.sexo = 'F';
		Ana.estadoCivil = "Casado";

		System.out.println(Ana.nome + " do sexo " + Ana.sexo + " é " + Ana.estadoCivil);

	}

}
