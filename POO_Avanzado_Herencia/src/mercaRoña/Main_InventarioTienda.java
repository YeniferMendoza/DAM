package mercaRoña;

import java.util.ArrayList;

public class Main_InventarioTienda {

	public static void main(String[] args) {
		
		ProductoPerecedero  p1= new ProductoPerecedero("Galleras", 2.50, 80, 200);
		ProductoPerecedero  p2= new ProductoPerecedero("pan", 0.80, 6, 3);
		ProductoElectronico p3= new ProductoElectronico("Movil", 1000, 10, 2,'A');
		ProductoElectronico  p4= new ProductoElectronico("PC", 3000, 4, 2,'C');
		
		p1.vender(7);
		p2.getDiasCaducidad();
		p3.activarGarantia();
		
		ArrayList<Producto> lista = new ArrayList<Producto>();
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		
		
		
		for(Producto p : lista) {
			System.out.println(p);
		}
		

	}

}
