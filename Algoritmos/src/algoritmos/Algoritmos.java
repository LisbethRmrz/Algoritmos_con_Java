/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algoritmos;
import java.util.Scanner;
/**
 *
 * @author Lisbeth
 */
public class Algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

          /*algoritmo de una entrada de tres numeros que imprime el mayor*/
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Ingrese a: ");
         int a = sc.nextInt();
         System.out.println("Ingrese b: ");
         int b = sc.nextInt();
         System.out.println("Ingrese c: ");
         int c = sc.nextInt();

         if(a>b && a>c){
         System.out.println("El número mayor es a=" +a);
          }
          else if(c>b && c>b){
         System.out.println("El número mayor es c=" +c);
          }
          else{
          System.out.println("El número mayor es b=" +b);
           }
         
         
    }

}
