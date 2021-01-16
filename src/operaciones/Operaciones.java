package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     String nombre = "";
     int num_caracteristicas = 0, desde = 0, hasta = 0;
     Scanner in = new Scanner(System.in);
     
     System.out.println("Porfavor ingrese un nombre");
     nombre = in.nextLine();
     num_caracteristicas = nombre.length();
     System.out.println("El nombre " + nombre + " posee " + num_caracteristicas);
     

    
    }
}
