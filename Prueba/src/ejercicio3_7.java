//Algoritmo que escriba todos los divisores de un n�mero entero introducido por el usuario. 
import java.util.Scanner;
public class ejercicio3_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		System.out.println("Introduce un n�mero ");
		num=sc.nextInt();
		int contador=0;
        for (int i = 1 ; i <= num ; i++)
        {
            if (num % i == 0)
            {
                System.out.println (i);
                contador++;
            }
        }
	}
}