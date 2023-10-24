public class Ejer4 {
    public static void main (String[] args){
       String SaludoCompletoPepito = SaludoPepito("Don Pepito");
       SaludoJose("Don Jose");
       System.out.println(SaludoCompletoPepito);  //Sout
    }
    
    public static String SaludoPepito(String Pepito){ //SaludoPepito es una funcion
        String Saludo1 = "Hola " + Pepito;
        return Saludo1;
    }

    public static void SaludoJose(String Jose){
        String Saludo2 = "Hola " + Jose;
        System.out.println(Saludo2);
    }
}

