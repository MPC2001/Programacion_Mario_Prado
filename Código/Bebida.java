public class Bebida {

    private String nombre, marca;
    private Boolean tieneAlcohol;

    public Bebida(String nombre, String marca, Boolean tieneAlcohol) {
        this.nombre = nombre;
        this.marca = marca;
        this.tieneAlcohol = tieneAlcohol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getTieneAlcohol() {
        return tieneAlcohol;
    }

    public void setTieneAlcohol(Boolean tieneAlcohol) {
        this.tieneAlcohol = tieneAlcohol;
    } 
    
}