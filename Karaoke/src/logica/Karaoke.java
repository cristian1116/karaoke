package logica;

import java.io.File;
import java.util.ArrayList;

	public class Karaoke {
		
		private ArrayList<Cancion> listaCanciones;
		
	public Karaoke() {
		listaCanciones = new ArrayList<>();
		File carpeta = new File("");
		String [] listaCanciones = carpeta.list();
		for(String string :listaCanciones){
			if(string.endsWith(".canc")){   // Comprueba si la cadena termina con el sufijo pasado como parámetro.
				System.out.println(string);
			}
		}
	}
	
	
}
