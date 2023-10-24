public class Ejer3 {

    public static void main (String[] args){
        String saludo1 = SaludoPepito("Don Pepito");
        String saludo2 = SaludoJose("Don Jose");
        String saludo0 = Saludo("Buenos dias");
        System.out.println(saludo0 + " " + saludo1 + " " + saludo0 + " " + saludo2);
    }

    public static String SaludoPepito(String Pepito){
        return Pepito;
    }
    
    public static String SaludoJose(String Jose){
        return Jose;
    }

    public static String Saludo(String Hola){
        return Hola;
    }
            
}