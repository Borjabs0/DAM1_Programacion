import java.util.Scanner;
public class Ej15{
	public static void main(String[] args){
		Scanner lector = new Scanner (System.in);
		double centigrados;
		System.out.println("Dime una temperatura en centigrados =");
		centigrados = Double.parseDouble(lector.nextLine());
		double kelvin = 273.15 + centigrados;
		double fahrenheit = centigrados * 9/5 + 32;
		System.out.println("Grados Kelvin = " +  kelvin);
		System.out.println("Grados Fahrenheit = " +  fahrenheit);
		lector.close();
	}
}