// Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
//comprendido entre uno y diez, introducido por el usuario, usando un esquema for.
import java.util.Scanner;
public class ejercicio3_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduce un numero: ");
		int num = sc.nextInt();
		
		for (int i = 1; i<=11; i++);
		System.out.printf("Tabla de multiplicar del " + num);
		for (int j=0; j <11; j++){
        System.out.println(num + " X " + j + " =" + num*j);
      }


	}

}
