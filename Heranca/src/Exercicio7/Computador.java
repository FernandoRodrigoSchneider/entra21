package Exercicio7;

import java.security.PublicKey;

public abstract class Computador {

	private String modelo;
	private double ram;
	private double armazenamento;
	
	public Computador(String modelo, double ram, double armazenamento) {
		
		setModelo(modelo);
		setRam(ram);
		setArmazenamento(armazenamento);
	
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	public double getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(double armazenamento) {
		this.armazenamento = armazenamento;
	}
	public String onOff (boolean aux2 ) {
		if (aux2 == true) {
			return "Ligando ";
		}
		else {
			return "Desligando ";
		}
	}
	public abstract boolean rodarAplicacao (String aux1);  
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "modelo: "+this.getModelo()+", Ram: "+ this.getRam()+", armazenamento: "+this.getArmazenamento();
}	
}
