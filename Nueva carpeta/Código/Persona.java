import java.util.ArrayList;

public class Persona {
    
    private String nombre;
    private int edad;
    private ArrayList<Bebida> carrito;
    private ArrayList<Bebida> bebidasCompradas;


    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.carrito = new ArrayList<Bebida>();
        this.bebidasCompradas = new ArrayList<Bebida>();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setBebidaEnCarrito(Bebida bebida){
        this.carrito.add(bebida);
    }

    public void setCompra(Bebida bebida){
    this.bebidasCompradas.add(bebida);
    }


    public ArrayList<Bebida> getCarrito() {
        return carrito;
    }


    public void setCarrito(ArrayList<Bebida> carrito) {
        this.carrito = carrito;
    }


    public ArrayList<Bebida> getBebidasCompradas() {
        return bebidasCompradas;
    }


    public void setBebidasCompradas(ArrayList<Bebida> bebidasCompradas) {
        this.bebidasCompradas = bebidasCompradas;
    }
}
