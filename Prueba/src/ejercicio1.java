import java.util.Scanner;

//Programa Java que lea dos n�meros enteros por teclado y los muestre por pantalla.

public class ejercicio1 {

	public static void main(String[] args) {
		int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un n�mero: ");
        n1 = sc.nextInt();  
		
        System.out.println("Introduce otro n�mero: ");
        n2 = sc.nextInt();
		
        System.out.println("Los n�meros son: " + n1 + " y " + n2);  

	}

}
