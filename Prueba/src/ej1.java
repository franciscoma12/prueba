//Rellenar un array de tamaño N con valores enteros dados por el usuario a través del teclado. 
import java.util.Scanner;
public class ej1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tam;
		System.out.println("¿Cuantos elementos quieres? ");
		tam = entrada.nextInt();
		
		float numero [] = new float[tam];
		for (int i = 0; i < numero.length; i++) {
			System.out.printf("numero %d: ",i);
			numero[i] = entrada.nextFloat();
		}
		
		for (int i = 0; i < numero.length; i++) {
			System.out.printf("%.2f ", numero[i]);
		}
	}
}
