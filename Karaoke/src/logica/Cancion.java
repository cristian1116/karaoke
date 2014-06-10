package logica;

import java.util.ArrayList;

public class Cancion {
	private String nombre;
	private int  duracion;
	private int numeroLineaActual;
	private String imagen;
	private ArrayList<Cancion> letracancion;

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getNumeroLineaActual() {
		return numeroLineaActual;
	}
	public void setNumeroLineaActual(int numeroLineaActual) {
		this.numeroLineaActual = numeroLineaActual;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public ArrayList<Cancion> getLetracancion() {
		return letracancion;
	}
	public void setLetracancion(ArrayList<Cancion> letracancion) {
		this.letracancion = letracancion;
	}
	
	
	 
	
	
	
	

}
