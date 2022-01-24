import java.util.Scanner;
public class prueba3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num;
		double suma = 0;
		int n=0;
		

		do {
			System.out.println("Introduce un número (0 para salir ):");
			num = teclado.nextDouble();
				suma = suma + num;
				n++;
			
		} while (num != 0);
		System.out.printf("La media es %.2f", suma/(n-1));
		teclado.close();

	}
}