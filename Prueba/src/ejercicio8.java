import java.util.Scanner;

// Programa que calcula el volumen de una esfera
public class ejercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		double radio, volumen;
		System.out.println("Introduce radio : ");
		radio= entrada.nextDouble();
		volumen=4.0/3 * Math.PI * Math.pow(radio, 3);
		System.out.println("El volumen de una esfera es : " + volumen);
	}

}
