import java.util.ArrayList;
import java.util.List;

public class Inmobiliaria {
    private List<Propiedad> propiedades;
    private List<ClienteArrendatario> arrendatarios;

    public Inmobiliaria() {
        propiedades = new ArrayList<>();
        arrendatarios = new ArrayList<>();
    }

    public void registrarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }

    public void registrarArrendatario(ClienteArrendatario arrendatario) {
        arrendatarios.add(arrendatario);
    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void modificarPrecioPropiedad(String numeroMatricula, int nuevoPrecio) {
        for (Propiedad propiedad : propiedades) {
            if (propiedad.getNumeroMatricula().equals(numeroMatricula)) {
                propiedad.setPrecioAlquiler(nuevoPrecio);
                System.out.println("Precio de propiedad actualizado.");
                return;
            }
        }
        System.out.println("Propiedad no encontrada.");
    }

    public void mostrarPropiedadesDisponibles() {
        for (Propiedad propiedad : propiedades) {
            if (propiedad.getPrecioAlquiler() > 0) {
                System.out.println(propiedad);
            }
        }
    }

    public void registrarPropiedadAlquilada(String matricula) {
        for (Propiedad propiedad : propiedades) {
            if (propiedad.getNumeroMatricula().equals(matricula)) {
                propiedad.setPrecioAlquiler(0);
                System.out.println("Propiedad alquilada: " + propiedad);
                return;
            }
        }
        System.out.println("Propiedad no encontrada.");
    }

    public void buscarPropiedadPorMatricula(String matricula) {
        for (Propiedad propiedad : propiedades) {
            if (propiedad.getNumeroMatricula().equals(matricula)) {
                System.out.println("Propiedad encontrada: " + propiedad);
                return;
            }
        }
        System.out.println("Propiedad no encontrada.");
    }
}
