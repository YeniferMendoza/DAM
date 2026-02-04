package mercaRoña;

public class Producto {
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto (String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
//	public String vender(int cantidad) {
//		String resultado = "";
//		if(this.stock < cantidad) {
//			resultado =  "Error. No hay suficiente stock.";
//		}
//		else {
//			this.setStock(this.stock - cantidad);
//			resultado = String.valueOf(this.stock);
//		}
//		return resultado;
//	}
	
	
	public void vender(int cantidad) {
		if(this.stock < cantidad) {
			System.out.println("Error. No hay suficiente stock.");
		}
		else {
			this.setStock(this.stock - cantidad);
			}
	}
	
	public void reponer(int cantidad) {
		this.setStock(this.stock + cantidad);
	}
	
	public String toString() {
		return String.format("El nombre es: %s.\nEl precio es: %s.\nEl stock actual es de: %s.", this.nombre, this.precio, this.stock);
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	

}
