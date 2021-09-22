package ejercicios;

import java.util.Scanner;

/**
*
* @author Izan CFGS
*/
public class Ej26    {
    public static void main(String[] args) {

        int num1=0;
        System.out.println("Escribe un numero");
        Scanner sc = new Scanner(System.in);
        num1= sc.nextInt();
        while (num1!=-1) {
            System.out.println("Vuelve a escribir");
            num1= sc.nextInt();
        }
        
            System.out.println("Se acaba el programa");
        

    } //Fin del main
} //Fin de la clase Ej26
