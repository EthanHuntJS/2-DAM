package ejercicios;

import java.util.Scanner;
import java.util.Random;

/**
*
* @author Izan CFGS
*/
public class Ej18    {
    public static void main(String[] args) {
        int num1=100;
        int num2=540;
        int i=0;
        
        Random random = new Random();
        
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        
        System.out.println("Introduce otro numero");
        num2 = sc.nextInt();
        
     
        
        while (i<50) {  
               int valor1 = random.nextInt(num1 - num2)+num2;
             System.out.println(valor1);
             i++;
        }
       
        
      //   int numero Math.random()num1+num2);
     //   System.out.println(Math.random());
    } //Fin del main
} //Fin de la clase Ej18
