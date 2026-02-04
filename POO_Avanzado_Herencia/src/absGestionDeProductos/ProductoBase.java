package absGestionDeProductos;

public abstract class ProductoBase implements Producto, Comparable <ProductoBase> {
	
	protected String nombre;
	protected double precio;
	protected String descripcion;
	
	public ProductoBase(String nombre, double precio, String descripcion) {
		this.nombre= nombre;
		this.precio= precio;
		this.descripcion= descripcion;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public double getPrecio() {
		return this.precio;
	}

	@Override
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public int CompareTo(ProductoBase p) {
		if(this.precio > p.precio) {
			return 1;
		}
		if(this.precio < p.precio) {
			return -1;
		}
		return 0;
	}
	
	
	

}
