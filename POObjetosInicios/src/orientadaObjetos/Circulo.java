package orientadaObjetos;

public class Circulo {
	 private double radio;
	 private Punto2D centro;
	 
	 public Circulo(double radio, Punto2D centro) {
		 this.radio= radio;
		 this.centro = centro;
	 }
	 public Circulo(double radio) {
		 this.radio= radio;
		 this.centro = new Punto2D();
	 }
	 

	 public Punto2D getCentro() {
		return centro;
	 }

	 public void setCentro(Punto2D centro) {
		this.centro = centro;
	 }

	 public double getRadio() {
		return radio;
	 }

	 public void setRadio(double radio) {
		this.radio = radio;
	 }
	 
	 public String toString() {
		 return String.format("Centro: %s radio: %.2f , this.centro.toString()");
	 }
	 
	 public double getArea() {
		 return Math.PI * Math.pow(this.radio, 2);
	 }
	 
	 public double getPerimetro() {
		 return Math.PI * this.radio;
	 }
	 public void desplazar(double dx, double dy ) {
		 this.centro.setX((float) (this.centro.getX() + dx));
		 this.centro.setY((float) (this.centro.getY() + dy));
	 }
	 public double distanciaALCentro(Punto2D p) {
		 double dx = Math.pow(this.centro.getX() - p.getX(),2);
		 double dy = Math.pow(this.centro.getY() - p.getY(),2);
		 return Math.sqrt(dy + dx);
	 }
	 


}
