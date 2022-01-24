//Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
//comprendido entre uno y diez, introducido por el usuario, usando un esquema do 
//while. Nota: En los tres ejercicios anteriores, el programa ha de controlar mediante 
//un esquema do-while, que el número está comprendido entre 1 y 10. 
import java.util.Scanner;
public class ejercicio3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num ;
	       
		System.out.println("Escoge número");
        
        num = sc.nextInt();

        int multiplicador = 1;
        
        do {
        	System.out.println (num + " X " + multiplicador + " = " + num * multiplicador );
               multiplicador += 1;
    } 
        while (multiplicador<=10);     
}

	}


