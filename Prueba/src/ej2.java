// Dado un array de enteros de tamaño N, visualizar por pantalla todos los elementos del 
//mismo cuyo valor sea menor que un número A. 
import java.util.Scanner;
public class ej2 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("¿Cuántos elementos quieres?: ");
	int tam = entrada.nextInt();
	
	int vector [] = new int[tam];
	
	System.out.println("Introduce los datos");
	Vectores.pedir_vector(vector);
	
	System.out.println("Tu vector es: ");
	Vectores.mostrar_vector(vector);

	System.out.println(" introduce un numero: ");
	int num = entrada.nextInt();
	
	System.out.println("Los mayores que "+ num + " son:");
	Vectores.mostrar_vector_m(vector, num);
	}
}
