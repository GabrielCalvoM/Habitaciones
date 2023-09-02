package habitaciones;

import java.util.ArrayList;

public class Habitacion {
	
	private ArrayList<Puerta> puertas;
	private ArrayList<Ventana> ventanas;
	private ArrayList<Luz> luces;
	private int tamaño;
	private boolean suciedad = false;
	private boolean desague = false;
	private boolean inundación = false;
	
	public Habitacion(int tam) {
		this.tamaño = tam;
	}
	
	public void usarPuerta(Puerta objeto, state estado) {
		objeto.cambiarEstado(estado);
	}
	
	public void limpiar() {
		this.suciedad = true;
	}
	
	public void iluminar(Luz fuente, iluminacion estado) {
		fuente.cambiarEstado(estado);
	}
	
	public void taparTuberias() {
		this.desague = true;
	}
	
	public void ensuciar() {
		this.suciedad = true;
	}
	
	public void inundar() {
		this.inundación = true;
	}
	
}
