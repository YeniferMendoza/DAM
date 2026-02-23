package estructuraDatosDinamicos;

public interface Lista <T> {
	void agregarInicio(T dato); // Agrega un elemento al inicio de la lista
	void agregarFinal(T dato); // Agrega un elemento al final de la lista
	void agregar(T dato, int index)throws IndexOutOfBoundsException; // Agrega un elemento en una posición específica
	void eliminar(int index) throws IndexOutOfBoundsException; // Elimina un elemento de la lista
	int contiene(T dato); // Verifica si un elemento está en la lista
	int tamaño(); // Devuelve el número de elementos en la lista
	T get(int index) throws IndexOutOfBoundsException; // Obtiene el elemento en la posición especificada
	void imprimir(); // Imprime la lista
	boolean estaVacia();
}
