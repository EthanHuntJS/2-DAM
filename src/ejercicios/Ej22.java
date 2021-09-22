package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Izan CFGS
 */
public class Ej22 {

    public static void main(String[] args) {

       String cadena = "";
       
        System.out.println("Escribe una frase y cuento vocales");
       Scanner sc = new Scanner(System.in);
       cadena = sc.nextLine();
       
int a = 0, e = 0, i = 0, o = 0, u = 0;

for (int x = 0; x < cadena.length(); x++) {
    char actual = cadena.toLowerCase().charAt(x);

    switch (actual) {
        case 'a':
            a++;
            break;
        case 'e':
            e++;
            break;
        case 'i':
            i++;
            break;
        case 'o':
            o++;
            break;
        case 'u':
            u++;
            break;
        default:
            break;
    }
}

System.out.println("Total de vocales: " + (a+e+i+o+u));

System.out.println("Cantidad de a: " + a);
System.out.println("Cantidad de e: " + e);
System.out.println("Cantidad de i: " + i);
System.out.println("Cantidad de o: " + o);
System.out.println("Cantidad de u: " + u);
/* String texto="";
        
        System.out.println("Escribe y cuento los caracteres");
        Scanner sc = new Scanner(System.in);
        texto = sc.nextLine();

        
        int contarcaract = texto.length();
        System.out.println(contarcaract);
*/
    } //Fin del main
} //Fin de la clase Ej22
