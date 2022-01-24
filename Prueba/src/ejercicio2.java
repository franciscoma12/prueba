import java.util.Scanner;

// Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.
public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre_introducido = entrada.nextLine();
		System.out.println("Buenos dias " + nombre_introducido);
	}

}
