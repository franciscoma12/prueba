/**
 * 
 */
import java.util.Scanner;

/**
 * @author USUARIO
 *
 */
public class HolaMundo {

	/**
	 * Procedimiento principal
	 * @param args argumentos de la funcion min. Sin uso de momento
	 */
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = entrada.nextLine();
		
		int numero;
		System.out.println("Introduce un número: ");
		numero = entrada.nextInt();
		
		System.out.println("Tu nombres es: " + nombre + " y el número elegido es : " + numero);
		
	}

}
