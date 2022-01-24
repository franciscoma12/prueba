// programa que dado un número escriba todos los números desde el 1 hasta el dado 
import java.util.Scanner ;
public class prueba {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = entrada.nextInt();
		//int i;
		
		// for while do-while
		for (int i = num; i >= 0; i=i-2) {
			System.out.printf("%5d ", i);
			if (i<3) i=0;
		}
	}
}
