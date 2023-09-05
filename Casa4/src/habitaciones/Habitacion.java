package habitaciones;

import java.util.ArrayList;

public class Habitacion {
	
	private ArrayList<Puerta> puertas;
	private ArrayList<Ventana> ventanas;
	private ArrayList<Luz> luces;
	private int tamaño;
	private Afectacion suciedad = Afectacion.noAfecta;
	private Afectacion desague = Afectacion.noAfecta;
	private Afectacion inundacion = Afectacion.noAfecta;
	private Afectacion agua = Afectacion.noAfecta;
	private Afectacion luz = Afectacion.noAfecta;
	
	public Habitacion(int tam) {
		this.tamaño = tam;
	}
	
	public void agregarPuerta(Puerta objeto) {
		this.puertas.add(objeto);
	}
	
	public void agregarVentana(Ventana objeto) {
		this.ventanas.add(objeto);
	}

	public void agregarLuz(Luz objeto) {
		this.luces.add(objeto);
	}

	public void enlazar(Habitacion habitacion2) {
		if (puertas.isEmpty() == false) {
			Puerta h1 = puertas.get(0);
			int largo = puertas.size();
			int i = 1;
			
			while ((h1.enlazado() == false) && (i < largo)) {
				ArrayList<Puerta> puertas2 = habitacion2.puertas;
			
				if (puertas2.isEmpty() == false) {
					Puerta h2 = puertas2.get(0);
					int largo2 = puertas2.size();
					int j = 1;
					
					while ((h2.enlazado() == false) && (j < largo2)) {
						h1.enlace(h2);
						h2 = puertas.get(j);
						j += 1;
					}
				}
			}
		}
	}
	
	public void usarPuerta(Puerta objeto, state estado) {
		objeto.cambiarEstado(estado);
	}
	
	public void usarVentana(Ventana objeto, state estado) {
		objeto.cambiarEstado(estado);
	}

	public void iluminar(Luz fuente, iluminacion estado) {
		fuente.cambiarEstado(estado);
	}
	
	public void solucionProblemas() {
		if (this.suciedad == Afectacion.afecta) {
			this.suciedad = Afectacion.noAfecta;
		}

		if (this.desague == Afectacion.afecta) {
			this.desague = Afectacion.noAfecta;
		}

		if (this.inundacion == Afectacion.afecta) {
			this.inundacion = Afectacion.noAfecta;
		}

		if (this.luz == Afectacion.afecta) {
			this.luz = Afectacion.noAfecta;
			for (Luz luz : luces) {
				luz.cambiarEstado(iluminacion.encendido);
			}
		}

		if (this.agua == Afectacion.afecta) {
			this.agua = Afectacion.noAfecta;
		}
	}
	
	public void afectarEvento(Cualidad cualidad) {
		Afectacion cambio = Afectacion.noAfecta;
		
		if (cualidad == Cualidad.suciedad) {
			cambio = this.suciedad;
		}
		
		else if (cualidad == Cualidad.desague) {
			cambio = this.desague;
		}
		
		else if (cualidad == Cualidad.inundacion) {
			if (this.flujo(this)) {
				cambio = this.inundacion;
				for (Puerta puerta : puertas) {
					Habitacion h2 = puerta.conectividad();
					h2.afectarEvento(Cualidad.inundacion);
				}
			}
		}
		
		else if (cualidad == Cualidad.agua) {
			cambio = this.agua;
		}
		
		else if (cualidad == Cualidad.luz) {
			cambio = this.luz;
			for (Luz luz : luces) {
				luz.cambiarEstado(iluminacion.apagado);
			}
		}
		
		if (cambio == Afectacion.noAfecta) {
			cambio = Afectacion.afecta;
		}
	}
	
	public boolean flujo(Habitacion h1) {
		for (Ventana ventana : ventanas) {
			if (ventana.compartirEstado() == state.abierto) {
				return true;
			}
		}
		
		for (Puerta puerta : puertas) {
			if (puerta.enlazado()) {
				if (puerta.compartirEstado() == state.abierto) {
					Habitacion h2 = puerta.conectividad();
					if (h2 != h1) {
						if (h2 == null) {
							return true;
						}
						
						else {
							h2.flujo(this);
						}
					}
				}
			}
		}
		
		return false;
	}
	
}
