import java.util.Scanner;

//Dados dos array de enteros de tamaños N y M respectivamente, concatenarlos en un 
//nuevo array de tamaño N+M, es decir si los arrays de entrada son por ejemplo: 5 -1 -3 
//15 4 y 3 4 2, el array concatenado resultado deberá ser: 5 -1 -3 15 4 3 4 2.
public class ej10 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
	
		System.out.println("¿Cuántos elementos quieres?: ");
		int tam1 = entrada.nextInt();
		
		int vector1 [] = new int[tam1];
		System.out.println("Introduce los datos");
		Vectores.pedir_vector(vector1);
		
		System.out.println("¿Cuántos elementos quieres?: ");
		int tam2 = entrada.nextInt();
		
		int vector2 [] = new int[tam2];
		System.out.println("Introduce los datos");
		Vectores.pedir_vector(vector2);
		
		int vector3[] = new int[vector1.length+vector2.length];
		for (int i= 0; i<vector1.length; i++) {
			vector3[i]=vector1[i];
		}
		for (int i= 0; i<vector2.length; i++) {
			vector3[i+vector1.length]=vector2[i];
		}
		System.out.print("Tu vector es: ");
		Vectores.mostrar_vector(vector3);
	}
}
