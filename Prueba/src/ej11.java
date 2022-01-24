import java.util.Scanner;
public class ej11 {
	
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
			
			int vector_suma [] = new int [vector1.length];
			for (int i= 0; i < vector_suma.length; i++) {
				vector_suma[i]=vector1[i]+vector2[i];
			}
			System.out.println("Tu vector es: ");
			Vectores.mostrar_vector(vector_suma);
		}
}	
