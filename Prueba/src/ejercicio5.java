import java.util.Scanner;

//Programa que lee por teclado el valor del radio de una circunferencia y calcula y 
// muestra por pantalla la longitud y el área de la circunferencia. Longitud de la 
// circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2 
public class ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double radio, area, longitud;
		System.out.println("Introduce radio : ");
		radio= entrada.nextDouble();
		longitud=2*Math.PI*radio;
		area=Math.PI * Math.pow(radio, 2);
		System.out.println("La longitud de la circunferencia es : " + longitud);
		System.out.println("El área de la circunferencia es : " + area);
	}

}
