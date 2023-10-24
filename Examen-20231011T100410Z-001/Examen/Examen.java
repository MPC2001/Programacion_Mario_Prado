import java.util.ArrayList;
import javax.swing.*;

public class Examen {

   public static void main (String [] args){

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
     Persona Persona1 = new Persona("Mario",22);
     Persona Persona2 = new Persona("Izan",  18);
     Persona Persona3 = new Persona("Don",  19);
     Persona Persona4 = new Persona("Jaime", 17);
     Persona Persona5 = new Persona("Sergio", 17); 
     Persona Persona6 = new Persona("Miguel", 25); 
 
     ///////////////////////////////////////////// /////////////////////////////////////////////////////////////////
     Bebida Bebida1 = new Bebida("Colacao", "Colacao", false);
     Bebida Bebida2 = new Bebida("Bezoya", "Agua",  false);
     Bebida Bebida3 = new Bebida("BiFrutas", "Zumo ", false);
     Bebida Bebida4= new Bebida("Aguila", "Cerveza ", true);
     Bebida Bebida5 = new Bebida("Protos", "Vino", true );
     Bebida Bebida6 = new Bebida("Absolute", "Vodka", true);

     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
     System.out.println("El cliente " + Persona1.getNombre() +" ha comprado " + Bebida1.getNombre());
     if (Persona1.getEdad() <= 18) {
        if (Bebida1.getAlcohol() == true) {
        System.out.println("No se lo puede llevar porque tiene alcohol");
     }
    }

    System.out.println("El cliente " + Persona2.getNombre() +" ha comprado " + Bebida2.getNombre());
     if (Persona2.getEdad() <= 18) {
        if (Bebida2.getAlcohol() == true) {
        System.out.println("No se lo puede llevar porque tiene alcohol");
     }
    }

    System.out.println("El cliente " + Persona3.getNombre() +" ha comprado " + Bebida3.getNombre());
     if (Persona3.getEdad() <= 18) {
        if (Bebida3.getAlcohol() == true) {
        System.out.println("No se lo puede llevar porque tiene alcohol");
     }
    }

    System.out.println("El cliente " + Persona4.getNombre() +" ha comprado " + Bebida4.getNombre());
     if (Persona4.getEdad() <= 18) {
        if (Bebida4.getAlcohol() == true) {
        System.out.println("No se lo puede llevar porque tiene alcohol");
     }
    }

    System.out.println("El cliente " + Persona5.getNombre() +" ha comprado " + Bebida5.getNombre());
     if (Persona5.getEdad() <= 18) {
        if (Bebida5.getAlcohol() == true) {
        System.out.println("No se lo puede llevar porque tiene alcohol");
     }
    }

    System.out.println("El cliente " + Persona6.getNombre() +" ha comprado " + Bebida6.getNombre());
     if (Persona6.getEdad() <= 18) {
        if (Bebida6.getAlcohol() == true) {
        System.out.println("No se lo puede llevar porque tiene alcohol");
     }
    }

    
    }
}