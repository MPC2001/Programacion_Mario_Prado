public class Prcaticar {

    public static void main (String [] args){
        Persona P1 = new Persona("Pepe", 50);
        Persona P2 = new Persona("Pepe", 60);
        Persona P3 = new Persona("Pepe", 70);
        Persona P4 = new Persona("Pepe", 80);
        Persona P5 = new Persona("Pepe", 90);

        Dinero D1 = new Dinero(50);
        Dinero D2 = new Dinero(100);
        Dinero D3 = new Dinero(150);
        Dinero D4 = new Dinero(200);
        Dinero D5 = new Dinero(250);



        System.out.println("La persona " + P1.getNombrwe() + " quiere sacar " + D1.getdinero());
        if (P1.getEdad() >= 80 && D1.getdinero() >= 150){
            System.out.println("No puedes sacar tanto dinero");
        } else {
            System.out.println("Operacion exitosa");
        }

        System.out.println("La persona " + P2.getNombrwe() + " quiere sacar " + D2.getdinero());
        if (P2.getEdad() >= 80 && D2.getdinero() >= 150){
            System.out.println("No puedes sacar tanto dinero");
        } else {
            System.out.println("Operacion exitosa");
        }

        System.out.println("La persona " + P3.getNombrwe() + " quiere sacar " + D3.getdinero());
        if (P3.getEdad() >= 80 && D3.getdinero() >= 150){
            System.out.println("No puedes sacar tanto dinero");
        } else {
            System.out.println("Operacion exitosa");
        }

        System.out.println("La persona " + P4.getNombrwe() + " quiere sacar " + D4.getdinero());
        if (P4.getEdad() >= 80 && D4.getdinero() >= 150){
            System.out.println("No puedes sacar tanto dinero");
        } else {
            System.out.println("Operacion exitosa");
        }

        System.out.println("La persona " + P5.getNombrwe() + " quiere sacar " + D5.getdinero());
        if (P5.getEdad() >= 80 && D5.getdinero() >= 150){
            System.out.println("No puedes sacar tanto dinero");
        } else {
            System.out.println("Operacion exitosa");
        }
    }
}