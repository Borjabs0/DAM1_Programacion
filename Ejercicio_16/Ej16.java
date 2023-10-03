import java.util.Scanner;
public class Ej16{
	public static void main(String[] args){
		Scanner lector = new Scanner (System.in);
		double euros;
		System.out.println("Dime una cantidad de Euros =");
		euros = Double.parseDouble(lector.nextLine());
		double dolar = euros * 0.94213565;
		double libra = euros * 1.1554927;
		System.out.println(euros + " Euros son " + dolar + " Dolares");
		System.out.println(euros + " Euros son " +  libra + " Libras");
		lector.close();
	}
}