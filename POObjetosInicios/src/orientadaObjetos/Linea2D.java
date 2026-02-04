package orientadaObjetos;

public class Linea2D {
	private Punto2D punto1;
	private Punto2D punto2;

	public Linea2D( Punto2D punto1, Punto2D punto2) {
		this.punto1 = new Punto2D();
		this.punto2 = new Punto2D();
	}

	public Punto2D getpunto1() {
		return this.punto1;
	}

	public Punto2D getpunto2() {
		return this.punto2;
	}

	public void setpunto1(Punto2D punto1) {
		this.punto1 = punto1;
	}

	public void setpunto2(Punto2D punto2) {
		this.punto2 = punto2;
	}
	public void setpunto1(float x , float y) {
		this.punto1.setX(x);
		this.punto1.setY(y);
	}
	public void setpunto2(float x , float y) {
		this.punto2.setX(x);
		this.punto2.setY(y);
	}

	public String toString() {
		return String.format("[%s , %s]", this.punto1, this.punto2);
	}
	public double getLongitud() {
		double distanciaX = this.punto2.getX() - this.punto1.getX();
		double distanciaY = this.punto2.getY() - this.punto1.getY();
		return (Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2)));
	}
	
	public double getPendiente() {
		float diffX = this.punto2.getX() - this.punto1.getX();
		if(diffX == 0) {
			return Double.NaN;	
		}else {
			float diffY = this.punto2.getY() - this.punto1.getY();
			return diffY/diffX;
		}
	}
	
	public static boolean sonParalelas(Linea2D linea1, Linea2D linea2) {
		return linea1.getPendiente() == linea2.getPendiente();
	}
	
	public void desplazar (float desplazarX, float desplazarY) {
		this.punto1.setX(this.punto1.getX()+ desplazarX);
		this.punto1.setX(this.punto2.getX()+ desplazarX);
		this.punto1.setY(this.punto1.getY()+ desplazarY);
		this.punto1.setY(this.punto2.getY()+ desplazarY);
		
	}
	
	
	
}
