import java.util.Scanner;
public class Ejer17{
	public static void main(String[] args){
		Scanner lector = new Scanner (System.in);
		double precioLitroUno, totalPagadoUno, cuentaKmOne, precioLitroDos, totalPagadoDos, cuentaKmTres;
		
		
		//Primera Parada
		System.out.println("Precio del litro del combustible primera parada =");
		precioLitroUno = Double.parseDouble(lector.nextLine());
		System.out.println("El total pagado al llenar el depósito primera parada =");
		totalPagadoUno = Double.parseDouble(lector.nextLine());
		System.out.println("El número de kilómetros que marcaba el cuentakilómetros primera parada =");
		cuentaKmOne = Double.parseDouble(lector.nextLine());
		
		//Segunda parada 
		System.out.println("Precio del litro del combustible segunda parada =");
		precioLitroDos = Double.parseDouble(lector.nextLine());
		System.out.println("El total pagado al llenar el deposito segunda parada =");
		totalPagadoDos = Double.parseDouble(lector.nextLine());
		
		
		//Tercera parada 
		System.out.println("El número de kilómetros que marcaba el cuentakilómetros tercera parada =");
		cuentaKmTres = Double.parseDouble(lector.nextLine());

		double litrosRepostadosOne = (totalPagadoUno/precioLitroUno);
		double litrosRepostadosTwo = (totalPagadoDos/precioLitroDos);
		
		double totalDeKm = (cuentaKmTres - cuentaKmOne);
		double totalRepostado = (litrosRepostadosOne + litrosRepostadosTwo);
		double cienKm = totalRepostado * 100 / totalDeKm;	
		double consumoPorKm = cienKm / 100;
	
		System.out.println("total de litros repostados " + totalRepostado);
		System.out.println("Consumo por 100km = " + cienKm );
		System.out.println("Consumo por km = " + consumoPorKm );

		lector.close();
	}
}