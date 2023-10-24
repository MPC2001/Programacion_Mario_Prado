//Datos de las bebidas
class Bebida{
    private String Marca;
    private String Nombre;
    private Boolean Alcohol;

    public Bebida (String Marca, String Nombre, Boolean Alcohol){
        this.Marca = Marca;
        this.Nombre = Nombre;
        this.Alcohol = Alcohol;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public Boolean getAlcohol() {
        return Alcohol;
    }

    public void setAlcohol(Boolean alcohol) {
        this.Alcohol = alcohol;
    }
}