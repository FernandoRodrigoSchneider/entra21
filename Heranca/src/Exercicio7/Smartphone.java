package Exercicio7;

public class Smartphone extends Computador {
	
	private int operadora;
	private boolean cameraFrontal;

	public Smartphone(String modelo, double ram, double armazenamento, int operadora,boolean cameraFrontal) {
		super(modelo, ram, armazenamento);
		 setOperadora(operadora);
		 setCameraFrontal(cameraFrontal);
		 
	}

	public int getOperadora() {
		return operadora;
	}

	public void setOperadora(int operadora) {
		this.operadora = operadora;
	}

	public boolean isCameraFrontal() {
		return cameraFrontal;
	}

	public void setCameraFrontal(boolean cameraFrontal) {
		this.cameraFrontal = cameraFrontal;
	}

	@Override
	public boolean rodarAplicacao(String aux1) {

		if (aux1.endsWith(".apk")) {
			return true;
		}
		
		return false;
		
		
	}
	public boolean tirarSelfie() {
		/*if ( cameraFrontal == true) {
			return true; 
		}
		else {
			return false;
		}*/
		return this.cameraFrontal;
	}
	public boolean ligar(int aux4) {
		String aux5 = ""; 
		aux5 = aux4 + aux5;
		String aux6 = "";
		aux6 = getOperadora() + aux6;
		//if (aux5.charAt(0)== aux6.charAt(0)) {
		if (aux5.startsWith(aux6)	) {
			return true;
		}
		return false;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", operadora: "+this.getOperadora()+", Camera frontal: "+this.cameraFrontal;
	}

}
