package gestionHotelera;

import java.util.ArrayList;

public class GestorHotel {
	private ArrayList<Habitacion> listaH;
	private ArrayList<Cliente> listaC;
	private ArrayList<Reserva> listR;
	
	public GestorHotel() {
		this.listaC= new ArrayList<Cliente>();
		this.listaH= new ArrayList<Habitacion>();
		this.listR= new ArrayList<Reserva>();
	}
	
	public void añadirH(Habitacion habitacion) {
		this.listaH.add(habitacion);
	}
	
	public void registrarC(Cliente cliente) {
		this.listaC.add(cliente);
	}
	
	
	

}
