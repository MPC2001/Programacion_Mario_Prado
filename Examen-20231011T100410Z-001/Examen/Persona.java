//Datos de las personas

import javax.swing.JOptionPane;

class Persona{
    private String Nombre;
    private Integer Edad;


    public Persona (String Nombre, Integer Edad){
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        this.Edad = edad;
    }
}

    //////////////////////////////////////////////////////////////////////////////////////////////////////////