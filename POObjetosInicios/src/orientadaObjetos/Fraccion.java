package orientadaObjetos;

public class Fraccion {
	private int numerador;
	private int denominador;
	
	public Fraccion() {
		this.setNumerador(1);
		this.setDenominador(1);
	}
	public Fraccion( int numerador) {
		this.setNumerador(numerador);
		this.setDenominador(1);
	}
	public Fraccion( int numerador, int denominador ) {
		this.setNumerador(numerador);
		this.setDenominador(denominador);
	}
	public Fraccion( Fraccion numerador, Fraccion denominador ) {
		this.setNumerador(0);
	}
	
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		if (numerador != 0) {
			this.numerador = numerador;	
		}
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		if(denominador != 0) {
			this.denominador = denominador;	
		}
	}
	public String toString() {
		return String.format("%d,%d", this.numerador , this.denominador);
	}
}

