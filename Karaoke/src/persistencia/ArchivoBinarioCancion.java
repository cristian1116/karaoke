package persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import logica.Cancion;

public class ArchivoBinarioCancion {
	
	public static void crearArchivoCancion(Cancion cancion ,String ruta ){
		
		File  archivo = new File(ruta);
		FileOutputStream fileOutputStream = null ;
		ObjectOutputStream objectOutputStream = null ;
		
		try {
			fileOutputStream = new FileOutputStream(archivo);
		} catch (FileNotFoundException e) {
		
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		try {
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		 try {
			fileOutputStream.close();
			 objectOutputStream.close();
		} catch (IOException e) {
				e.printStackTrace();
		}
		 
	}
	
	public static Cancion leerArchivoCancion(String ruta){
		File archivo = new File(ruta);
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			fileInputStream = new FileInputStream(archivo);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		try {
			objectInputStream = new ObjectInputStream(fileInputStream);
			try {
				return (Cancion) objectInputStream.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		try {
			fileInputStream.close();
			objectInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
		
	
	

}
