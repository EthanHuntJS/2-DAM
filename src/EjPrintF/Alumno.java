/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjPrintF;

/**
 *
 * @author CFGS
 */
public class Alumno {
    
    int id;
    String nombre="";
    String apellido=""; 
    double notamedia;

       public Alumno(int id, String nombre, String apellido, double notamedia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.notamedia = notamedia;
    }
    
    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotamedia() {
        return notamedia;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotamedia(double notamedia) {
        this.notamedia = notamedia;
    }

 
    public static double media(){
         double numeroAleatorio = (Math.random()*10+1);
   
         return numeroAleatorio;
    }
    
    
}
