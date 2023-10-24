// Entre 0 y 12 buenos dias
// Entre 12 y 21 buenas tardes
// Entre las 21 y las 23 nocehs
// Otro error

import java.util.*;

public class Ejer11{
    public static void main (String []args){
        boolean horas = false;

        while (!horas){
            try{
            int opcion;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escribe un numero entre 0 y 23");
            opcion = scanner.nextInt();

                if (opcion >=0  && opcion <=12){
                    System.out.println("Hola buenos dias");
                }else if (opcion >=13  && opcion <=21){
                    System.out.println("Hola buenas tardes");
                }else if (opcion >=22  && opcion <=23){
                    System.out.println("Hola buenas noches");
                }
            }
            catch (InputMismatchException e){
            }System.out.println("NUMERO NO PERMITIDO");
        }
    }
}