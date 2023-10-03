import java.util.Scanner;
public class Ej12{
	public static void main(String[] args){
		Scanner lector = new Scanner (System.in);
		double num1 = 0;
		double num2 = 0;
		System.out.println("Dime un numero dividendo =");
		num1 = Double.parseDouble(lector.nextLine());
		System.out.println("Dime un numero divisor =");
		num2 = Double.parseDouble(lector.nextLine());
		double resultado = num1 / num2;
		System.out.println(num1 + "/" + num2  + "= " +  resultado);
		lector.close();
	}
}