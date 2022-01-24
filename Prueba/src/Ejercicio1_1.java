//Algoritmo que pida dos enteros y que indique el mayor y el menor, o si ambos son iguales. 
import java.util.Scanner;
public class Ejercicio1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1, num2 ;
		System.out.println("Introduce numero: ");
		num1=sc.nextInt();
		System.out.println("Introduce numero: ");
		num2=sc.nextInt();
		if (num1>num2)
			  System.out.println(num1 + " es mayor que " + num2);
			if (num1<num2)
			  System.out.println(num2 + " es mayor que " + num1);
				if (num1==num2)
			System.out.println(num1 + "	es iugal a " + num2);
		
	}

}
