package presentacion;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JDialog;

import logica.Karaoke;

public class VentanaKaraoke extends JDialog {
	
	private static final long serialVersionUID = 1L;
	
	private PanelArtistas panelArtistas;
	private  PanelCanciones panelCanciones;
	private PanelGeneros panelGeneros;
	private PanelReproduccion panelReproduccion;
	private Karaoke karaoke ;
	
	
	private VentanaKaraoke(){
		karaoke = new Karaoke() ;
		
		panelArtistas = new PanelArtistas();
		//panelFotos.setBackground(Color.red);
		panelArtistas.setSize(200,200 );
		setLayout(new GridLayout(2, 2));
		add(panelArtistas, BorderLayout.CENTER);
		
		panelBotones = new PanelBotones(eventos);
		//panelBotones.setBackground(Color.green);
		add(panelBotones, BorderLayout.SOUTH);
		
		
	}
		
	}
	


