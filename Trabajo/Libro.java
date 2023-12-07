
public class Libro {
    private int ID;
    private String Nombre;
    private String Autor;

    public Libro(int iD, String nombre, String autor) {
        ID = iD;
        Nombre = nombre;
        Autor = autor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String Libreria (){
        return " ID: " + ID      + " Autor: " + Autor      + " Libro: " + Nombre;

    }
}





//crear case libreria que tenga (añadir libro, buscar oir autor, buscar por el otro y enmseñar todo

//modificar esta clase para que tenga el atributo cantidad t que pregunte el programa cuantos quiero añadir