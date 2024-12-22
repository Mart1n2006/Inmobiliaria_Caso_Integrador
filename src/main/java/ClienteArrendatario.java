public class ClienteArrendatario {
    private String nombres;
    private String telefono;
    private String direccion;
    private String profesion;
    private String lugarDeTrabajo;
    private String descripcionPropiedad;
    private int salario;

    public ClienteArrendatario(String nombres, String telefono, String direccion, String profesion, String lugarDeTrabajo, String descripcionPropiedad, int salario) {
        this.nombres = nombres;
        this.telefono = telefono;
        this.direccion = direccion;
        this.profesion = profesion;
        this.lugarDeTrabajo = lugarDeTrabajo;
        this.descripcionPropiedad = descripcionPropiedad;
        this.salario = salario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }

    public void setLugarDeTrabajo(String lugarDeTrabajo) {
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    public String getDescripcionPropiedad() {
        return descripcionPropiedad;
    }

    public void setDescripcionPropiedad(String descripcionPropiedad) {
        this.descripcionPropiedad = descripcionPropiedad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ClienteArrendatario{" +
                "nombres='" + nombres + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", profesion='" + profesion + '\'' +
                ", lugarDeTrabajo='" + lugarDeTrabajo + '\'' +
                ", descripcionPropiedad='" + descripcionPropiedad + '\'' +
                ", salario=" + salario +
                '}';
    }
}
