import java.util.*;

public class Ejer12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean texto = false;
        int opcion;
        int bucle = 1;

        System.out.println("Opcion 1: Bucle While");
        System.out.println("Opcion 2: Bucle do-While");
        System.out.println("Opcion 3: Bucle for");

        System.out.println("Selecciona una de las siguientes opciones");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                ArrayList<Integer> arrayImpares = new ArrayList<Integer>();
                bucle = 0;

                System.out.println("Has selecionado:  Bucle While");

                while (bucle <= 30) {
                    if (bucle % 2 != 0) {
                        System.out.println(bucle);
                        arrayImpares.add(30 - bucle);
                    }
                    bucle++;
                }   
                    System.out.println(arrayImpares);
                    
                break;

            case 2:
                bucle = 0;
                System.out.println("Has selecionado: Bucle do-While");
                do {
                    if (bucle % 2 != 0) {
                        System.out.println(bucle);
                    }
                    bucle++;
                } while (bucle <= 30);
                break;

            case 3:
                bucle = 0;
                System.out.println("Has selecionado:  Bucle for");
                for (int y = 1; y <= 30; y++) {
                    if (y % 2 != 0) {
                        System.out.println(y);
                    }
                }
                break;
        }
    }


}

// invertir del 1 al 30 de alguna manera bucleD