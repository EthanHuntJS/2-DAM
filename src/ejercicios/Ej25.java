package ejercicios;

import java.util.Scanner;

/**
*
* @author Izan CFGS
*/
public class Ej25    {
    public static void main(String[] args) {
        

        int num2=0;
        int resul=0;

        System.out.println("Escribe un numero");
       Scanner sc = new Scanner(System.in);
        num2 = sc.nextInt();
        
        for (int i = 1; i <= num2; i++) {
                resul+=i;
            
        }
         System.out.println(resul);  


        

    } //Fin del main
} //Fin de la clase Ej25
