package Tablas;

public class tablas_multiplicar {

	public static void main(String[] args) {
		
		int i;
		int j=1;
		int respuesta=0;
		for(i=1; i<=10; i++) {
			for(j=1; j<=10; j++) {
			 respuesta = i*j;
			 System.out.println(i+"*"+ j +"="+respuesta);
			}
		}
		
		
	}
}
