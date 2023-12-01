package classes_e_objetos;
/*O código a seguir foi escrito por um programador descuidado que, após tê-lo escrito, perdeu o código original da classe Cidade.
Verifique o trecho de código abaixo, e escreva qual seria o código necessário da classe.
Cidade gaspar = new Cidade();
gaspar.nome( "Gaspar" );
gaspar.uf( "SC" );
gaspar.populacaoMasculina( 28141 );
 Cidade indaial = new Cidade();
indaial.nome( "Indaial" );
indaial.populacaoFeminina( 25844 );
indaial.calculado( true );*/

public class EX5_classes_objetos {

	public static void main(String[] args) {

		ex5_cidade gaspar = new ex5_cidade("Gaspar", "S.C", 28141, 30100, true);
		ex5_cidade Indaial = new ex5_cidade("Indaial", "S.C", 26000,25844, true);

	System.out.println(gaspar.nome);
	}

}
