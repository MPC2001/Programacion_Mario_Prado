import java.util.Scanner;
import java.util.ArrayList;

public class Prueba4 {
    public static void main(String[] args) {
        int opcion;
        Scanner Scanner = new Scanner(System.in);
        ArrayList<Libro> Libros = new ArrayList<Libro>();

        do {
            System.out.println("========================================");
            System.out.println("--------------- PRUEBA 4 ---------------");
            System.out.println("========================================");
            System.out.println("1.- Agregar un libro");
            System.out.println("2.- Buscar por autor");
            System.out.println("3.- Buscar por titulo");
            System.out.println("4.- Mostrar todos los libros");
            System.out.println("5.- Salir del programa");
            opcion = Scanner.nextInt();

            switch (opcion) {
                case 1:
                Boolean salir = false;
                Boolean respuesta;
                System.out.println();
                System.out.println("----------------------------------");
                System.out.println("Has selecionado (Agregar un libro)");
                System.out.println("----------------------------------");
                System.out.println();
                    System.out.println("¿Que libro te gustaria añadir?");
                    String Nombre = Scanner.next();
                    System.out.println("¿Que autor escribio " + Nombre);
                    String Autor = Scanner.next();
                    System.out.println("Que ID le quieres asignar a " + Nombre + " escrito por " + Autor);
                    int ID = Scanner.nextInt();
                    Libro ListaLibros = new Libro(ID, Nombre, Autor);
                    Libros.add(ListaLibros);
                    break;

                case 2:
                System.out.println();
                System.out.println("----------------------------------");
                System.out.println("Has selecionado (Buscar por autor)");
                System.out.println("----------------------------------");
                System.out.println();
                    System.out.println("Ingresa el nombre del Autor");
                    String BuscarAutor = Scanner.next();
                    for (Libro libro : Libros) {
                        if (libro.getAutor().equalsIgnoreCase(BuscarAutor)) {
                            System.out.println(libro.Libreria());
                        }
                    }
                    break;

                case 3:
                System.out.println();
                System.out.println("-----------------------------------");
                System.out.println("Has selecionado (Buscar por titulo)");
                System.out.println("-----------------------------------");
                System.out.println();
                    System.out.println("Ingresa el nombre del Autor");
                    String BuscarTitulo = Scanner.next();
                    for (Libro libro : Libros) {
                        if (libro.getNombre().equalsIgnoreCase(BuscarTitulo)) {
                            System.out.println(libro.Libreria());   
                        }
                    }
                    break;

                case 4:
                System.out.println();
                System.out.println("-----------------------------------------");
                System.out.println("Has selecionado (Mostar todos los libros)");
                System.out.println("-----------------------------------------");
                System.out.println();
                    System.out.println("Los libros disponibles son:");
                    for (Libro libro : Libros) {
                        System.out.println(libro.Libreria());
                    }
                    break;

            }
            
        } while (opcion != 5);
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Has selecionado (Salir del programa)");
        System.out.println("------------------------------------");
        System.out.println();
    }
}