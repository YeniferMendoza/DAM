package arrays;

public class Vargs {

	public static void saludos(String... names) {
		for( String name: names) {
			System.out.println("hola "+ name);
		}

	}
	public static void main(String [] args) {
		saludos("Sebas","Ari","Vivian","Yeni");
	}

}
