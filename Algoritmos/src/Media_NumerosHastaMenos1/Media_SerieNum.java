package Media_NumerosHastaMenos1;
import java.util.Scanner;

public class Media_SerieNum {
	
	public static void main(String[] args) {
		
		/*
		 *  2.-Dada una secuencia de números leídos por teclado, que acabe con un –1, 
		 *  por ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,……,-1; 
		 *  Realizar el algoritmo que calcule la media aritmética. 
		 *  Suponemos que el usuario no insertara numero negativos.
		 */
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		int suma = 0;
		int contador = 0;
		do {
			System.out.println("Ingrese un numero mayor a -1");
			i = sc.nextInt();
			suma = suma + i;
			contador = contador+1;
			
		}while(i>-1);
		
		int media = suma/contador;
		
		System.out.println("El resultado de la suma es: " +suma );
		System.out.println("La media es: " +media );
	}

}
