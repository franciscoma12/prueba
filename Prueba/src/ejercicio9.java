//Programa que calcula el �rea de un tri�ngulo a partir de la longitud de sus lados.
import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double seriperimetro, a,b,c, area;
		System.out.println("Introduce un n�meros: 	");
		a= entrada.nextDouble();
		System.out.println("Introduce un n�meros: 	");
		b= entrada.nextDouble();
		System.out.println("Introduce un n�meros: 	");
		c= entrada.nextDouble();
		seriperimetro=(a+b+c)/2;
		area= Math.sqrt(seriperimetro * (seriperimetro - a)* (seriperimetro - b) * (seriperimetro - c));
		System.out.println("El �rea de un tri�ngulo es : " + area);
	}

}
