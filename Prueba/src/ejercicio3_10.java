//Algoritmo que escriba la tabla de multiplicar usando esquemas do while. 
import java.util.Scanner;
public class ejercicio3_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		System.out.println("Escribe el número ");
		num=sc.nextInt();
		 int multiplicador = 1;
	        
	        do {
	        	System.out.println (num + " X " + multiplicador + " = " + num * multiplicador );
	               multiplicador += 1;
	    } 
	        while (multiplicador<=50);     
	}
		
}


