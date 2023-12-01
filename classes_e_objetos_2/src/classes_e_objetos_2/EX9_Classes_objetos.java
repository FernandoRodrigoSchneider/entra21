package classes_e_objetos_2;

import java.util.ArrayList;
import java.util.List;

/*A Câmara Municipal de Vereadores de Blumenau pretende realizar uma estatística sobre o desempenho dos seus parlamentares.
Para cada um dos 15 vereadores, ela possui o nome, partido, quantidade de projetos apresentados, quantidade de projetos aprovados. 
O desempenho é calculado da seguinte forma: 
(projetos aprovados / projetos apresentados) * índice de trabalho. 
Se não apresentou nenhum projeto, o desempenho é 0 (zero).

O índice de trabalho é definido pela seguinte tabela:
Projetos apresentados 		Índice de trabalho
01 – 05 			0,80
06 – 10 			1,00
11 – 17 			1,08
acima de 17 			1,22

Escreva um programa Java que leia os dados disponíveis pela Câmara e imprima o nome, partido e desempenho do vereador.

Imprima:
a) o total de projetos apresentados e de aprovados na câmara;

b) o nome, partido e desempenho do vereador com mais projetos aprovados;

c) o nome, partido e desempenho do vereador com menor desempenho;

d) o nome, partido e desempenho dos vereadores cujo desempenho seja maior que o desempenho médio de toda a câmara;
*/
public class EX9_Classes_objetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex9_Camara v1 = new ex9_Camara("lad1", "PT", 20, 1);
		ex9_Camara v2 = new ex9_Camara("lad2", "PT", 25, 1);
		ex9_Camara v3 = new ex9_Camara("lad3", "PT", 33, 1);
		ex9_Camara v4 = new ex9_Camara("lad4", "PT", 4, 1);
		ex9_Camara v5 = new ex9_Camara("lad5", "PT", 5, 1);
		ex9_Camara v6 = new ex9_Camara("ont1", "PL", 6, 1);
		ex9_Camara v7 = new ex9_Camara("ont2", "PL", 7, 2);
		ex9_Camara v8 = new ex9_Camara("ont3", "PL", 8, 3);
		ex9_Camara v9 = new ex9_Camara("ont4", "PL", 10, 5);
		ex9_Camara v10 = new ex9_Camara("ont5", "PL", 15, 7);
		ex9_Camara v11 = new ex9_Camara("muro1", "MR", 20, 2);
		ex9_Camara v12 = new ex9_Camara("muro2", "MR", 15, 1);
		ex9_Camara v13 = new ex9_Camara("muro3", "MR", 7, 1);
		ex9_Camara v14 = new ex9_Camara("muro4", "MR", 10, 2);
		ex9_Camara v15 = new ex9_Camara("muro5", "MR", 3, 1);

		int somaApresentado = 0;
		int somaAprovado = 0;
		double somaDesempenho= 0;
		double maisAprovados = Integer.MIN_VALUE;
		double menorDesempenho = Integer.MAX_VALUE;
		ex9_Camara indice1 = null;
		ex9_Camara indice2 = null;


		for (ex9_Camara i : ex9_Camara.listaCamara) {
			somaApresentado += i.getProjApresentado();
			somaAprovado += i.getProjAprovado();
			somaDesempenho += i.desempenho();
			if (i.getProjAprovado() > maisAprovados){
				maisAprovados = i.getProjAprovado();
				indice1 = i;
				//System.out.println("mais projetos aprovados "+maisAprovados);
			}
			if (i.desempenho() < menorDesempenho){
				menorDesempenho = i.desempenho();
				indice2 = i;
				//System.out.println("Vereador com menor desempenho "+menorDesempenho);
			}
			

		}
		double media = somaDesempenho / 15;
		System.out.println("media "+media);
		System.out.println("o total de projetos apresentados é " + somaApresentado);
		System.out.println("o total de projetos aprovados é " + somaAprovado);
		System.out.println("mais projetos aprovados "+indice1.toString());
		System.out.println("Vereador com menor desempenho "+indice2.toString());
		
		List<ex9_Camara> listaCamara2 = new ArrayList<>();
		for (ex9_Camara j : ex9_Camara.listaCamara) {
			if (j.desempenho() > media) {
				listaCamara2.add(j);
				//System.out.println("teve desmpenho acima da média "+j.toString());
			}
		}
		for (int i = 0; i < listaCamara2.size(); i++) {
			System.out.println(listaCamara2.get(i));
		}
		
	}
}
