package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class ex2_principal {

	public static void main(String[] args) {

		
		List<Primatas> listaPrimatas = new ArrayList<>();
		List<Aves> listaAves = new ArrayList<>();
		List<Gatos_Selvagens> listaGatos_Selvagens = new ArrayList<>();

		
		listaPrimatas.add(new Primatas("Gorila", "Gor1", "Grande", "Floresta", "Centro da Africa"));
		listaPrimatas.add(new Primatas("Chimpanze", "Ch1", "Medio", "Floresta", "Centro Africa"));
		listaPrimatas.add(new Primatas("Macaco prego", "MP1", "Pequeno", "Floresta", "America do sul"));
		listaAves.add(new Aves("Arara Vermelha", "Arr1", "medio", "Floresta", "Brasil", "Vermelha", "Sementes e frutas"));
		listaAves.add(new Aves("Tucano", "tuc1", "medio", "Floresta", "Brasil", "Preta", "Sementes e frutas"));
		listaAves.add(new Aves("Aracuan", "Arc1", "medio", "Floresta", "Brasil", "marrom", "Sementes e frutas"));
		listaGatos_Selvagens.add(new Gatos_Selvagens("Onça pintada", "on1", "Grande", "Floresta", "Brasil", "Pardo", "Pintado"));
		listaGatos_Selvagens.add(new Gatos_Selvagens("Leão", "le1", "grande", "Savana", "Africa", "Pardo", "ausente de manchas"));
		listaGatos_Selvagens.add(new Gatos_Selvagens("Lince", "li1", "medio", "floresta", "america do norte e Asia", "pardo", "listras"));
		
		//System.out.println(listaGatos_Selvagens.get(0));
		//imprime de forma individual a linha especifica indicada

		for (Primatas i : listaPrimatas) {
			System.out.println(i.toString());

		}
		for (Aves i : listaAves) {
			System.out.println(i.toString());

		}
		for (Gatos_Selvagens i : listaGatos_Selvagens) {
			System.out.println(i.toString());

		}
		
		//ou fazer a lista desta forma
		List<Primatas> ListaDeAnimais = new ArrayList<>();
		
		ListaDeAnimais.add(new Primatas("gggg1", "Gor1", "Grande", "Floresta", "Centro da Africa"));
		ListaDeAnimais.add(new Aves("a11111 Vermelha", "Arr1", "medio", "Floresta", "Brasil", "Vermelha", "Sementes e frutas"));
		ListaDeAnimais.add(new Gatos_Selvagens("o11111 pintada", "on1", "Grande", "Floresta", "Brasil", "Pardo", "Pintado"));
	}

}
