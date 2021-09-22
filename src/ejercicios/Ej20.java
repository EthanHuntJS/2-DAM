package ejercicios;

import java.util.Scanner;

/**
*
* @author Izan CFGS
*/
public class Ej20    {
    public static void main(String[] args) {
        
        int num1=6;
        
        System.out.println("Introduzca un numero");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        
        if ((num1/num1)==1 || (num1/1)==num1) {
            
            if (num1%2!=0 && num1%3!=0 && num1%5!=0) {
                System.out.println(num1 + " es primo");
            }
            System.out.println(num1 + " no es primo");
        }


    } //Fin del main
} //Fin de la clase Ej20
