package mercaRoña;

public class ProductoElectronico extends Producto{
	private int garantia;
	private char consumoE;

	public ProductoElectronico(String nombre, double precio, int stock, int garantia, char consumoE) {
		super(nombre, precio, stock);
		this.garantia = garantia;
		this.consumoE = consumoE;
	}
	
	@Override
	public String toString() {
		return super.toString().concat(String.format("\nLa garantia es: %s.\nEl consumo energético es de %s\n.", this.garantia, this.consumoE));
	}
	
	public void activarGarantia() {
		System.out.format("Garantia activada por %d meses", this.garantia);
	}
	

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public char getConsumoE() {
		return consumoE;
	}

	public void setConsumoE(char consumoE) {
		this.consumoE = consumoE;
	}
	
	

}
