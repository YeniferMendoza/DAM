package gestionDeVehiculos;

import java.util.ArrayList;

public class MainInventarioVehiculos {

	public static void main(String[] args) {
		Coche coche1 = new Coche("Opel", "Astra", 2011, "hhh8546", 4, false);
		Coche coche2 = new Coche("Audi", "TT", 2006, "hhh8548", 2, false);

		Moto moto1 = new Moto("Yamaha", "052", 2011, "hola", 200, "deportiva");
		Moto moto2 = new Moto("Yamaha", "082", 2031, "adios", 50, "scooter");

		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();

		lista.add(coche1);
		lista.add(coche2);
		lista.add(moto1);
		lista.add(moto2);

		for (Vehiculo vh : lista) {
			System.out.println(vh);
		}
		Coche coche3 = new Coche("Renault", "Arcana", 2020, "hhh848", 15, true);

		if (!existeVehiculo(lista, coche3)) {
			lista.add(coche3);
			System.out.println("Se agregó a la lista correctamente.");
		}

	}

	private static boolean existeVehiculo(ArrayList<Vehiculo> lista, Coche coche) {
		for (Vehiculo vehiculo : lista) {
			if (vehiculo.matricula.equals(coche.matricula)) {
				System.err.println(
						"El vehículo no se puede agregar porque ya está en la lista o cuenta con un error en la matrícula");
				return true;
			}
		}
		return false;
	}

}
