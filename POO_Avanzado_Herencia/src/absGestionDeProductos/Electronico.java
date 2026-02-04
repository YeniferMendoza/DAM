package absGestionDeProductos;

public class Electronico extends ProductoBase{
	
	private int garantia;

	public Electronico(String nombre, double precio, String descripcion, int garantia) {
		super(nombre, precio, descripcion);
		this.garantia= garantia;
	
	}

	@Override
	public String getDescripcion() {
		return super.descripcion;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	@Override
	public int compareTo(ProductoBase o) {
		return 0;
	}
	
	

}
