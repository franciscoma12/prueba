import java.util.Scanner;

//Ejercicio que lee un vector por teclado y lo muestra en pantalla

public class EjemploVectores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tam;
		System.out.println("¿Cuantos elementos quieres? ");
		tam = entrada.nextInt();
		
		int vector [] = new int[tam];
		System.out.println("introduce los datos");
		Vectores.pedir_vector(vector);
		
		System.out.println("tu vector es ");
		Vectores.mostrar_vector(vector);
		
		float v2[] = new float[tam];
		Vectores.pedir_vector(v2);
		
		
		
		

	}

}
