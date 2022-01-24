//Algoritmo que escriba los números impares comprendidos entre dos enteros 
//introducidos por el usuario
import java.util.Scanner ;
public class ejercicio3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número");
		int num1 = sc.nextInt();
		System.out.println("Introduce otro numero: ");
		int num2 = sc.nextInt();
		
		for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
	}

	}
}
