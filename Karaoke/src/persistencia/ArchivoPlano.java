package persistencia;

import java.awt.image.BufferedImageOp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoPlano {
	
	public static void crearArchivoLetra(String letra, String ruta){
		
		File archivo = new File(ruta);
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter(archivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			fileWriter.write(letra);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
			
		}
	
	public static ArrayList<String> leerArchivoLetra(String ruta){
		File archivo = new File(ruta);
		FileReader fileReader = null;
		
		ArrayList<String> letra = new ArrayList<String>();
		
		try {
			fileReader = new FileReader(archivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String linea = null ;
		
		try {
			while((linea = bufferedReader.readLine()) != null){
				letra.add(linea);
			}
			return letra;
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
