package gestionHotelera;

public enum TipoHabitacion {
	
	INDIVIDUAL(0.00f), DOBLE(0.00f), SUITE(0.00f);
	
	private float precio;
	

	private TipoHabitacion(float d) {
		this.precio= d;
	}


	public float getPrecio() {
		return precio;
	}
	

}
