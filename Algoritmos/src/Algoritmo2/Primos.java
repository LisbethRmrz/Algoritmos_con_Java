package Algoritmo2;

public class Primos {
	
	public static void main(String[] args) {
	
int i;

for(i=1; i<=100; i++) {
	
	int x=1;
	int contador = 0;
	
	while(x<=i) {
		if(i%x==0) {
			contador=contador+1;
		}
		x=x+1;
	}
	if(contador==2) {
		System.out.println("El numero: "+i+" es primo");
	}
}


}
	
}
