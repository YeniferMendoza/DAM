package gestionHotelera;

public enum TipoHabitacion {
	
	INDIVIDUAL(0.00), DOBLE(0.00), SUITE(0.00);
	
	private float precio;
	

	private TipoHabitacion(double d) {
		this.precio= (float) d;
	}


	public float getPrecio() {
		return precio;
	}
	

}
