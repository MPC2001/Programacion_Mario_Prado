//Examen de Mario Prado

public class Contactos {

    private String Nombre;
    private String Telefono;
    private String Mail;

    public Contactos(String nombre, String telefono, String mail) {
        Nombre = nombre;
        Telefono = telefono;
        Mail = mail;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
        if (nombre.isEmpty()) {
            System.out.println("No hay nombres en la lista.");
        }
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
        if (telefono.isEmpty()) {
            System.out.println("No hay telefonos en la lista.");
        }
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
        if (mail.isEmpty()) {
            System.out.println("No hay mail en la lista.");
        }
    }

    
}

