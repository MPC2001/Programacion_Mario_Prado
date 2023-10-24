import javax.swing.*;


public class Examen {

    public static void main (String [] args){
        //Cestas
        String Tienda;
        String Compra1;
        String Compra2;
        String Compra3;
        String Compra4;
        
        //Personas, pendiente atributos
        String Usuario;
        String Maria;
        String Carmen;
        String Laura;
        String Isabel;
        String Josefa;
        String Antonio;
        String Jose;
        String Juan;
        String Javier;
        String Daniel;

        //Bebidas, pendiente atributos
        String Cocacola;
        String Agua;
        String Colacao;
        String Fanta;
        String Cafe;
        String Cerveza;
        String Vino;
        String Tequila;
        String Vodka;
        String Champan;


        String saludo = JOptionPane.showInputDialog("Introduce tu nombre");

        switch (saludo) {
            case "Maria":
            if (1 == 1) {
                JOptionPane.showMessageDialog(null, "Hola " + saludo + " bienvenid@");
                Compra1 = JOptionPane.showInputDialog("Escribe que quieres comprar");
                if (Compra1.equals("Cerveza")){  //Pendiente poner todos los datos 
                JOptionPane.showMessageDialog(null, "No puedes comprar bebidas alcoholicas");
                } else {
                JOptionPane.showMessageDialog(null, " Has selecionado " + Compra1);
                JOptionPane.showMessageDialog(null, Compra1 + " añadido a la cesta");
                }   
            }
            break;
            
            case "Carmen":
            if (1 == 1) {
                JOptionPane.showMessageDialog(null, "Hola " + saludo + " bienvenid@");
                Compra2 = JOptionPane.showInputDialog("Escribe que quieres comprar");
                if (Compra2.equals("Cerveza")) {
                JOptionPane.showMessageDialog(null, "No puedes comprar bebidas alcoholicas");
                } else {
                JOptionPane.showMessageDialog(null, " Has selecionado " + Compra2);
                JOptionPane.showMessageDialog(null, Compra2 + " añadido a la cesta");
                }   
            }
            break;

            case "Laura":
            if (1 == 1) {
                JOptionPane.showMessageDialog(null, "Hola " + saludo + " bienvenid@");
                Compra3 = JOptionPane.showInputDialog("Escribe que quieres comprar");
                if (Compra3.equals("Cerveza")) {
                JOptionPane.showMessageDialog(null, "No puedes comprar bebidas alcoholicas");
                } else {
                JOptionPane.showMessageDialog(null, " Has selecionado " + Compra3);
                JOptionPane.showMessageDialog(null, Compra3 + " añadido a la cesta");
                }   
            }
            break;
        }

    }
}