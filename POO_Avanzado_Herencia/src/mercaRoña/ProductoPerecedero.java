package mercaRoña;

public class ProductoPerecedero extends Producto{
	private int diasCaducidad;

	public ProductoPerecedero(String nombre, double precio, int stock, int diasCaducidad) {
		super(nombre, precio, stock);
		setDiasCaducidad(diasCaducidad);
		this.diasCaducidad= getDiasCaducidad();
	}
	
	@Override
	public String toString() {
		return super.toString().concat(String.format("\nLos dias de caducidad son: %s.\n", this.diasCaducidad));
	}
	
//	public double diasCaducidad() {
//		if(this.diasCaducidad <= 3) {
//			return (this.getPrecio()/2);
//		}
//		return this.getPrecio();
//	}
	
	public void setDiasCaducidad(int diasCaducidad) {
		if(diasCaducidad == 3) {
			this.setPrecio( this.getPrecio() / 2 );
		}
		this.diasCaducidad= diasCaducidad;
	}
	
	public int getDiasCaducidad() {
		return diasCaducidad;
	}


}
