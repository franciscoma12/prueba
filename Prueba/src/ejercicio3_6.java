//Algoritmo que cuente cu�ntos m�ltiplos de 7 hay entre dos enteros dados por el usuario
import java.util.Scanner;
public class ejercicio3_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1, num2;
		System.out.println("Introduce un n�mero ");
		num1=sc.nextInt();
		System.out.println("Introduce otro n�mero ");
		num2=sc.nextInt();
		for (int i = num1; i <= num2; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            				}

						}
				}
		}
