//Dado un array de enteros de tama�o N, rotar sus valores una posici�n a la izquierda, es 
//decir, si tenemos un array como el siguiente: 5 -1 -3 15 4, el resultado deber� ser el 
//array rotado a la izquierda: -1 -3 15 4 5. 
import java.util.Scanner;
public class ej4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("�Cu�ntos elementos quieres?: ");
		int tam = entrada.nextInt();
		
		int vector [] = new int[tam];
		System.out.println("Introduce los datos");
		Vectores.pedir_vector(vector);
		
		int aux= vector[0];
		for (int i = 0; i < vector.length-1; i++) {
            vector[i] = vector[i+1];
        }
       vector[vector.length-1] = aux;
       for (int i=0; i<vector.length; i++) {
           System.out.print(vector[i] + " ");
}
	}
}
        
