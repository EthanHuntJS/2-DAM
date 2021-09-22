package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Izan CFGS
 */
public class Ej15 {

    public static void main(String[] args) {

        int n_ventas = 0;
        String coste;
        int total = 0;

        System.out.println("Introducir importe de la venta: ");
        Scanner sc = new Scanner(System.in);
        coste = sc.nextLine();

        while (!coste.equals("*") ) {
            int costeIntr = Integer.parseInt(coste);
            n_ventas++;
            total += costeIntr;
            System.out.println("Introducir importe de la ventaaaa: ");
            Scanner sc1 = new Scanner(System.in);
            coste = sc.nextLine();
           
            
        }

        if (coste.equals("*") ) {
            System.out.println(total + "€  y  numero de ventas de " + n_ventas);
        }

        sc.close();
    } //Fin del main
} //Fin de la clase Ej13
