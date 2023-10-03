import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {

        
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de segundos: ");
        int segundos = lector.nextInt();
	int minutos = segundos / 60;
	int horas = minutos / 60;
	int dias = horas / 24;
	System.out.println("La cantidad de segundos ingresada equivale a:");
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    	lector.close();
	}
}
