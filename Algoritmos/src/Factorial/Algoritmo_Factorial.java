package Factorial;
import java.util.Scanner;

public class Algoritmo_Factorial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el n�mero:");
		int n = sc.nextInt();
		int factorial = 1;
		for(int i=1; i<=n; i++) {
			
			factorial = factorial*i;
		 
		}
		
		System.out.println("El factorial de "+n+ " es: " +factorial);
	}

}
