package classes_e_objetos;

/*Sendo assim, deve-se calcular o imposto a pagar do seguinte modo:
Imposto a pagar = Renda Anual * Alíquota
Nível de Renda Anual     Alíquota
0 a 4.000                  0%
4.001 a 9.000              5,8%
9.001 a 25.000             15%
25.001 a 35.000            27,5%
acima de 35.000            30%

Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.

Calcule:
a) Quem mais paga imposto.
b) Quem menos paga imposto.
c) Qual o total de imposto pago entre os 5 contribuintes?*/
public class EX7_classes_objetos {

	public static void main(String[] args) {

		ex7_imposto_renda pessoa1 = new ex7_imposto_renda("Fernando", "0000000001", "SC", 1000);
		ex7_imposto_renda pessoa2 = new ex7_imposto_renda("Ana", "00000000002", "SC", 60000);
		ex7_imposto_renda pessoa3 = new ex7_imposto_renda("Lucas", "00000000003", "SC", 10000);
		ex7_imposto_renda pessoa4 = new ex7_imposto_renda("Gabriel", "00000000004", "SC", 10000);
		ex7_imposto_renda pessoa5 = new ex7_imposto_renda("Vilma", "00000000005", "SC", 1000);

		ex7_imposto_renda[] vetorIRPF = new ex7_imposto_renda[5];
		vetorIRPF[0] = pessoa1;
		vetorIRPF[1] = pessoa2;
		vetorIRPF[2] = pessoa3;
		vetorIRPF[3] = pessoa4;
		vetorIRPF[4] = pessoa5;

		double maisImposto = Integer.MIN_VALUE;
		double menosImposto = Integer.MAX_VALUE;
		double somaImposto = 0;
		int indicemais=0;
		int indicemenos=0;
		String nomeMaisImposto = "";
		String nomeMenosImposto = "";
		

		for (int i = 0; i < vetorIRPF.length; i++) {
			somaImposto += vetorIRPF[i].ImpostoPagar();
			if (vetorIRPF[i].ImpostoPagar() > maisImposto) {
				maisImposto = vetorIRPF[i].ImpostoPagar();
				nomeMaisImposto = vetorIRPF[i].getNome();
				indicemais = i;
			}
			if(vetorIRPF[i].ImpostoPagar() <= menosImposto ) {
				menosImposto = vetorIRPF[i].ImpostoPagar();
				nomeMenosImposto = vetorIRPF[i].getNome();
				indicemenos = i;
			}
		}
		System.out.println("a pessoa que mais pagou imposto foi "+vetorIRPF[indicemais].toString());
		System.out.println("a pessoa que menos pagou imposto foi "+vetorIRPF[indicemenos].toString());
		System.out.println("A soma dos impostos pagos foi de "+somaImposto);
		/*System.out.println(nomeMaisImposto + " " + maisImposto);
		
		System.out.println(nomeMenosImposto+" "+menosImposto);
		System.out.println(pessoa1.toString());*/

	}
}
