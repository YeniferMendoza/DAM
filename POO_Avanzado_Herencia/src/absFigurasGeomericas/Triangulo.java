package absFigurasGeomericas;

public class Triangulo implements FiguraGeometrica{
	
	private double base;
	private double altura;
	private double[] lados;
	
	public Triangulo(double base, double altura, double[] lados) {
		this.base = base;
		this.altura = altura;
		this.lados = new double[3];
	}

	@Override
	public double calcularArea() {
		return (this.base* this.altura) /2;
	}

	@Override
	public double calcularPerimetro() {
		double resultado = 0;
		for(double lado: this.lados) {
			resultado+= lado;
		}
		return resultado;
	}

}
