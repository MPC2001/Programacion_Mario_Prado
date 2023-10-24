


import java.util.Scanner;

public class Ejer6 {
    public static void main (String[] args){
       String SaludoCompletoPepito = Ejer5A.SaludoPepito("Don Pepito");
       Ejer5B.SaludoJose("Don Jose");
      // System.out.println(SaludoCompletoPepito);

       Scanner sc = new Scanner (System.in);
       String nombre;

      System.out.println("¿Y tu no saludas?:");
       nombre = sc.nextLine();
       System.out.println(SaludoCompletoPepito);
    }

}