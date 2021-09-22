package ejercicios;

import java.awt.TrayIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Izan CFGS
 */
public class Ej29 {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Introduce un mensaje");
        String texto_final="";
        System.out.println(" hola");
        
        Object[] possibleValues = {"MAYUSCULAS", "minúsculas"};

        int selectedValue = JOptionPane.showOptionDialog(null, "¿A que quieres convertir?", "eleccion", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
        if (selectedValue==JOptionPane.YES_OPTION) {
            texto_final=texto.toUpperCase();
        }
        else{
            texto_final=texto.toLowerCase();
        }
        JOptionPane.showMessageDialog(null, texto_final, "resultado", JOptionPane.INFORMATION_MESSAGE);

    } //Fin del main
} //Fin de la clase Ej29
