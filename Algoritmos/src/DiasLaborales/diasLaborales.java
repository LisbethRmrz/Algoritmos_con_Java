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
			System.out.println("Día laboral");
		break;
		
		case "martes":
		case "Martes":
		case "MARTES":
			System.out.println("Día laboral");
		break;
		
		case "miercoles":
		case "Miercoles":
		case "MIERCOLES":
			System.out.println("Día laboral");
		break;
		
		case "jueves":
		case "Jueves":
		case "JUEVES":
			System.out.println("Día laboral");
		break;
		
		case "viernes":
		case "Viernes":
		case "VIERNES":
			System.out.println("Día laboral");
		break;
		
		case "sabado":
		case "Sabado":
		case "SABADO":
			System.out.println("Día NO laboral");
		break;
		
		case "domingo":
		case "Domingo":
		case "DOMINGO":
			System.out.println("Día NO laboral");
		break;
		
		default:
			System.out.println("Asegurese de escribir bien el dia");
		break;
		
		}
	}
}
