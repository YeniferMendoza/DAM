package gestionHotelera;

public class Habitacion implements InterfaceReservable{
	
	private int numH;
	private TipoHabitacion tipo;
	private float precioNoche;
	private boolean reservado;
	
	public Habitacion(int numH, TipoHabitacion tipo) {
		this.numH= numH;
		this.tipo= tipo;
		this.precioNoche= tipo.getPrecio();
		this.reservado = false;
	}

	@Override
	public boolean reservar() {
		if(!this.reservado) {
			this.reservado= true;
			return true;
		}
		return false;
	}

	@Override
	public boolean cancelarReserva() {
		if(this.reservado) {
			this.reservado= false;
			return true;
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Habitacion))
			return false;
		return this.numH == ((Habitacion)obj).numH;
	}

	public int getNumH() {
		return numH;
	}

	public void setNumH(int numH) {
		this.numH = numH;
	}

	public TipoHabitacion getTipo() {
		return tipo;
	}

	public void setTipo(TipoHabitacion tipo) {
		this.tipo = tipo;
	}

	public float getPrecioNoche() {
		return precioNoche;
	}

	public void setPrecioNoche(float precioNoche) {
		this.precioNoche = precioNoche;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	

}
