package DiasLaborales;
import java.util.Scanner;

public class diasLaborales {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un dia");
		String dia = sc.nextLine();
		
		switch(dia) {
		
		case "lunes":
		case "Lunes":
		case "LUNES":
			System.out.println("D�a laboral");
		break;
		
		case "martes":
		case "Martes":
		case "MARTES":
			System.out.println("D�a laboral");
		break;
		
		case "miercoles":
		case "Miercoles":
		case "MIERCOLES":
			System.out.println("D�a laboral");
		break;
		
		case "jueves":
		case "Jueves":
		case "JUEVES":
			System.out.println("D�a laboral");
		break;
		
		case "viernes":
		case "Viernes":
		case "VIERNES":
			System.out.println("D�a laboral");
		break;
		
		case "sabado":
		case "Sabado":
		case "SABADO":
			System.out.println("D�a NO laboral");
		break;
		
		case "domingo":
		case "Domingo":
		case "DOMINGO":
			System.out.println("D�a NO laboral");
		break;
		
		default:
			System.out.println("Asegurese de escribir bien el dia");
		break;
		
		}
	}
}
