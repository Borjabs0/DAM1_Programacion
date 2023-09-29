import java.util.Scanner;
public class Ej14{
	
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in); // Creamos un Scanner
		double pi = 3.14;
		System.out.println("Dime el radio del circulo");
		double radio = Double.parseDouble(lector.nextLine());
		double longitud = 2*radio*pi;
		double area = pi*radio*radio;
		System.out.println("La area del circulo es = " + area);
		System.out.println("La lngitud del circulo es = " + longitud);
		lector.close();

	}
}