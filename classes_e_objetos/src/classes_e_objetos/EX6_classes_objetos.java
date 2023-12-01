package classes_e_objetos;

/*Faça uma classe chamada Aeronave.
Com os atributos:
Passageiros.
Velocidade máxima.
Capacidade de combustível.
Queima de combustível por minuto.
Crie 4 objetos de sua preferência.
Calcule:
a) Qual das aeronaves pode ficar no ar por mais tempo?
b) Qual aeronave leva o maior número de passageiros?
c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe?*/
public class EX6_classes_objetos {

	public static void main(String[] args) {

		ex6_aviao aviao1 = new ex6_aviao("Aviao1", 100, 600, 5000, 150);
		ex6_aviao aviao2 = new ex6_aviao("Aviao2", 200, 700, 6000, 165);
		ex6_aviao aviao3 = new ex6_aviao("Aviao3", 300, 800, 8000, 180);

		ex6_aviao[] vetorAviao = new ex6_aviao[3];
		vetorAviao[0] = aviao1;
		vetorAviao[1] = aviao2;
		vetorAviao[2] = aviao3;

		double maiorTempoVoo = Integer.MIN_VALUE;
		int maispassageiros = Integer.MIN_VALUE;
		double maiorDistancia = Integer.MIN_VALUE;
		String aviaoMaiorTempoVoo = "";
		String aviaoMaisPassageiros = "";
		String aviaoMaxDistancia = "";

		for (int i = 0; i < vetorAviao.length; i++) {
			if (vetorAviao[i].CalculaTempoVoo() > maiorTempoVoo) {
				maiorTempoVoo = vetorAviao[i].CalculaTempoVoo();
				aviaoMaiorTempoVoo = vetorAviao[i].getNomeAeronave();
			}
		}
		for (int i = 0; i < vetorAviao.length; i++) {
			if (vetorAviao[i].getPassageiors() > maispassageiros) {
				maispassageiros = vetorAviao[i].getPassageiors();
				aviaoMaisPassageiros = vetorAviao[i].getNomeAeronave();
			}
		}
		for (int i = 0; i < vetorAviao.length; i++) {
			if (vetorAviao[i].MaximaDistancia() > maiorDistancia) {
				maiorDistancia = vetorAviao[i].MaximaDistancia();
				aviaoMaxDistancia = vetorAviao[i].getNomeAeronave();
			}
		}
		System.out.println(maiorTempoVoo);
		System.out.println(aviaoMaiorTempoVoo);
		System.out.println(maispassageiros);
		System.out.println(aviaoMaisPassageiros);
		System.out.println(maiorDistancia);
		System.out.println(aviaoMaxDistancia);
	}

}
