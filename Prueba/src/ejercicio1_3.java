//Algoritmo que pida tres números de tipo entero y compruebe si es posible que exista un 
//triángulo con esas dimensiones
import java.util.Scanner;
public class ejercicio1_3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double lado1, lado2, lado3;
		double s, discriminate;
		
		System.out.println("introduce el lado 1: ");
		lado1 = entrada.nextDouble();		
		System.out.println("introduce el lado 2: ");
		lado2 = entrada.nextDouble();	
		System.out.println("introduce el lado 3: ");
		lado3 = entrada.nextDouble();	
		if (lado1+lado2 > lado3 && lado1+lado3 > lado2 && lado2+lado3 > lado1) {
			System.out.println("El triangulo es posible");
		} else {
			System.out.println("El traingulo es inmposible");
		}

	}
}