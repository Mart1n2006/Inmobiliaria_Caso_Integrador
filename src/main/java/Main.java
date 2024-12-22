import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inmobiliaria inmobiliaria = new Inmobiliaria();

        Propiedad propiedad1 = new Propiedad("001", "Calle Ficticia 123", "123456789", "Centro", "Zona 1", 500, "Casa amplia");
        Propiedad propiedad2 = new Propiedad("002", "Avenida Siempre Viva 456", "987654321", "Sur", "Zona 2", 600, "Apartamento moderno");
        
        ClienteArrendatario arrendatario1 = new ClienteArrendatario("Juan Perez", "123456789", "Calle Ficticia 123", "Ingeniero", "Empresa ABC", "Casa amplia", 2500);
        ClienteArrendatario propietario1 = new ClienteArrendatario("Maria Lopez", "987654321", "Avenida Siempre Viva 456", "Abogada", "Firma X", "Apartamento moderno", 4000);

        inmobiliaria.registrarPropiedad(propiedad1);
        inmobiliaria.registrarPropiedad(propiedad2);
        inmobiliaria.registrarArrendatario(arrendatario1);
        inmobiliaria.registrarArrendatario(propietario1);

        boolean salir = false;
        while (!salir) {
            System.out.println("\nMenu:");
            System.out.println("1. Mostrar catálogo de propiedades");
            System.out.println("2. Agregar propiedad al catálogo");
            System.out.println("3. Modificar precio de propiedad");
            System.out.println("4. Registrar cliente arrendatario");
            System.out.println("5. Mostrar propiedades disponibles");
            System.out.println("6. Registrar propiedad alquilada");
            System.out.println("7. Buscar propiedad por matrícula");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("\nCatálogo de propiedades:");
                    for (Propiedad propiedad : inmobiliaria.getPropiedades()) {
                        System.out.println(propiedad);
                    }
                    break;

                case 2:
                    System.out.print("\nIngrese número de matrícula: ");
                    String numeroMatricula = scanner.nextLine();
                    System.out.print("Ingrese dirección: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Ingrese teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese barrio: ");
                    String barrio = scanner.nextLine();
                    System.out.print("Ingrese zona: ");
                    String zona = scanner.nextLine();
                    System.out.print("Ingrese precio de alquiler: ");
                    int precioAlquiler = scanner.nextInt();
                    scanner.nextLine();  // Limpiar buffer
                    System.out.print("Ingrese descripción de la propiedad: ");
                    String descripcion = scanner.nextLine();

                    Propiedad nuevaPropiedad = new Propiedad(numeroMatricula, direccion, telefono, barrio, zona, precioAlquiler, descripcion);
                    inmobiliaria.registrarPropiedad(nuevaPropiedad);
                    System.out.println("Propiedad agregada al catálogo.");
                    break;

                case 3:
                    System.out.print("\nIngrese número de matrícula de la propiedad a modificar: ");
                    String matriculaModificar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo precio de alquiler: ");
                    int nuevoPrecio = scanner.nextInt();
                    inmobiliaria.modificarPrecioPropiedad(matriculaModificar, nuevoPrecio);
                    break;

                case 4:
                    System.out.print("\nIngrese nombres del arrendatario: ");
                    String nombresArrendatario = scanner.nextLine();
                    System.out.print("Ingrese teléfono: ");
                    String telefonoArrendatario = scanner.nextLine();
                    System.out.print("Ingrese dirección: ");
                    String direccionArrendatario = scanner.nextLine();
                    System.out.print("Ingrese profesión: ");
                    String profesionArrendatario = scanner.nextLine();
                    System.out.print("Ingrese lugar de trabajo: ");
                    String lugarDeTrabajoArrendatario = scanner.nextLine();
                    System.out.print("Ingrese descripción de la propiedad deseada: ");
                    String descripcionPropiedadArrendatario = scanner.nextLine();
                    System.out.print("Ingrese salario: ");
                    int salarioArrendatario = scanner.nextInt();
                    scanner.nextLine();  // Limpiar buffer

                    ClienteArrendatario nuevoArrendatario = new ClienteArrendatario(nombresArrendatario, telefonoArrendatario, direccionArrendatario, profesionArrendatario,
                            lugarDeTrabajoArrendatario, descripcionPropiedadArrendatario, salarioArrendatario);
                    inmobiliaria.registrarArrendatario(nuevoArrendatario);
                    System.out.println("Cliente arrendatario registrado.");
                    break;

                case 5:
                    System.out.println("\nPropiedades disponibles:");
                    inmobiliaria.mostrarPropiedadesDisponibles();
                    break;

                case 6:
                    System.out.print("\nIngrese número de matrícula de la propiedad alquilada: ");
                    String matriculaAlquilada = scanner.nextLine();
                    inmobiliaria.registrarPropiedadAlquilada(matriculaAlquilada);
                    break;

                case 7:
                    System.out.print("\nIngrese número de matrícula: ");
                    String matriculaBuscar = scanner.nextLine();
                    inmobiliaria.buscarPropiedadPorMatricula(matriculaBuscar);
                    break;

                case 8:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
