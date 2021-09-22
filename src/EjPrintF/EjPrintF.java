package EjPrintF;

/**
*
* @author Izan CFGS
*/
public class EjPrintF    {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno(1,"Frankz","Bañón",Alumno.media());
        Alumno alumno2 = new Alumno(2,"Carlos","Bermejo",Alumno.media());
        Alumno alumno3 = new Alumno(3,"Diego","Caceres",Alumno.media());
        Alumno alumno4 = new Alumno(4,"Victor","Caja",Alumno.media());
        Alumno alumno5 = new Alumno(5,"Constantin","Carabut",Alumno.media());
        Alumno alumno6 = new Alumno(6,"Victor Manuel","De Pablo",Alumno.media());
        Alumno alumno7 = new Alumno(7,"Jorge","Gonzalez",Alumno.media());
        Alumno alumno8 = new Alumno(8,"Sergio","Gutierrez",Alumno.media());
        Alumno alumno9 = new Alumno(9,"Miguel Angel","Martin",Alumno.media());
        Alumno alumno10 = new Alumno(10,"Alejandro","Plaza",Alumno.media());
        Alumno alumno11 = new Alumno(11,"Eizan","Rosa",Alumno.media());        
        Alumno alumno12 = new Alumno(12,"Pedro Enrique","Vidal",Alumno.media());

        
        System.out.printf("%-2s\t %-9s \t %-13s \t %4s\n", "id","apellido", "nombre", "notamedia");
        System.out.printf("%s\n", "--------------------------------------------------");
        System.out.printf("%-2d\t  %-9s\t %-13s\t %-4.2f\n",alumno1.id, alumno1.apellido, alumno1.nombre, alumno1.notamedia);
        System.out.printf("%-2d\t  %-9s\t %-13s\t %-4.2f\n",alumno2.id, alumno2.apellido, alumno2.nombre, alumno2.notamedia);
        System.out.printf("%-2d\t  %-9s\t %-13s\t %-4.2f\n",alumno3.id, alumno3.apellido, alumno3.nombre, alumno3.notamedia);
        System.out.printf("%-2d\t  %-9s\t %-13s\t %-4.2f\n",alumno4.id, alumno4.apellido, alumno4.nombre, alumno4.notamedia);
        System.out.printf("%-2d\t  %-9s\t %-13s\t %-4.2f\n",alumno5.id, alumno5.apellido, alumno5.nombre, alumno5.notamedia);
        System.out.printf("%-2d\t  %-9s\t %-13s\t %-4.2f\n",alumno6.id, alumno6.apellido, alumno6.nombre, alumno6.notamedia);
        System.out.printf("%-2d\t  %-9s\t %-13s\t %-4.2f\n",alumno7.id, alumno7.apellido, alumno7.nombre, alumno7.notamedia);
        System.out.printf("%-2d\t  %-9s\t %-13s\t %-4.2f\n",alumno8.id, alumno8.apellido, alumno8.nombre, alumno8.notamedia);
        System.out.printf("%-2d\t  %-9s\t %-13s\t %-4.2f\n",alumno9.id, alumno9.apellido, alumno9.nombre, alumno9.notamedia);
        System.out.printf("%-2d\t  %-9s\t %-13s\t %-4.2f\n",alumno10.id, alumno10.apellido, alumno10.nombre, alumno10.notamedia);
        System.out.printf("%-2d\t  %-9s\t %-13s\t %-4.2f\n",alumno11.id, alumno11.apellido, alumno11.nombre, alumno11.notamedia);
        System.out.printf("%-2d\t  %-9s\t %-13s\t %-4.2f\n",alumno12.id, alumno12.apellido, alumno12.nombre, alumno12.notamedia);
    } //Fin del main
} //Fin de la clase EjPrintF
