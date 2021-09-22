package ejercicios;

import java.util.Scanner;
/**
*
* @author Izan CFGS
*/
public class Ejercicios    {
    public static void main(String[] args) {
        
        double numero;
        double radio;
        double resultado;
        double PI=3.14;
        
        System.out.println("Escribe el radio del circulo ");
          Scanner sc = new Scanner(System.in);
        
       numero = sc.nextInt();
       radio=Math.pow(numero, 2);
       resultado=PI*radio;
        System.out.println("El area del circulo es " + resultado);
        sc.close();
    } //Fin del main
} //Fin de la clase Ejercicios
