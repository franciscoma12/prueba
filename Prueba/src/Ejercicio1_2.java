//Algoritmo que pida tres números distintos de tipo float e indique cual es el que ocupa la 
//posición central si los tres se ordenasen
import java.util.Scanner ;
public class Ejercicio1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float num1, num2, num3;
		System.out.println("Introduce numero: ");
		num1=sc.nextInt();
		System.out.println("Introduce numero: ");
		num2=sc.nextInt();
		System.out.println("Introduce numero: ");
		num3=sc.nextInt();
		if ((num1>num2 && num1<num3) || (num1>num3 && num1<num2))
			System.out.println(num1 + " es el central");
		else if ((num2>num1) && (num2<num3))
			System.out.println(num2 + " es el central");
		else if ((num3>num1) && (num3<num2))
			System.out.println(num3 + " es el central");
	}
}