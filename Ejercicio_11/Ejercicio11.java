import java.util.Scanner;
public class Ejercicio11{
	public static void main(String[] args){
		Scanner lector = new Scanner (System.in);
		int minuendo;
		int sustraendo;
		int resultado;
		System.out.println("Dime el minuendo =");
		minuendo = Integer.parseInt(lector.nextLine());
		System.out.println("Dime otro sustraendo =");
		sustraendo = Integer.parseInt(lector.nextLine());
		resultado = minuendo - sustraendo;
		System.out.println("La resta es = " + resultado);
		lector.close();
	}
}