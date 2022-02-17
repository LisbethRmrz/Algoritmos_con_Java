package CantidadVocales;
import java.util.Scanner;

public class cantidadVocales {

	public static void main(String[] args) {
		
		/*
		 * Cuenta la cantidad de vocales en forma independiente
		 *  que se encuentren dentro de un texto introducido por el usuario
		 */
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese una palabra");
	String palabra = sc.nextLine();
	int i=0;
	int contA=0;
	int contE=0;
	int contI=0;
	int contO=0;
	int contU=0;
	char temp;
	
	for (i = 0; i < palabra.length(); i++) {
        temp = palabra.charAt(i);
        
        if (temp == 'a' || temp == 'A') {
            contA++;
        }
        
        else if (temp == 'e' || temp == 'E') {
            contE++;
        }
        
        else if (temp == 'i' || temp == 'I') {
            contI++;
        }
        
        else if (temp == 'o' || temp == 'o') {
            contO++;
        }
        
        else if (temp == 'u' || temp == 'U') {
            contU++;
        }
    }
	
	
	System.out.println("Cantidad de a: " +contA);
	System.out.println("Cantidad de e: " +contE);
	System.out.println("Cantidad de i: " +contI);
	System.out.println("Cantidad de o: " +contO);
	System.out.println("Cantidad de u: " +contU);
	}
}
