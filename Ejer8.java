import java.until.Scanner;


public class Ejer8 {
    public static void main (String[] args){
        
        Scanner scaner = new Scanner (System.in);

        System.out.println("Introduce el primer numero");
        double num1 = scanner.nextDouble();

        System.out.println("Introduce el segundo numero");
        double num2 = scanner.nextDouble();

        System.out.println("Introduce la operacion: (suma, resta, multiplicacion, division)");
        String operacion = scanner.next();

        switch (operacion){
            case "suma":
                System.out.println("El resultado es" + (num1 + num2));
                break;
            
            case "resta":
                System.out.println("El resultado es" + (num1 - num2));
                break;
            
            case "multiplicacion":
                System.out.println("El resultado es" + (num1 * num2));
                break;
            
            case "division":
                System.out.println("El resultado es" + (num1 / num2));
                break;

            default:
                System.out.println("Operacion no reconocida");
                break;
        }
    }

    
}