//Escribir un programa que implemente una pequeña calculadora con switch-case. El 
//programa pedirá al usuario los operandos (a y b) y la operación a realizar: suma, resta, 
//multiplicación y división. En función de la opción seleccionada se realizará una de las 
//operaciones aritméticas. 
import java.util.Scanner;
public class Ejercicio1_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double num1, num2, res;
		System.out.println("Introduce un número");
		num1=sc.nextDouble();
		System.out.println("Introduce un número");
		num2=sc.nextDouble();
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicación");
		System.out.println("4.División");
		System.out.println("Introduce una opción");
		int opción= sc.nextInt();
		switch (opción)
	{
		case 1:
		res=num1+num2;
		System.out.println(+res);
		break;
		case 2: 
		res= num1-num2; 
		System.out.println(+res);
		break;
		case 3: 
		res= num1*num2; 
		System.out.println(+res);
		break;
		case 4: 
		res= num1/num2; 
		System.out.println(+res);
		break; 
		default: 
		System.out.println("Operación incorrecta");
			}
		
		}
		
	}


