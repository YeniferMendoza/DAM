package gestionHotelera;

import java.time.LocalDate;
import java.util.ArrayList;

import excepcionesPersonalizadas.ClienteDuplicadoException;
import excepcionesPersonalizadas.HabitacionDuplicadaException;
import excepcionesPersonalizadas.HabitacionOcupadaException;
import excepcionesPersonalizadas.ReservaNoEncontradaException;

public class GestorHotel {
	private ArrayList<Habitacion> listaH;
	private ArrayList<Cliente> listaC;
	private ArrayList<Reserva> listR;
	
	public GestorHotel() {
		this.listaC= new ArrayList<Cliente>();
		this.listaH= new ArrayList<Habitacion>();
		this.listR= new ArrayList<Reserva>();
	}
	
	public void añadirHabitacion(Habitacion habitacion) throws HabitacionDuplicadaException {
		for(Habitacion h : this.listaH) {
			if(h.equals(habitacion)) {
				throw new HabitacionDuplicadaException(habitacion);
			}
		}
			this.listaH.add(habitacion);
	}
	
	public void registrarCliente(Cliente cliente) throws ClienteDuplicadoException {
		for(Cliente c: this.listaC) {
			if(c.equals(cliente)) {
				throw new ClienteDuplicadoException(cliente);
			}
		}
		this.listaC.add(cliente);
	}
	
	public void hacerReserva(Habitacion h, Cliente c, int dias) throws HabitacionOcupadaException {
		if(!h.reservar()) {
			throw new HabitacionOcupadaException(h);
		}
		Reserva reserva = new Reserva(LocalDate.of(2026, 02, 14),dias,c,h);
		this.listR.add(reserva);
	}
	
	public void cancelarReserva(Reserva reserva) throws ReservaNoEncontradaException {
		reserva.getHabitacion().cancelarReserva();
		if(!this.listR.remove(reserva)) {
			throw new ReservaNoEncontradaException(reserva);
		}
	}
	public void habitacionNumero() {
		
	}
	public void habitacionDisponible() {
		
	}
	public void habitacionPorTipo() {
		
	}
	

	public ArrayList<Habitacion> getListaH() {
		return listaH;
	}

	public void setListaH(ArrayList<Habitacion> listaH) {
		this.listaH = listaH;
	}

	public ArrayList<Cliente> getListaC() {
		return listaC;
	}

	public void setListaC(ArrayList<Cliente> listaC) {
		this.listaC = listaC;
	}

	public ArrayList<Reserva> getListR() {
		return listR;
	}

	public void setListR(ArrayList<Reserva> listR) {
		this.listR = listR;
	}
	
	
	

}
