import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {
    private Inmobiliaria inmobiliaria;

    private JTextArea textArea;
    private JTextField campoMatricula, campoDireccion, campoTelefono, campoBarrio, campoZona, campoPrecio, campoDescripcion;
    private JTextField campoNombresArrendatario, campoTelefonoArrendatario, campoDireccionArrendatario, campoProfesionArrendatario, campoTrabajoArrendatario, campoDescripcionArrendatario, campoSalarioArrendatario;

    public Interfaz() {
        inmobiliaria = new Inmobiliaria();

        setTitle("Inmobiliaria");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(5, 2));

        JButton btnMostrarCatalogo = new JButton("Mostrar Catálogo");
        JButton btnRegistrarPropiedad = new JButton("Registrar Propiedad");
        JButton btnModificarPrecio = new JButton("Modificar Precio");
        JButton btnRegistrarArrendatario = new JButton("Registrar Arrendatario");
        JButton btnMostrarDisponibles = new JButton("Mostrar Disponibles");
        JButton btnAlquilarPropiedad = new JButton("Alquilar Propiedad");
        JButton btnBuscarPropiedad = new JButton("Buscar Propiedad");

        panelBotones.add(btnMostrarCatalogo);
        panelBotones.add(btnRegistrarPropiedad);
        panelBotones.add(btnModificarPrecio);
        panelBotones.add(btnRegistrarArrendatario);
        panelBotones.add(btnMostrarDisponibles);
        panelBotones.add(btnAlquilarPropiedad);
        panelBotones.add(btnBuscarPropiedad);

        add(panelBotones, BorderLayout.NORTH);

        JPanel panelRegistro = new JPanel(new GridLayout(7, 2));
        campoMatricula = new JTextField();
        campoDireccion = new JTextField();
        campoTelefono = new JTextField();
        campoBarrio = new JTextField();
        campoZona = new JTextField();
        campoPrecio = new JTextField();
        campoDescripcion = new JTextField();

        panelRegistro.add(new JLabel("Matrícula:"));
        panelRegistro.add(campoMatricula);
        panelRegistro.add(new JLabel("Dirección:"));
        panelRegistro.add(campoDireccion);
        panelRegistro.add(new JLabel("Teléfono:"));
        panelRegistro.add(campoTelefono);
        panelRegistro.add(new JLabel("Barrio:"));
        panelRegistro.add(campoBarrio);
        panelRegistro.add(new JLabel("Zona:"));
        panelRegistro.add(campoZona);
        panelRegistro.add(new JLabel("Precio Alquiler:"));
        panelRegistro.add(campoPrecio);
        panelRegistro.add(new JLabel("Descripción:"));
        panelRegistro.add(campoDescripcion);

        JPanel panelArrendatario = new JPanel(new GridLayout(7, 2));
        campoNombresArrendatario = new JTextField();
        campoTelefonoArrendatario = new JTextField();
        campoDireccionArrendatario = new JTextField();
        campoProfesionArrendatario = new JTextField();
        campoTrabajoArrendatario = new JTextField();
        campoDescripcionArrendatario = new JTextField();
        campoSalarioArrendatario = new JTextField();

        panelArrendatario.add(new JLabel("Nombres:"));
        panelArrendatario.add(campoNombresArrendatario);
        panelArrendatario.add(new JLabel("Teléfono:"));
        panelArrendatario.add(campoTelefonoArrendatario);
        panelArrendatario.add(new JLabel("Dirección:"));
        panelArrendatario.add(campoDireccionArrendatario);
        panelArrendatario.add(new JLabel("Profesión:"));
        panelArrendatario.add(campoProfesionArrendatario);
        panelArrendatario.add(new JLabel("Trabajo:"));
        panelArrendatario.add(campoTrabajoArrendatario);
        panelArrendatario.add(new JLabel("Descripción Propiedad:"));
        panelArrendatario.add(campoDescripcionArrendatario);
        panelArrendatario.add(new JLabel("Salario:"));
        panelArrendatario.add(campoSalarioArrendatario);

        btnMostrarCatalogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                for (Propiedad propiedad : inmobiliaria.getPropiedades()) {
                    textArea.append(propiedad + "\n");
                }
            }
        });

        btnRegistrarPropiedad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String matricula = campoMatricula.getText();
                String direccion = campoDireccion.getText();
                String telefono = campoTelefono.getText();
                String barrio = campoBarrio.getText();
                String zona = campoZona.getText();
                int precio = Integer.parseInt(campoPrecio.getText());
                String descripcion = campoDescripcion.getText();

                Propiedad propiedad = new Propiedad(matricula, direccion, telefono, barrio, zona, precio, descripcion);
                inmobiliaria.registrarPropiedad(propiedad);
                textArea.setText("Propiedad registrada: " + propiedad);
            }
        });

        btnModificarPrecio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String matricula = campoMatricula.getText();
                int nuevoPrecio = Integer.parseInt(campoPrecio.getText());
                inmobiliaria.modificarPrecioPropiedad(matricula, nuevoPrecio);
            }
        });

        btnRegistrarArrendatario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombres = campoNombresArrendatario.getText();
                String telefono = campoTelefonoArrendatario.getText();
                String direccion = campoDireccionArrendatario.getText();
                String profesion = campoProfesionArrendatario.getText();
                String lugarDeTrabajo = campoTrabajoArrendatario.getText();
                String descripcionPropiedad = campoDescripcionArrendatario.getText();
                int salario = Integer.parseInt(campoSalarioArrendatario.getText());

                ClienteArrendatario arrendatario = new ClienteArrendatario(nombres, telefono, direccion, profesion, lugarDeTrabajo, descripcionPropiedad, salario);
                inmobiliaria.registrarArrendatario(arrendatario);
                textArea.setText("Arrendatario registrado: " + arrendatario);
            }
        });

        btnMostrarDisponibles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                for (Propiedad propiedad : inmobiliaria.getPropiedades()) {
                    if (propiedad.getPrecioAlquiler() > 0) {
                        textArea.append(propiedad + "\n");
                    }
                }
            }
        });

        btnAlquilarPropiedad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String matricula = campoMatricula.getText();
                inmobiliaria.registrarPropiedadAlquilada(matricula);
            }
        });

        btnBuscarPropiedad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String matricula = campoMatricula.getText();
                inmobiliaria.buscarPropiedadPorMatricula(matricula);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Interfaz();
    }
}
