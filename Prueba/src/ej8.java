//Dado un array de enteros de tama�o N, decir si es capic�a o no, es decir, si por 
//ejemplo el array es: 5 2 1 2 5, el resultado debe ser �verdad�(se debe tener en cuenta 
//que el tama�o el array puede ser par o impar).
import java.util.Scanner;
public class ej8 {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		System.out.println("�Cu�ntos elementos quieres?: ");
		int tam = entrada.nextInt();
		
		int vector[] = new int[tam];
		System.out.println("Introduce los datos");
		Vectores.pedir_vector(vector);
		boolean capicua=true;
		int i;
		for (i=0; i<vector.length/2;i++) {
			if (vector[i] != vector[vector.length-i-1])
				{capicua=false;
					}
		}
		if (capicua)
			System.out.printf("El n�mero es capic�a");
		else
			System.out.printf("El n�mero no es capic�a");
		
	}
	
}
