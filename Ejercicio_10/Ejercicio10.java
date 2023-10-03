public class Ejercicio10{
	public enum Meses{	
		ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE // Definimos un tipo de datos enumerado para representar las calificaciones de un alumno
		}

	public enum Calificaciones {
    		INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, EXCELENTE
		}
		
	public enum Notas {
    		DO,RE,MI,FA,SOL,LA,SI // Definimos un tipo de datos enumerado para representar las notas musicales
		}
		
	public static void main(String[] args){
		//Meses
		
		Meses mes = Meses.ENERO; // Creamos una variable de este tipo y le asignamos el mes ENERO
		System.out.println("El mes es " + mes ); // Imprimimos un mensaje que indique de qué mes se trata. En este caso nos mostrara por pantalla El mes es ENERO.

		//Calificaciones

		Calificaciones calificacion = Calificaciones.BIEN; // Creamos una variable de este tipo y le asignamos la calificación 
		System.out.println("La calificación es " + calificacion); // Imprimimos un mensaje que indique de qué calificación se trata

		//Notas Musicales
		
		Notas nota = Notas.DO; // Creamos una variable de este tipo y le asignamos la nota do
		System.out.println("La nota es " + nota); // Imprimimos un mensaje que indique de qué nota se trata


		
	}
}