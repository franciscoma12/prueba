//Dado un array de reales del tamaño N, visualizar por pantalla todos los elementos del 
//mismo cuyo valor pertenezca al intervalo [a,b). 
import java.util.Scanner;
public class ej3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuántos elementos quieres?: ");
		int tam = entrada.nextInt();
		
		int vector [] = new int[tam];
		System.out.println("Introduce los datos");
		Vectores.pedir_vector(vector);
		
		
		System.out.println("Introduce un numero: ");
		int num1 = entrada.nextInt();
		System.out.println("Introduce un numero: ");
		int num2 = entrada.nextInt();
		for (int i=0; i<vector.length; i++) {
			if ((vector[i]>=num1 && vector[i]<num2))
				System.out.println(i);
		}
		
	}
}
