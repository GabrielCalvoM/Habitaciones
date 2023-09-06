package habitaciones;

public class Habitacion {
	
	private Puerta puerta = new Puerta(this);
	private Ventana ventana = new Ventana();
	private Luz luz = new Luz();
	private int tamaño;
	private Afectacion suciedad = Afectacion.noAfecta;
	private Afectacion desague = Afectacion.noAfecta;
	private Afectacion inundacion = Afectacion.noAfecta;
	private Afectacion agua = Afectacion.noAfecta;
	private Afectacion electricidad = Afectacion.noAfecta;
	
	public Habitacion(int tam) {
		this.tamaño = tam;
	}
	
	public void usarPuerta(state estado) {
		this.puerta.cambiarEstado(estado);
	}
	
	public void usarVentana(state estado) {
		this.ventana.cambiarEstado(estado);
	}

	public void iluminar(iluminacion estado) {
		this.luz.cambiarEstado(estado);
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

		if (this.electricidad == Afectacion.afecta) {
			this.electricidad = Afectacion.noAfecta;
			luz.cambiarEstado(iluminacion.encendido);
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
			}
		}
		
		else if (cualidad == Cualidad.agua) {
			cambio = this.agua;
		}
		
		else if (cualidad == Cualidad.luz) {
			cambio = this.electricidad;
			luz.cambiarEstado(iluminacion.apagado);
		}
		
		if (cambio == Afectacion.noAfecta) {
			cambio = Afectacion.afecta;
		}
		
		this.solucionProblemas();
	}
	
	public boolean flujo(Habitacion h1) {
		if (ventana.compartirEstado() == state.abierto) {
			return true;
		}
		
		
		if (puerta.compartirEstado() == state.abierto) {
			return true;
		}
		
		return false;
	}
	
}
