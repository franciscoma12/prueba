import java.util.Scanner;

//Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número
public class ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num;
		 System.out.println("Introduce un número : ");
		 num = entrada.nextInt();
		 System.out.println("Su número es: " + num );
		 System.out.println("El doble de " + num + " es " + num * 2);
		 System.out.println("El triple de " + num + " es " + num * 3);
	}

}
