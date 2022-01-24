//Algoritmo que determine si un número entero dado es perfecto o no. Se dice que 
//un número es perfecto cuando es igual a la suma de sus divisores, excluido él mismo. 
//Por ejemplo 6 es perfecto, ya que 6 = 1 + 2 + 3. 
import java.util.Scanner;
public class ejercicio3_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i, suma = 0, num;
		System.out.println("Introduce un número: ");
        num = sc.nextInt();
		for (i = 1; i < num; i++) {                       
            if (num % i == 0) {
                suma = suma + i;  
            }
        }
        if (suma == num){                    
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
    }
	}


