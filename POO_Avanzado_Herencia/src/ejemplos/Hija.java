package ejemplos;

public class Hija extends Padre {
	int edad;
	

	public Hija(int edad, String padre) {
		super(padre);
		this.edad = edad;
		System.out.println(" tiene una hija de " + edad + " años");
	}
}
