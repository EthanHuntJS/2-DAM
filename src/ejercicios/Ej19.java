package ejercicios;

import java.util.Scanner;

/**
*
* @author Izan CFGS
*/
public class Ej19    {
    public static void main(String[] args) {

    int num1;
    int contador=0;    
    int i;
    
        System.out.println("Escribe un numero entero positivo");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        
        while (num1>=1) {            
            num1=num1/10;
            contador++;
        }
        System.out.println( contador + " cifras");
       /* for (i = num1; num1 >= 1; num1=num1/10) {
            contador++;
        }
       
        System.out.println(" ese numero tiene " + contador + " cifras");
        */
       
    } //Fin del main
} //Fin de la clase Ej19
