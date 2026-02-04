package prueba;

public class Ejemplos {
	public static void main(String [] args) {
		float precio, porcentaje_descuento, descuento, total;
		
		precio = 25f;
		porcentaje_descuento = 10f;
		
		descuento = (precio*porcentaje_descuento) /100;
		total = precio-descuento;
		
		System.out.println("El precio final es "+total);
		
		
	}
	
		
}
