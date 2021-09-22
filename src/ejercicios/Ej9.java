package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Izan CFGS
 */
public class Ej9 {

    public static void main(String[] args) {

        double precio;
        int iva = 21;
        double precioFinal;

        System.out.println("Introducir precio del producto: ");
        Scanner sc = new Scanner(System.in);
        precio = sc.nextInt();
        precioFinal = (precio * iva) / 100 + precio;
        System.out.println(precioFinal + "€");

        sc.close();
    } //Fin del main
} //Fin de la clase Ej9
