package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Izan CFGS
 */
public class Ej16 {

    public static void main(String[] args) {

        String pass = "cine";
        String texto;
        int i = 1;
        System.out.println("Introduzca la contraseña");
        Scanner sc = new Scanner(System.in);
        texto = sc.nextLine();

        if (texto.equalsIgnoreCase(pass)) {
            System.out.println("Enhorabuena");
        } else {
            while (i < 3) {
                System.out.println("Vuelve a intentarlo");
                i++;
                Scanner sc1 = new Scanner(System.in);
                texto = sc1.nextLine();
                if (texto.equalsIgnoreCase(pass)) {
                    System.out.println("Enhorabuena");
                    break;
                }
                if (i == 3) {
                    System.out.println("Has usado tus 3 intentos.");
                }
            }
        }

        sc.close();
    } //Fin del main
} //Fin de la clase Ej16
