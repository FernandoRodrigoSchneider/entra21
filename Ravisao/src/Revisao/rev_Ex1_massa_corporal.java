package Revisao;

import java.text.DecimalFormat;
import java.util.Scanner;

/*1. O índice de massa corporal (IMC) é uma medida internacional usada para calcular se um pessoa está no peso ideal. O IMC é determinado pela 
 * divisão da massa do indivíduo pelo quadrado de sua altura, onde a massa está em quilogramas e a altura está em metros, de acordo com a fórmula: 
IMC = Massa / Altura² 
Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a seguinte tabela: 
< 18.5 Magreza 
18.5 – 24.9 Saudável *
25.0 – 29.9 Sobrepeso *
30.0 – 34.9 Obesidade Grau I 
35.0 – 39.9 Obesidade Grau II (severa) 
> 40.0 Obesidade Grau III (morbida)*/
public class rev_Ex1_massa_corporal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Informe seu peso:");
		double peso = in.nextDouble();
		System.out.println("Informe sua altura:");
		double altura = in.nextDouble();

		double imc  = peso / (altura * altura);
		// System.out.println(imc);
		String aux = "";
		DecimalFormat fmt = new DecimalFormat ("0.00");

		if (imc < 18.5) {
			aux = "Magreza";
		}
		if (imc <= 24.9 && imc >= 18.5) {
			aux = "Saudável";
		}
		if (imc <= 29.9 && imc >= 25) {
			aux = "Sobrepeso";
		}
		if (imc <= 34.9 && imc >= 30) {// 30.0 – 34.9 Obesidade Grau I
			aux = "Obesidade Grau I";
		}
		if (imc <= 39.9 && imc >= 35) {// 35.0 – 39.9 Obesidade Grau II (severa)
			aux = "Obesidade Grau II (severa)";
		}
		if (imc >= 40) {// 40.0 Obesidade Grau III (morbida)
			aux = "Obesidade Grau III (morbida)";
		}
		System.out.println("O resultado do IMC de " + fmt.format(imc) + " é " + aux);
	}

}
