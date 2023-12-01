package classes_e_objetos_2;

import java.util.Scanner;

public class EX12_Classes_objetos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ex12_labInfo pc1 = new ex12_labInfo("SN001", "Intel Core i7-13700KF",5.4, 512, 16, 500, 850);
		ex12_labInfo pc2 = new ex12_labInfo("SN002", "AMD Ryzen 9 5950X",4.9, 1000, 32, 500, 1000);
		ex12_labInfo pc3 = new ex12_labInfo("SN003", "Intel Core i5-9400F",4.1, 256, 8, 400, 600);
		ex12_labInfo pc4 = new ex12_labInfo("SN004", "AMD Ryzen 7 3700X",4.4, 512, 16, 450, 550);
		// System.out.println(pc3.isOverclock());
	
		System.out.println("informe o numero de serie do PC para fazer o overclock");
		String numSerie = in.next();
		System.out.println("Informe o valor do overclock");
		double valorOver = in.nextDouble();
		
		for (ex12_labInfo i : ex12_labInfo.listalabInfo) {
			if (i.getNumeroDeSerie().equals(numSerie)) {
				i.oClock(valorOver);
				System.out.println(i.getNumeroDeSerie()+" "+i.getClockDoProcessador()+" "+i.getConsumoDeEnergia());
			}
			
		}
	
	}

}
/*a) Um método que faça overclock no processador.
O método deve ter como parâmetro o incremento em MHz que será feito de overclock.
Os processadores só aceitam overclock até 10% do clock original.
A cada 100 MHz que o clock sobe, o consumo do computador aumenta em 75W.
O consumo do computador nunca deve ultrapassar 95% da potência da fonte.
Note que o processador somente aceitará overclock caso a variável booleana de overclock for true.
Caso não seja possível fazer o overclock, por qualquer uma das limitações, informe por que não foi 
possível.
*/
