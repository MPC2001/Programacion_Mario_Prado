public class examen {

    public static void main(String[] args) {

        // Creamos las bebidas
        Bebida b0 = new Bebida("Agua", "Solan de Cabras", false);
        Bebida b1 = new Bebida("Fanta de limon", "Fanta", false);
        Bebida b2 = new Bebida("Fanta de naranja", "Fanta", false);
        Bebida b3 = new Bebida("CocaCola zero", "CocaCola", false);
        Bebida b4 = new Bebida("CocaCola light", "CocaCola", false);
        Bebida b5 = new Bebida("Gin", "Puerto de Indias", true);
        Bebida b6 = new Bebida("Vodka", "Absolut", true);
        Bebida b7 = new Bebida("Whiskey", "Jhonnie Walker", true);
        Bebida b8 = new Bebida("Jager", "Jager", true);
        Bebida b9 = new Bebida("Cerveza", "Mahou", true);

        // Creamos a las personas
        Persona p0 = new Persona("Cesar", 10);
        Persona p1 = new Persona("Pedro", 15);
        Persona p2 = new Persona("Juan", 16);
        Persona p3 = new Persona("Carlos", 17);
        Persona p4 = new Persona("David", 18);
        Persona p5 = new Persona("Maria", 19);
        Persona p6 = new Persona("Carla", 20);
        Persona p7 = new Persona("Mayte", 21);
        Persona p8 = new Persona("Fran", 22);
        Persona p9 = new Persona("Carmen", 23);

        // Rellenamos carritos
        p1.setBebidaEnCarrito(b0);
        p1.setBebidaEnCarrito(b6);
        p1.setBebidaEnCarrito(b4);

        p2.setBebidaEnCarrito(b8);
        p2.setBebidaEnCarrito(b2);
        p2.setBebidaEnCarrito(b5);

        p9.setBebidaEnCarrito(b8);
        p9.setBebidaEnCarrito(b9);
        p9.setBebidaEnCarrito(b0);

        // Comprobamos si puede comprar
        for (int i = 0; i < p1.getCarrito().size(); i++) {
            Bebida bebidaEnCarro = p1.getCarrito().get(i);

            if (p1.getEdad() < 18 && bebidaEnCarro.getTieneAlcohol()) {
                System.out.println("Lo siento, no puedo venderte el producto " + bebidaEnCarro.getNombre());
            } else {
                System.out.println("Vendiendo ...");
                p1.setCompra(bebidaEnCarro);
            }
        }

        for (int i = 0; i < p2.getCarrito().size(); i++) {
            Bebida bebidaEnCarro = p2.getCarrito().get(i);

            if (p2.getEdad() < 18 && bebidaEnCarro.getTieneAlcohol()) {
                System.out.println("Lo siento, no puedo venderte el producto " + bebidaEnCarro.getNombre());
            } else {
                System.out.println("Vendiendo ...");
                p2.setCompra(bebidaEnCarro);
            }
        }

        for (int i = 0; i < p9.getCarrito().size(); i++) {
            Bebida bebidaEnCarro = p9.getCarrito().get(i);

            if (p9.getEdad() < 18 && bebidaEnCarro.getTieneAlcohol()) {
                System.out.println("Lo siento, no puedo venderte el producto " + bebidaEnCarro.getNombre());
            } else {
                System.out.println("Vendiendo ...");
                p9.setCompra(bebidaEnCarro);
            }
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // Mostramos lo que tiene cada persona
        System.out.println(p1.getNombre() + " ha comprado:");
        for (int i = 0; i < p1.getBebidasCompradas().size(); i++) {
            System.out.println(p1.getBebidasCompradas().get(i).getNombre());
        }

        System.out.println(p2.getNombre() + " ha comprado:");
        for (int i = 0; i < p2.getBebidasCompradas().size(); i++) {
            System.out.println(p2.getBebidasCompradas().get(i).getNombre());
        }

        System.out.println(p9.getNombre() + " ha comprado:");
        for (int i = 0; i < p9.getBebidasCompradas().size(); i++) {
            System.out.println(p9.getBebidasCompradas().get(i).getNombre());
        }

    }

}