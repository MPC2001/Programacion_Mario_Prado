import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Ejer7{

    public static void main (String[] args){

       
        String pregunta1 = ("¿Cuanto es 1 + 1?");
        String pregunta2 = ("¿Cuanto es 8 x 8?");
        String pregunta3 = ("¿Cuanto es 33 - 15?");
        String pregunta4 = ("¿Cuanto es 99 * 99?");
        
        String correcto = (" es correcto");
        String incorrecto = ("es incorrecto");



        Scanner scaner = new Scanner (System.in);

        System.out.print(pregunta1);
        int respuesta1 = scaner.nextInt();
        if (respuesta1==2){
            System.out.println(correcto);

        }else{
            System.out.println(incorrecto);
        }


        System.out.print(pregunta2);
        int respuesta2 = scaner.nextInt();
        if (respuesta2==64){
            System.out.println(correcto);

        }else{
            System.out.println(incorrecto);
        }

        System.out.print(pregunta3);
        int respuesta3 = scaner.nextInt();
        if (respuesta3==18){
            System.out.println(correcto);

        }else{
            System.out.println(incorrecto);
        }

        System.out.print(pregunta4);
        int respuesta4 = scaner.nextInt();
        if (respuesta4==9801){
            System.out.println(correcto);

        }else{
            System.out.println(incorrecto);
        }
        
        
        
        


    }
}
