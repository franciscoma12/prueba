import java.util.Scanner;

// Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.
public class ejercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		double cateto1, cateto2, hipotenusa;
		System.out.println("Introduce un número: ");
		cateto1= entrada.nextInt();
		System.out.println("Introduce otro número: ");
		cateto2= entrada.nextInt();
		hipotenusa= Math.sqrt((Math.pow(cateto1, 2)+(Math.pow(cateto1, 2))));
		System.out.println("La hipotenusa será: " + hipotenusa);
	}

}
