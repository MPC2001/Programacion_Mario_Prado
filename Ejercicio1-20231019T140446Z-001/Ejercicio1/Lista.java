import java.util.*;
import javax.swing.*;

public class Lista {
    public static void main (String[] args){
        Tareas Lista1 = new Tareas("Tareas de Lucas", "Son las tareas pendientes de Lucas", true);
        ArrayList <String> Tareas1 = new ArrayList <String>();
        String Tarea1;

        Tareas Lista2 = new Tareas("Tareas de Izan", "Son las tareas pendientes de Izan", true);
        ArrayList <String> Tareas2 = new ArrayList <String>();
        String Tarea2;

        Tareas Lista3 = new Tareas("Tareas de Sergio", "Son las tareas pendientes de Sergio", false);
        ArrayList <String> Tareas3 = new ArrayList <String>();
        String Tarea3;

        Tareas Lista4 = new Tareas("Tareas de Mario", "Son las tareas pendientes de Mario", false);
        ArrayList <String> Tareas4 = new ArrayList <String>();
        String Tarea4;


        String Nombre = JOptionPane.showInputDialog("Escribe el numero correspondiente para selecionar el Usuario al que quieres acceder\n   1.-Lucas\n   2.-Izan\n   3.-Sergio\n   4.-Mario\n");
        switch (Nombre) {
            
            case "1":////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Tareas1.add("Comprar Leche\n");
                Tareas1.add("Comprar Pan\n");
                Tareas1.add("Ir a clase\n");
                Tareas1.add("Jugar un LOL\n");
                Tareas1.add("Cargar el patinete\n");
            if (Lista1.getStatus() == true) {
                JOptionPane.showMessageDialog(null, "Bienvenido a " + Lista1.getNombre());
                String Inicio = JOptionPane.showInputDialog("Escribe el numero correspondiente para selecionar que quieres hacer\n  A.-Ver las tareas pendientes\n  B.-Añadir nuevas tareas\n  C.-Borrar tareas\n  D.-Salir\n ");
                    switch (Inicio) {
                        
                        case "A":////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                            JOptionPane.showMessageDialog(null, "\nLa lista de tareas de Lucas es\n" + Tareas1);   
                            break;
                        
                        case "B":////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                            do{
                                Tarea1 = JOptionPane.showInputDialog(null, "Escribe el nombre de la tarea que quieres agregar\n O escribe salir para terminar");
                                if (!Tarea1.equalsIgnoreCase("Salir")){
                                Tareas1.add("\n" + Tarea1 + "\n");
                                }
                            }while (!Tarea1.equalsIgnoreCase("Salir")); {
                                JOptionPane.showMessageDialog(null, "La lista de tareas agregadas a Lucas es\n" + Tareas1);
                            }
                            break;
                        
                        case "C":////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                            do{
                                String Listas1 = JOptionPane.showInputDialog(null, "\nEstas son las tareas de Lucas escribe la tarea que quieres borar\n" + Tareas1);
                                switch (Listas1) {
                                    case "Comprar Leche":
                                    Tareas1.remove(0);
                                    JOptionPane.showMessageDialog(null, "La lista de tareas agregadas a Lucas es\n" + Tareas1);
                                        break;
                                    case "Comprar Pan":
                                    Tareas1.remove(1);
                                    JOptionPane.showMessageDialog(null, "La lista de tareas agregadas a Lucas es\n" + Tareas1);
                                        break;
                                    case "Ir a clase":
                                    Tareas1.remove(2);
                                    JOptionPane.showMessageDialog(null, "La lista de tareas agregadas a Lucas es\n" + Tareas1);
                                        break;
                                    case "Jugar un LOL":
                                    Tareas1.remove(3);
                                    JOptionPane.showMessageDialog(null, "La lista de tareas agregadas a Lucas es\n" + Tareas1);
                                        break;
                                    case "Cargar el patinete":
                                    Tareas1.remove(4);
                                    JOptionPane.showMessageDialog(null, "La lista de tareas agregadas a Lucas es\n" + Tareas1);
                                        break;
                                if (!Tarea1.equalsIgnoreCase("Salir")){
                                Tareas1.add("\n" + Tarea1 + "\n"); }
                                }while (!Tarea1.equalsIgnoreCase("Salir")); {
                                JOptionPane.showMessageDialog(null, "La lista de tareas agregadas a Lucas es\n" + Tareas1);
                            }
                            break;
                        }

                        case "D":////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                JOptionPane.showMessageDialog(null, "\nCerrando sesion\n");
                            break;
                    }
            }else {
                JOptionPane.showMessageDialog(null, "La lista de tareas no esta disponible");
            }
            break;
        }
    }    
}

