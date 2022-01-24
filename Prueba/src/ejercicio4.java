import java.util.Scanner;

//Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La  fórmula correspondiente es: F = 32 + ( 9 * C / 5
public class ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double grados, fah ;
		 System.out.println("Introduce grado : ");
		 grados= entrada.nextDouble();
		 fah = 32 + ( 9 * grados / 5);
		 System.out.println(grados +" ºC = " + fah + " ºF"); 
	}

}
