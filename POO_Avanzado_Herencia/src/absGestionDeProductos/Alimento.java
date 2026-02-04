package absGestionDeProductos;

public class Alimento extends ProductoBase{
	
	public String caducidad;

	public Alimento(String nombre, double precio, String descripcion, String caducidad) {
		super(nombre, precio, descripcion);
		this.caducidad= caducidad;
	}


	@Override
	public String getDescripcion() {
		return super.descripcion+ this.caducidad;
	}


	@Override
	public String getNombre() {
		return null;
	}


	@Override
	public double getPrecio() {
		return 0;
	}


	@Override
	public int compareTo(ProductoBase o) {
		return 0;
	}

}
