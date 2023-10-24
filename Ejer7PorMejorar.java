import javax.swing.JOptionPane;

public class Ejer7PorMejorar{

    public static void main (String[] args){

       
        
        String correcto = (" es correcto");
        String incorrecto = ("es incorrecto");

        

        String pregunta1 = JOptionPane.showInputDialog("¿Cuanto es 1 + 1?");
        if (pregunta1.equals("2")){
            JOptionPane.showMessageDialog(null,correcto);

        }else{
            JOptionPane.showMessageDialog(null,incorrecto);
        }



        String pregunta2 = JOptionPane.showInputDialog("¿Cuanto es 8 x 8?");
        if (pregunta2.equals("64")){
             JOptionPane.showMessageDialog(null,correcto);

        }else{
             JOptionPane.showMessageDialog(null,incorrecto);
        }



        String pregunta3 = JOptionPane.showInputDialog("¿Cuanto es 33 - 15?");
        if (pregunta3.equals("18")){
             JOptionPane.showMessageDialog(null,correcto);
        }else{
             JOptionPane.showMessageDialog(null,incorrecto);
        }



        String pregunta4 = JOptionPane.showInputDialog("¿Cuanto es 99 / 99?");
        if (pregunta4.equals("1")){
            JOptionPane.showMessageDialog(null,correcto);

        }else{
            JOptionPane.showMessageDialog(null,incorrecto);
        }
        
        
        
        


    }
}


//switch