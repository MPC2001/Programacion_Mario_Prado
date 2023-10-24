class Tareas {
    private String Nombre;
    private String Descripcion;
    private Boolean Status;

    public Tareas(String nombre, String descripcion, Boolean status) {
        Nombre = nombre;
        Descripcion = descripcion;
        Status = status;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    } 
}