//Dadas dos casillas de un tablero de ajedrez por la fila y columna que ocupan, comprobar
//si están en la misma fila, columna, o en la misma diagonal. 
import java.util.Scanner;
public class ejercicio1_4 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		int fil1, col1, fil2,col2;
		
		System.out.println("Introduce la posición de la primera pieza: ");
		System.out.println("Introduce la fila: ");
		fil1= entrada.nextInt();
		System.out.println("Introduce la columna: ");
		col1= entrada.nextInt();
		
		System.out.println("Introduce la posición de la segunda pieza: ");
		System.out.println("Introduce la fila: ");
		fil2= entrada.nextInt();
		System.out.println("Introduce la columna: ");
		col2= entrada.nextInt();
		
		
		if (fil1==fil2) {
			System.out.println("Se encuentran en la misma fila");
		}  else if (col1==col2) {
			System.out.println("Se encuentran en la misma columna");
		} else if (fil1-fil2 == col1-col2) {
			System.out.println("se encuentran en la misma diagonal principal");
		} else if (fil1+col1 == fil2+col2) {
			System.out.println("se encuentran en la misma diagonal inversa");
		} else 
			System.out.println("No coinciden ni en filas ni en columnas ni en diagonal.");
	}
}