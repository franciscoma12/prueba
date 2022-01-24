import java.util.Scanner;

//Programa que lea un número entero N de 5 cifras y muestre sus cifras desde el final igual que en el ejemplo.

public class ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero;
		System.out.println("Teclea un número de 5 cifras");
		numero = sc.nextInt();
		System.out.println(numero);
		 System.out.println(numero/10);
		 System.out.println(numero/100);
		 System.out.println(numero/1000);
		System.out.println(numero/10000);
        
        
       
        


	}

}
