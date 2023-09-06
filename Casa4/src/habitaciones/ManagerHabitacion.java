package habitaciones;

public class ManagerHabitacion {
	
	public void abrirPuerta(Habitacion habitacion, Puerta objeto) {
		habitacion.usarPuerta(state.abierto);
	}

	public void cerrarPuerta(Habitacion habitacion, Puerta objeto) {
		habitacion.usarPuerta(state.cerrado);
	}

	public void abrirVentana(Habitacion habitacion, Ventana objeto) {
		habitacion.usarVentana(state.abierto);
	}

	public void cerrarVentana(Habitacion habitacion, Ventana objeto) {
		habitacion.usarVentana(state.cerrado);
	}

	public void iluminar(Habitacion habitacion, Luz objeto) {
		habitacion.iluminar(iluminacion.encendido);
	}

	public void oscurecer(Habitacion habitacion, Luz objeto) {
		habitacion.iluminar(iluminacion.apagado);
	}
	
	public void ensuciar(Habitacion habitacion) {
		habitacion.afectarEvento(Cualidad.suciedad);
	}
	
	public void taquear(Habitacion habitacion) {
		habitacion.afectarEvento(Cualidad.desague);
	}
	
	public void inundar(Habitacion habitacion) {
		habitacion.afectarEvento(Cualidad.inundacion);
	}
	
	public void cortarLuz(Habitacion habitacion) {
		habitacion.afectarEvento(Cualidad.luz);
	}
	
	public void cortarAgua(Habitacion habitacion) {
		habitacion.afectarEvento(Cualidad.agua);
	}
	
	public void contramedidas(Habitacion habitacion) {
		habitacion.solucionProblemas();
	}
	
}
