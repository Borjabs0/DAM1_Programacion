import java.util.Scanner;
public class Rectangulo{
	
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in); // Creamos un Scanner
		System.out.println("Dime el ancho del rectangulo");
		double ancho = Double.parseDouble(lector.nextLine());
		System.out.println("Dime el alto del rectangulo");
		double alto = Double.parseDouble(lector.nextLine());
		/*double alto = 15;
		double ancho = 25;*/
		double area = ancho * alto;
		double perimetro = 2 * ancho + 2 * alto; 
		System.out.println("La area del rectangulo es = " + area);
		System.out.println("El Perimetro del rectangulo es = " + perimetro);
		lector.close();

	}
}