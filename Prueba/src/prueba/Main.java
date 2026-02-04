package prueba;

public class Main {

	public static void main(String[] args) {
	
	String nombre;
	String apellidos;
	int edad;
	boolean mayorEdad;

	
	 nombre = "Patricia";
	 apellidos = "Carrasco Toro.";
	 edad = 15;
	 if (edad>= 18) {
		 
		 mayorEdad = true;
		 
	 } else {
		 
	     mayorEdad = false;
	 }
	 
	 System.out.println("Nombre: "+nombre+" "+apellidos);
	System.out.println("Su edad es: "+edad+", y es mayor de edad: "+mayorEdad);
	 
	
	
	}
}