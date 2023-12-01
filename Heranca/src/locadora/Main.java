package locadora;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		//Endereços
		endereco ed1=new endereco("Brasil","Sc","Blumenau","Rua Joinville","77");
		endereco ed2=new endereco("Brasil","Sc","Blumenau","Rua São Bernardo","89");
		endereco ed3=new endereco("Brasil","Sc","Gaspar","Rua Garopaba","189");
		endereco ed4=new endereco("Brasil","Sc","Indaial","Rua DR. Blumenau","1036");
		
		//Clientes
		cliente cl1=new cliente("Eduardo","CL001",ed1,true);
		cliente cl2=new cliente("Fernando","CL001",ed2,true);
		cliente cl3=new cliente("Lucas","CL001",ed3,true);
		cliente cl4=new cliente("Gabriel","CL001",ed4,false);
		//Jogos
		jogo jogo1=new jogo("P01","GTA5",10,LocalDate.of(2013,5,27),2,"ps5");
		jogo jogo2=new jogo("X01","GTA5",10,LocalDate.of(2013,5,27),1,"X-one");
		jogo jogo3=new jogo("S01","Zelda",10,LocalDate.of(2013,5,27),0,"Switch");
		jogo jogo4=new jogo("P02","GOW",10,LocalDate.of(2013,5,27),-1,"ps5");

		//teste retirando do estoque
		fichaLocacao ficha1=new fichaLocacao(cl1, jogo1, LocalDate.now(), 2);
		fichaLocacao ficha2=new fichaLocacao(cl2, jogo1, LocalDate.now(), 3);
		System.out.println(ficha1.toString());
		System.out.println(ficha2.toString());
		System.out.println("o jogo "+jogo1.getNomeJogo()+" possui "+jogo1.getEstoque()+" copias em estoque");
		
		//teste incluindo no estoque
		fichaDevolucao fichadev1=new fichaDevolucao(cl1, jogo1, LocalDate.of(2023, 11, 10),2,LocalDate.of(2023, 11, 12));
		System.out.println(fichadev1.toString());
		System.out.println("o jogo "+jogo1.getNomeJogo()+" possui "+jogo1.getEstoque()+" copias em estoque");
		
		//teste de multa por atraso
		fichaDevolucao fichadev2=new fichaDevolucao(cl1, jogo1, LocalDate.of(2023, 11, 10),2,LocalDate.of(2023, 11, 14));
		System.out.println(fichadev2.toString());
		System.out.println("o jogo "+jogo1.getNomeJogo()+" possui "+jogo1.getEstoque()+" copias em estoque");
		
		//teste locando jogo sem estoque
		fichaLocacao ficha3=new fichaLocacao(cl3, jogo3, LocalDate.now(), 3);
		System.out.println(ficha3.toString());
		System.out.println("o jogo "+jogo3.getNomeJogo()+" possui "+jogo3.getEstoque()+" copias em estoque");
		//fichaDevolucao fichadev1=new fichaDevolucao(cl1, jogo1, LocalDate.of(2023, 11, 9),2,LocalDate.of(2023, 11, 14));
		
		//teste de situação
		fichaLocacao ficha4=new fichaLocacao(cl4, jogo2, LocalDate.now(), 3);
		System.out.println(ficha4.toString());
		
		//teste de estoque negativo
		fichaLocacao ficha5=new fichaLocacao(cl3, jogo4, LocalDate.now(), 3);
		System.out.println(ficha5.toString());
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
