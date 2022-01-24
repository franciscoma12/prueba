//Programa que lee un número de 3 cifras y muestra sus cifras por separado
import java.util.Scanner;
public class ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		int num;
		System.out.println("Introduce numero: ");
		num = entrada.nextInt();
		System.out.println(num/100);
		System.out.println(num/10);
		System.out.println(num/1);
	}

}
