package ejercicios;

import java.util.Scanner;

/**
*
* @author Izan CFGS
*/
public class Ej24    {
    public static void main(String[] args) {

        double num1;
        double num2;
        double resul;
        String op="";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer numero");
        num1 = sc.nextDouble();
              sc.nextLine();
        System.out.println("Escribe el operador");
        op = sc.nextLine();
        
        System.out.println("Escribe el segundo numero");
        num2 = sc.nextDouble();
        
        if (op.equals("+")) {
            resul=num1+num2;
            System.out.println(resul);
        }
        else if (op.equals("-")) {
            resul=num1-num2;
            System.out.println(resul);
        }
        else if (op.equals("*")) {
            resul=num1*num2;
            System.out.println(resul);
        }
        else if (op.equals("/")) {
            resul=num1/num2;
            System.out.println(resul);
        }
        else if (op.equals("^")) {
            resul=Math.pow(num1, num2);
            System.out.println(resul);
        }
        else if (op.equals("%")) {
            resul=num1%num2;
            System.out.println(resul);
        }
    } 

//Fin del main
} //Fin de la clase Ej24
