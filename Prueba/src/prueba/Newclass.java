package prueba;

public class Newclass {
	
public static void main (String[] args) {
	String cerveza = ("hoy es viernes y el cuerpo lo sabe");
	System.out.println(cerveza.lastIndexOf("es"));
	
	//System.out.println();
	
	int num1=9, num2=2;
	
	String textoConvertido = String.valueOf(num1);
	String textoConvertido2 = String.valueOf(num2);
	System.out.println(textoConvertido+textoConvertido2);
	
	System.out.println("\\");
	
	String tex1 = "Hola";
	String tex2 = "hola"; 
	String tex3 = "adios";
	String tex4 = " Hola Mundo ";
	
	System.out.println(tex1.equalsIgnoreCase(tex2));
	
	System.out.println(tex1.compareTo(tex3));
	
	System.out.println(tex4.trim());
	//System.out.println(si el que llama es mas grande devuelve un numero positivo, y si el que llama es menor devuelve un numero positivo );
	
	
	String hi = """
			Hola, estoy probando el bloque de texto
			a ver que tal queda.""";
	
	System.out.println(hi);
	
	final String NOMBRE = "Yenifer";
	
	 System.out.println(NOMBRE);
	 
	 /*estamos probando 
	  * comentarios de varias 
	  * lineas 
	  */
	 
	 
	 float nota = 4.99f;
	 
	 double notaFinal = Math.ceil(nota);
	 
	 System.out.println(Math.ceil(notaFinal));
	
	 
	 
	 
	 
	 
	 
}

}
