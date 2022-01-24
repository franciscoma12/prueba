//Algoritmo que imprima la tabla de multiplicar correspondiente a un número 
//comprendido entre uno y diez, introducido por el usuario, usando un esquema while. 
import java.util.Scanner;
public class ejercicio3_2 {

	public static void main(String[] args) {
		int num ;
	     
        System.out.println("¿Que tabla desea Realizar?");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        int i = 1;
        while(i <=10){
        System.out.printf("%d x %d = %d\n", num, i, num*i );
        i++;
    
        }
	}

}
