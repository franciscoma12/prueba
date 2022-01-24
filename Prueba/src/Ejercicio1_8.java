//Dado el sueldo bruto de un trabajador y su número de hijos, realizar un algoritmo que 
//calcule los impuestos que debe pagar según la siguiente tabla de tramos: 
import java.util.Scanner ;
public class Ejercicio1_8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double salario, resto, tramo, impuestos=0;
		int nhijos;
		System.out.println("Salario: ");
		salario = entrada.nextDouble();
		System.out.println("Num hijos: ");
		nhijos = entrada.nextInt();
		
		if (nhijos>10)
			nhijos=10;
		
		// 2500 1300
		resto = salario -1000; // 1500- 1600 -1000 = 600,  300
		if( resto < 1600 -1000) {
			impuestos = impuestos + resto*0.05 - resto*0.01*nhijos;
			resto=0;
		} else {
			impuestos = impuestos + 600*0.05 - 600*0.01*nhijos;
			resto=resto-600;
		}
		
		
		
		if (resto < 3000 -1600) {
			impuestos = impuestos + resto*0.1 - resto*0.01*nhijos;
			resto=0;
		} else {
			impuestos = impuestos + 1400*0.1 - 1400*0.01*nhijos;
			resto=resto-1400;
		}
		
		if (resto < 4600 -3000) {
			impuestos = impuestos + resto*0.15 - resto*0.01*nhijos;
			resto=0;
		} else {
			impuestos = impuestos + 1600*0.15 - 1600*0.01*nhijos;
			resto=resto-1600;
		}
		
		if (resto > 0) {
			impuestos = impuestos + resto*0.2 - resto*0.015*nhijos;
		}
		System.out.printf("Con un sueldo de %.2f pagarás %.2f € de impuestos", salario, impuestos);
	}
	}


