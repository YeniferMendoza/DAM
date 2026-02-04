package orientadaObjetos;

public class Punto2D {
	private float x;
	private float y;

	public Punto2D() {
		this.x = 0;
		this.y = 0;
	}

	public Punto2D(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public Punto2D(Punto2D p1) {
		this.x = p1.x;
		this.y = p1.y;
	}

	public float getX() {
		return this.x;
	}

	public float getY() {
		return this.y;
	}

	public void setX(float nuevoX) {
		this.x = nuevoX;
	}

	public void setY(float nuevoY) {
		this.y = nuevoY;
	}

	public String toString() {
		return String.format("(%.2f , %.2f)", this.x, this.y);
	}

	public Punto2D sumar(Punto2D p1) {
		Punto2D suma = new Punto2D(this.x + p1.x, this.y + p1.y);
		return suma;
	}

	public void multiplicarPorScalar(double escalar) {
		this.x *= escalar;
		this.y *= escalar;
	}
}
