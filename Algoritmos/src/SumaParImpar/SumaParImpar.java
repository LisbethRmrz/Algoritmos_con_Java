package SumaParImpar;
import java.util.*;

public class SumaParImpar {
	
	public static void main(String[] args) {
		
		/*
		 * Calcular independientemente la suma de los números pares e impares entre 1 y n
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int n = sc.nextInt();
		int i;
		int sumapar=0;
		int sumaimpar=0;
		int contadorPar = 0;
		for(i=1; i<=n; i++) {
			if(i%2==0) {
				sumapar = sumapar+i;
				contadorPar = contadorPar+1;
			}
			else {
				sumaimpar = sumaimpar +i;
			}
		}
		
		System.out.println("Suma par: "+sumapar);
		System.out.println("Suma impar: "+sumaimpar);	
		System.out.println("pares: "+contadorPar);
	}

}
