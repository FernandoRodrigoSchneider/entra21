package classes_e_objetos_2;

import java.util.ArrayList;
import java.util.List;

public class ex12_labInfo {

	 private String numeroDeSerie;
	 private String modeloDoProcessador;
	 private double clockDoProcessador;// em GHz
	 private boolean overclock;
	 private int armazenamentoHD;
	 private int memoriaRAM;
	 private double consumoDeEnergia;
	 private int potenciaDaFonte;
	 public static List<ex12_labInfo> listalabInfo = new ArrayList<>();
	 
	public ex12_labInfo(String numeroDeSerie, String modeloDoProcessador, double clockDoProcessador,
			int armazenamentoHD, int memoriaRAM, int consumoDeEnergia, int potenciaDaFonte) {
		
		setNumeroDeSerie(numeroDeSerie);
		setModeloDoProcessador(modeloDoProcessador);
		
		if (getModeloDoProcessador().endsWith("K")||getModeloDoProcessador().endsWith("X")||getModeloDoProcessador().endsWith("KF")) {
			overclock = true;
		}else {
			overclock = false;
		}
		
		setClockDoProcessador(clockDoProcessador);
		setArmazenamentoHD(armazenamentoHD);
		setMemoriaRAM(memoriaRAM);
		setConsumoDeEnergia(consumoDeEnergia);
		setPotenciaDaFonte(potenciaDaFonte);
		listalabInfo.add(this);
	}

	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public String getModeloDoProcessador() {
		return modeloDoProcessador;
	}

	public void setModeloDoProcessador(String modeloDoProcessador) {
		this.modeloDoProcessador = modeloDoProcessador;
	}

	public double getClockDoProcessador() {
		return clockDoProcessador;
	}

	public void setClockDoProcessador(double clockDoProcessador) {
		this.clockDoProcessador = clockDoProcessador;
	}

	public boolean isOverclock() {
		return overclock;
	}

	public void setOverclock(boolean overclock) {
		this.overclock = overclock;
	}

	public int getArmazenamentoHD() {
		return armazenamentoHD;
	}

	public void setArmazenamentoHD(int armazenamentoHD) {
		this.armazenamentoHD = armazenamentoHD;
	}

	public int getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(int memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public double getConsumoDeEnergia() {
		return consumoDeEnergia;
	}

	public void setConsumoDeEnergia(int consumoDeEnergia) {
		this.consumoDeEnergia = consumoDeEnergia;
	}

	public int getPotenciaDaFonte() {
		return potenciaDaFonte;
	}

	public void setPotenciaDaFonte(int potenciaDaFonte) {
		this.potenciaDaFonte = potenciaDaFonte;
	}
	public void  oClock(double valor ) {
		System.out.println(overclock);
		double aux = 0;
		double aux1 =0; 
		double aux2 = 0;
		double aux3 = 0;
		if (overclock == true) {
			aux1 = this.clockDoProcessador;//5,4
			aux = aux1 * (1+(valor/100));
			this.clockDoProcessador = aux;
			aux2  = aux - aux1;
			this.consumoDeEnergia = this.getConsumoDeEnergia() + (aux2 * 75);
			aux3 = this.getPotenciaDaFonte()* 0.95; 
			if (this.getConsumoDeEnergia() > aux3) {
				System.out.println("O consumo de energia exede o disponivel pela sua fonte atual");
			}
			
		}
	}

}
