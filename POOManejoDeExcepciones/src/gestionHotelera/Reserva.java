package gestionHotelera;

import java.time.LocalDate;

public class Reserva{
	private LocalDate fechaI;
	private int nochesR;
	private Cliente cliente;
	private Habitacion habitacion;
	
	public Reserva(LocalDate fechaI,int nochesR, Cliente cliente, Habitacion habitacion) {
		this.fechaI= fechaI;
		this.nochesR= nochesR;
		this.habitacion= habitacion;
		this.cliente= cliente;
	}

	public LocalDate getFechaI() {
		return fechaI;
	}

	public void setFechaI(LocalDate fechaI) {
		this.fechaI = fechaI;
	}

	public int getNochesR() {
		return nochesR;
	}

	public void setNochesR(int nochesR) {
		this.nochesR = nochesR;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	
	

}
