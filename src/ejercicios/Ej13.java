package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Izan CFGS
 */
public class Ej13 {

    public static void main(String[] args) {

        int i = 0;
        int ventas = 0;
        int cantidades = 0;
        int total = 0;

        System.out.println("Introducir ventas: ");
        Scanner sc = new Scanner(System.in);
        ventas = sc.nextInt();

        while (i < ventas) {
            System.out.println("Introducir cuanto ha valido la venta: ");
            cantidades = sc.nextInt();
            total += cantidades; //Total= total + cantidades;
            i++;
        }

        System.out.println(total + "€ de total");
        sc.close();
    } //Fin del main
} //Fin de la clase Ej13
