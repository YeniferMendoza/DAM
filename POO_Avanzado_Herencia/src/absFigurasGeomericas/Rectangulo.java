package absFigurasGeomericas;

public class Rectangulo implements FiguraGeometrica{
	
	public double base;
	public double altura;
	
	public Rectangulo(double base, double altura) {
		this.base= base;
		this.altura= altura;
	}

	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}

	@Override
	public double calcularPerimetro() {
		return (this.base*2)+(this.altura*2);
	}

}
