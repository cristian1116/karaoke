package presentacion;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	public VentanaPrincipal() {
		setTitle("karaoke");
		setSize(1000, 500);
		getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

}
}