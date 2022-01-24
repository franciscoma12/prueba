//Programa que calcula el área de un triángulo a partir de la longitud de sus lados.
import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double seriperimetro, a,b,c, area;
		System.out.println("Introduce un números: 	");
		a= entrada.nextDouble();
		System.out.println("Introduce un números: 	");
		b= entrada.nextDouble();
		System.out.println("Introduce un números: 	");
		c= entrada.nextDouble();
		seriperimetro=(a+b+c)/2;
		area= Math.sqrt(seriperimetro * (seriperimetro - a)* (seriperimetro - b) * (seriperimetro - c));
		System.out.println("El área de un triángulo es : " + area);
	}

}
