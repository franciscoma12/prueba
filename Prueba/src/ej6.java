import java.util.Scanner;

//Dado un array de enteros de tama�o N, se debe buscar el primer elemento del array 
//mayor que un n�mero A, y a partir de �l inclusive, visualizar todos los valores de los 
//siguientes hasta el �ltimo elemento del array.
public class ej6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("�Cu�ntos elementos quieres?: ");
		int tam = entrada.nextInt();
		
		int vector [] = new int[tam];
		System.out.println("Introduce los datos");
		Vectores.pedir_vector(vector);
		
		System.out.println("Introduce un numero: ");
		int num1 = entrada.nextInt();
		
		
		int i=0;
		for (i=0; (i<vector.length && (vector[i]<= num1)); i++);
		for (int j=i; j<vector.length; j++)
			 {
				System.out.println(vector[j]);
			}
				
			
			
		
			
	}
}
