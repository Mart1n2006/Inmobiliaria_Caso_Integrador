public class Propiedad {
    private String numeroMatricula;
    private String direccion;
    private String telefono;
    private String barrio;
    private String zona;
    private int precioAlquiler;
    private String descripcion;

    public Propiedad(String numeroMatricula, String direccion, String telefono, String barrio, String zona, int precioAlquiler, String descripcion) {
        this.numeroMatricula = numeroMatricula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.barrio = barrio;
        this.zona = zona;
        this.precioAlquiler = precioAlquiler;
        this.descripcion = descripcion;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "numeroMatricula='" + numeroMatricula + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", barrio='" + barrio + '\'' +
                ", zona='" + zona + '\'' +
                ", precioAlquiler=" + precioAlquiler +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
