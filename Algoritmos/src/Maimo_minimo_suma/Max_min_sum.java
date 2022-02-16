package Maimo_minimo_suma;
import java.util.Scanner;

public class Max_min_sum {

	public static void main(String[] args) {
		/*Algoritmo que lea números enteros hasta teclear 0, y
		 *  nos muestre el máximo, el mínimo y la media de todos ellos.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		int min = 0;
		int max =0;
		int suma=0;
		do {
			System.out.println("Ingrese un numero considerando que al teclear 0 se detiene");
		 i = sc.nextInt();
		 if(i>max) {
			 max = i;
		 }
		 if(i<min) {
			 min =i;
		 }
		 
		 suma = suma+i;
			
		}while(i!=0);
		System.out.println("El numero mayor es: "+max);
		System.out.println("El numero menor es: "+min);
		System.out.println("El resultado de la media es: "+suma);
	}
}
