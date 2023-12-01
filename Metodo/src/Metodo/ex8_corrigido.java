package Metodo;

public class ex8_corrigido {

	public static void generateStarWarsName(
			String nome, String sobrenome, String sobrenomeMae, String cidade) {
// 3 primeiras letras do sobrenome e duas primeiras letras de seu nome
//Character.toString(sobrenome.charAt(0));
String nomeGerado =Character.toString(sobrenome.charAt(0)) +
		Character.toString(sobrenome.charAt(1)) + 
		Character.toString(sobrenome.charAt(2)) + 
		Character.toString(nome.charAt(0)) 
		+  Character.toString(nome.charAt(1));

String sobrenomeGerado = Character.toString(sobrenomeMae.charAt(0)) + 
		Character.toString(sobrenomeMae.charAt(1))+
		Character.toString(cidade.charAt(0)) +
		Character.toString(cidade.charAt(1)) +
		Character.toString(cidade.charAt(2));

System.out.println(nomeGerado + " " + sobrenomeGerado);
}

public static void main(String[] args) {
/*
 * George Lucas utiliza uma fórmula para criar os nomes dos personagens em suas
 * histórias (Jar Jar Binks, ObiWan Kenobi, etc). A fórmula, supostamente, é:
 * 
 * Seu primeiro nome na série Star Wars: i.Pegue as três primeiras letras de seu
 * sobrenome ii.Adicione a ele as duas primeiras letras de seu nome
 * 
 * Seu sobrenome na série Star Wars: i.Pegue as duas primeiras letras do
 * sobrenome de solteira de sua mãe ii.Adicione a ele as três primeiras letras
 * do nome da cidade onde você nasceu
 * 
 * Crie um método chamado generateStarWarsName que gera um nome completo Star
 * Wars conforme descrito. Printe o seu nome Star Wars
 * 
 * As entradas serão os nomes completos.
 */
generateStarWarsName("Sara", "Rubio", "Bevilaqua", "Gaspar");
}

}