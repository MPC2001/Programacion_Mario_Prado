import java.util.Scanner;

public class Ejer10{
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        boolean texto = false;
        int opcion;
        int x = 1;


        while (!texto) {
            System.out.println("Opcion 1: Bucle While");
            System.out.println("Opcion 2: Bucle do-While");
            System.out.println("Opcion 3: Bucle for");

            System.out.println("Selecciona una de las siguientes opciones");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                x = 0;
                System.out.println("Has selecionado:  Bucle While");
                    while (x <= 30) {
                        if (x % 2!= 0){
                            System.out.println(x);
                        }
                        x++;
                    }
                break;

                case 2:
                x = 0;
                System.out.println("Has selecionado: Bucle do-While");
                    do{
                        if (x % 2!= 0){
                            System.out.println(x);
                        }
                        x++;
                    } while (x <= 30);
                break;

                case 3:
                x = 0;
                System.out.println("Has selecionado:  Bucle for");
                    for (int y = 1; y <= 30; y++){
                        if (y % 2!= 0){
                            System.out.println(y);
                        }
                    }
                break;
            }
        }
    }
}