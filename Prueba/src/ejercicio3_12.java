//Algoritmo que pida un n�mero natural y determine si es primo o no
import java.util.Scanner ;
public class ejercicio3_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		boolean prime = true; 
		System.out.println("Introduce un n�mero: ");
		num=sc.nextInt();
	    for(int i = 2; i < num; i++) {
	        if (num % i == 0) {
	            prime = false;
	        }
	    }
	    if (prime)
	        System.out.println("El n�mero es primo ");
	    else
	    	System.out.println("El n�mero no es primo ");
	}

		}

