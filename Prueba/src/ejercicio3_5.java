//Algoritmo que sume los primeros números enteros, siendo n un número 
//introducido por el usuario.
import java.util.Scanner;
public class ejercicio3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n, suma=0;
		System.out.println("Introduce el número: ");
		n= sc.nextInt();
		for (int i=1; i <=n ; i++) {
			suma= suma + i;
		}
		System.out.println("La suma es " +suma);
	}

	}


