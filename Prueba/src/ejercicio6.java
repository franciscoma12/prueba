import java.util.Scanner;

//Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
public class ejercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		double velocidad;
		System.out.println("Velocidad en Km/h: ");
		velocidad= entrada.nextDouble();
		System.out.println("Será: " + velocidad *1000/3600);
	}

}
