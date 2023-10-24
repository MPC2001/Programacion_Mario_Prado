public class Persona {

    private String nombrwe;
    private Integer edad;
    
    public Persona(String nombrwe, Integer edad) {
        this.nombrwe = nombrwe;
        this.edad = edad;
    }
    public String getNombrwe() {
        return nombrwe;
    }
    public void setNombrwe(String nombrwe) {
        this.nombrwe = nombrwe;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    
}