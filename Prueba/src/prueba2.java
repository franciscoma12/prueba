// programa que pide un número por teclado hasta que el usuario introduzca un cero
// y devolverá la media aritmética de los valores.
import java.util.Scanner ;
public class prueba2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num;
		double suma = 0;
		int n=0;
		
		System.out.println("Introduce un número (0 para salir ):");
		num = teclado.nextDouble();
		while (num != 0) {
			suma = suma + num;
			n++;
			System.out.println("Introduce un número (0 para salir ):");
			num = teclado.nextDouble();
		}
		System.out.printf("La media es %.2f", suma/n);
		teclado.close();

	}

}
