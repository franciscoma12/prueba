//Escribir un programa que implemente una peque�a calculadora con switch-case. El 
//programa pedir� al usuario los operandos (a y b) y la operaci�n a realizar: suma, resta, 
//multiplicaci�n y divisi�n. En funci�n de la opci�n seleccionada se realizar� una de las 
//operaciones aritm�ticas. 
import java.util.Scanner;
public class Ejercicio1_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double num1, num2, res;
		System.out.println("Introduce un n�mero");
		num1=sc.nextDouble();
		System.out.println("Introduce un n�mero");
		num2=sc.nextDouble();
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicaci�n");
		System.out.println("4.Divisi�n");
		System.out.println("Introduce una opci�n");
		int opci�n= sc.nextInt();
		switch (opci�n)
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
		System.out.println("Operaci�n incorrecta");
			}
		
		}
		
	}


