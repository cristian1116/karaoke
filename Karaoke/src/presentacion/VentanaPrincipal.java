package presentacion;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import logica.Cancion;
import logica.Genero;
import logica.Karaoke;

public class VentanaPrincipal extends JFrame implements ActionListener{
	
	private JTextField txNombre;
	private JTextField txAutor ;
	private JComboBox<Genero> boxGenero;
	private JTextArea txArea;
	private JButton btnGuardar;
	public static final String COMANDO_BOTON_GUARDAR = "Guardar";
	private Karaoke karaoke ;
	
	public VentanaPrincipal() {
		karaoke = new Karaoke();
		setTitle("karaoke");
		setSize(500, 500);
		setLayout(new GridLayout(5,1));
		getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		txNombre = new JTextField();
		txNombre.setBorder(BorderFactory.createTitledBorder("Nombre"));
		txNombre.setBackground(Color.decode("#819FF7"));
		add(txNombre);
		
		txAutor = new JTextField();
		txAutor.setBorder(BorderFactory.createTitledBorder("Autor"));
		txAutor.setBackground(Color.decode("#F2F5A9"));
		add(txAutor);
		
		boxGenero = new JComboBox<>(Genero.values());
		boxGenero.setBorder(BorderFactory.createTitledBorder("Genero"));
		boxGenero.setBackground(Color.decode("#F79F81"));
		add(boxGenero);
		
		txArea = new JTextArea();
		txArea.setBorder(BorderFactory.createTitledBorder("Letra"));
		boxGenero.setBackground(Color.decode("#58FAD0"));
		add(txArea);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setActionCommand("GUARDAR");
		boxGenero.setBackground(Color.decode("#F781D8"));
		btnGuardar.addActionListener(this);
		add(btnGuardar);

		
		
		}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("GUARDAR")) {
			JFileChooser jFileChooser = new JFileChooser("./");
			int opcion = jFileChooser.showSaveDialog(this);
			if (opcion == JFileChooser.APPROVE_OPTION) {
				String ruta = jFileChooser.getSelectedFile().getPath();
				Cancion cancion =  new Cancion(txNombre.getText(), txAutor.getText(), (Genero)boxGenero.getSelectedItem(), ruta);
				karaoke.agregarCancion(txArea.getText(), cancion, ruta);
			}
		
		}
	}
	
	
}