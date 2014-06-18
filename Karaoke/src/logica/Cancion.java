package logica;

import java.io.Serializable;
import java.util.ArrayList;

import persistencia.ArchivoPlano;

 public class Cancion implements Serializable {
	 
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	 private String autor ;
	 private Genero genero ;
	 private String ruta;
	 private ArrayList<String> letra ;
	 
	 
	public Cancion(String nombre, String autor, Genero genero, String ruta) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.genero = genero;
		this.ruta = ruta;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public String getRuta() {
		return ruta;
	}


	public void setRuta(String ruta) {
		this.ruta = ruta;
	}


	public ArrayList<String> getLetra() {
		return letra;
	}


	public void setLetra(ArrayList<String> letra) {
		this.letra = letra;
	}
	
	@Override
	public String toString() {
		return nombre + " - " + autor;
		
		}
	
	 public void cargarLetra(){
		 letra = ArchivoPlano.leerArchivoLetra(ruta + ".mp3");
	 }
	 
	 public void limpiarLetra(){
		 letra = null ;
	 }
	 
 }
