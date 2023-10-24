//Examen de Mario Prado

import java.util.ArrayList;
import java.util.Scanner;

public class Examen2 {

    public static void main (String [] args){

            Scanner scanner = new Scanner(System.in);
            ArrayList <String> ListaContactos = new ArrayList <String>();
            ArrayList <String> ListaTelefonos = new ArrayList <String>();
            ArrayList <String> ListaMail = new ArrayList <String>();

            //Estos usuarios se crean al inicio, si los borras y tratas de escanear los contactos creados te saldra un error,


            Agenda.add(ListaContactos);
            Agenda.add(ListaTelefonos);
            Agenda.add(ListaMail);

        while (true) { //Las preguntas se repiten en bucle

            System.out.println("1.- Crear contacto");
            System.out.println("2.- Leer contactos");
            System.out.println("3.- Salir del sistema");
            Integer dato = scanner.nextInt();
            scanner.nextLine();
            
        

        switch (dato) {
            
                case 1://La opcion 1 crea los usuarios y los almacena en tres arrayList, el numero de telefono es un String ya que me daba un fallo
                System.out.println("Escribe el nombre del nuevo usuario");
                String NuevoUsuario = scanner.nextLine();
                ListaContactos.add(NuevoUsuario);

                System.out.println("Escribe el nombre del telefono del nuevo usuario");
                String NuevoTelefono = scanner.nextLine();
                ListaTelefonos.add(NuevoTelefono);

                System.out.println("Escribe el correo del nuevo usuario");
                String NuevoMail = scanner.nextLine();
                ListaMail.add(NuevoMail);
                
                break;





                case 2://La opcion 2 muestra los parametros almacenados en el arraylist
                System.out.print("La lista de usuarios es\n");
                if (ListaContactos.isEmpty()) {
                    System.out.println("No hay usuarios en la lista.");
                }
                System.out.println(ListaContactos);
                
                if (ListaTelefonos.isEmpty()) {
                    System.out.println("No hay telefonos en la lista.");
                }
                System.out.println(ListaTelefonos);
                
                if (ListaMail.isEmpty()) {
                    System.out.println("No hay mails en la lista.");
                }
                System.out.println(ListaMail);
                break;
                
            
            
            
            
            
                case 3://La opcion 3 nos permite salir
                    System.out.println("Saliendo");
                    System.exit(0);
                break;
            }
        }
    }
}