import javax.swing.JOptionPane;

public class Ejer9{

    public static void main (String[] args){

       
        
        String rosa = ("rosa");
        String negro = ("negro");
        String blanco = ("blanco");
        String gris = ("gris");
        
        
        String azul = ("azul");
        String rojo = ("rojo");
        String amarillo = ("amarillo");
        
        String verde = ("verde");
        String morado = ("morado");
        String naranja = ("naranja");

        String amarilloanaranjado = ("amarilloanaranjado");
        

        String color1 = JOptionPane.showInputDialog("Seleciona un primer color: Azul, Rojo o Amarillo");
        String color2 = JOptionPane.showInputDialog("Seleciona un segundo color: Azul, Rojo o Amarillo");
        
        switch (azul) {
            case "azul":
            if (color1.equals("azul")  &&  color2.equals("azul")){
                JOptionPane.showMessageDialog(null,"azul");}
        }

        switch (rojo) {
            case "rojo":
            if (color1.equals("rojo")  &&  color2.equals("rojo")){
                JOptionPane.showMessageDialog(null,"rojo");}
        }

        switch (amarillo) {
            case "amarillo":
            if (color1.equals("amarillo")  &&  color2.equals("amarillo")){
                JOptionPane.showMessageDialog(null,"amarillo");}
        }

        switch (verde) {
            case "verde":
            if (color1.equals("verde")  &&  color2.equals("verde")){
                JOptionPane.showMessageDialog(null,"verde");}
        }

        switch (morado) {
            case "morado":
            if (color1.equals("morado")  &&  color2.equals("morado")){
                JOptionPane.showMessageDialog(null,"morado");}
        }

        switch (naranja) {
            case "naranja":
            if (color1.equals("naranja")  &&  color2.equals("naranja")){
                JOptionPane.showMessageDialog(null,"naranja");}
        }
        
        switch (verde) {
            case "verde":
            if (color1.equals("azul")  &&  color2.equals("amarillo")){
                JOptionPane.showMessageDialog(null,"verde");}
        }
        
        switch (verde) {
            case "verde":
            if (color1.equals("amarillo")  &&  color2.equals("azul")){
                JOptionPane.showMessageDialog(null,"verde");}
        }

        switch (morado) {
            case "morado":
            if (color1.equals("azul")  &&  color2.equals("rojo")){
                JOptionPane.showMessageDialog(null,"morado");}
        }

        switch (morado) {
            case "morado":
            if (color1.equals("rojo")  &&  color2.equals("azul")){
                JOptionPane.showMessageDialog(null,"morado");}
        }

        switch (naranja) {
            case "naranja":
            if (color1.equals("rojo")  &&  color2.equals("amarillo")){
                JOptionPane.showMessageDialog(null,"naranja");}
        }

        switch (naranja) {
            case "naranja":
            if (color1.equals("amarillo")  &&  color2.equals("rojo")){
                JOptionPane.showMessageDialog(null,"naranja");}
        }

        switch (rosa) {
            case "rosa":
            if (color1.equals("rosa")  &&  color2.equals("rosa")){
                JOptionPane.showMessageDialog(null,"rosa");}
        }

        switch (negro) {
            case "negro":
            if (color1.equals("negro")  &&  color2.equals("negro")){
                JOptionPane.showMessageDialog(null,"negro");}
        }

        switch (blanco) {
            case "blanco":
            if (color1.equals("blanco")  &&  color2.equals("blanco")){
                JOptionPane.showMessageDialog(null,"blanco");}
        }

        switch (gris) {
            case "gris":
            if (color1.equals("negro")  &&  color2.equals("blanco")){
                JOptionPane.showMessageDialog(null,"gris");}
        }

        switch (gris) {
            case "gris":
            if (color1.equals("blanco")  &&  color2.equals("negro")){
                JOptionPane.showMessageDialog(null,"gris");}
        }

        switch (amarilloanaranjado) {
            case "amarilloanaranjado":
            if (color1.equals("amarillo-anaranjado")  &&  color2.equals("amarillo-anaranjado")){
                JOptionPane.showMessageDialog(null,"amarillo-anaranjado");}
        }

        switch (amarilloanaranjado) {
            case "amarilloanaranjado":
            if (color1.equals("amarillo")  &&  color2.equals("naranja")){
                JOptionPane.showMessageDialog(null,"amarillo-anaranjado");}
        }

        switch (amarilloanaranjado) {
            case "amarilloanaranjado":
            if (color1.equals("naranja")  &&  color2.equals("amarillo")){
                JOptionPane.showMessageDialog(null,"amarillo-anaranjado");}

            else {JOptionPane.showMessageDialog(null,"¿ERES DALTONICO?");}
        }

    }

}


//switch