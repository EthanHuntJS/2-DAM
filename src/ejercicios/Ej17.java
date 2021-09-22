package ejercicios;

import java.util.Scanner;
/**
*
* @author Izan CFGS
*/
public class Ej17    {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduce el dia de la semana: ");
        
        String dia = sc.next().toLowerCase();
        
        switch (dia) {
        
            case "lunes":
                
            case "martes":
                
            case "miercoles":
                
            case "jueves":
                
             case "viernes":   
                System.out.println("Es un dia laborable");
                break;
                
            case "sabado":

            case "domingo":
                System.out.println("Es un dia no laborable");
                break;
                
            default: System.out.println("Valor no válido");
        }
        
    } //Fin del main
} //Fin de la clase Ej17
