//Dado un array de enteros de tamaño N, copiarlo a otro array de igual tamaño pero de 
//forma inversa, es decir, si por ejemplo el array de entrada es: 5 -1 -3 15 4, el resultado 
//debe ser un nuevo array cuyos valores son: 4 15 -3 -1 5.
import java.util.Scanner ;
public class ej9 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("¿Cuántos elementos quieres?: ");
		int tam = entrada.nextInt();
		
		int vector[] = new int[tam];
		System.out.println("Introduce los datos");
		Vectores.pedir_vector(vector);
		for(int i=vector.length-1; i>=0; i--)
            System.out.println(vector[i]);
}
	}
