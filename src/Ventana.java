import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Ventana extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblPeso;
    private JLabel lblPlataforma;
    private JLabel lblDesarrollador;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPeso;
    private JTextField txtPlataforma;
    private JTextField txtDesarrollador;
    private JButton btnAgregar;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private ModeloTablaJuego modelo;
    private ArrayList<Videojuego> info;
    private JScrollPane scroll;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 700);
        layout = new GridLayout(2, 1);
        this.setLayout(layout);
        //PANEL 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(188, 227, 166));
        lblId = new JLabel("ID: ");
        txtId = new JTextField(4);
        panel1.add(lblId);
        panel1.add(txtId);
        lblNombre = new JLabel("Nombre: ");
        txtNombre = new JTextField(30);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        lblGenero = new JLabel("Genero: ");
        txtGenero = new JTextField(15);
        panel1.add(lblGenero);
        panel1.add(txtGenero);
        lblPeso = new JLabel("Peso (GB): ");
        txtPeso = new JTextField(5);
        panel1.add(lblPeso);
        panel1.add(txtPeso);
        lblPlataforma = new JLabel("Plataforma: ");
        txtPlataforma = new JTextField(15);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);
        lblDesarrollador = new JLabel("Desarrollador: ");
        txtDesarrollador = new JTextField(25);
        panel1.add(lblDesarrollador);
        panel1.add(txtDesarrollador);
        btnAgregar = new JButton("Agregar juego");
        panel1.add(btnAgregar);

        this.getContentPane().add(panel1, 0);

        //PANEL 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(201, 195, 241));
        this.getContentPane().add(panel2, 1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
