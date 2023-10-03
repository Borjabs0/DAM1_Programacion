public class Ejercicio9{
	// Definimos un tipo de datos para representar los colores. solo admiten valores que estén dentro del posible conjunto de valores.
	public enum Colores {
    		RED,
    		GREEN,
    		BLUE
		}
	public static void main(String[] args){		

		// Creamos una variable de este tipo y le asignamos el color BLUE
		Colores color = Colores.BLUE;

		// Imprimimos un mensaje que indique de qué color que se trata. En este caaso nos mostrara por pantalla El color es BLUE.
		System.out.println("El color es " + color);
		color = Colores.RED;
		System.out.println("Ahora el color es " + color);
	}
}