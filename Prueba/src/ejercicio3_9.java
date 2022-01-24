// Algoritmo que escriba la tabla de multiplicar usando esquemas while
import java.util.Scanner;
public class ejercicio3_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num ;
	     
        System.out.println("¿Que tabla desea Realizar?");

        num = sc.nextInt();

        int i = 1;
        while(i <=50){
        System.out.printf("%d x %d = %d\n", num, i, num*i );
        i++;
	}

}
}